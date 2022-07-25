package cj.life.middle.apc.service.impl;

import cj.life.ability.api.exception.ApiException;
import cj.life.middle.apc.domain.ApcChannel;
import cj.life.middle.apc.domain.ApcChannelExample;
import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.MtPortletChannel;
import cj.life.middle.apc.repository.mapper.ApcChannelMapper;
import cj.life.middle.apc.repository.mapper.MtPortletChannelMapper;
import cj.life.middle.apc.service.IChannelService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChannelService implements IChannelService {
    @Resource
    ApcChannelMapper channelMapper;
    @Resource
    MtPortletChannelMapper portletChannelMapper;

    @Override
    public String createChannel(String channelName, int orderNum, String note) {
        if (existsChannelName(channelName)) {
            throw new ApiException("5000", "The name of channel already exist.");
        }
        String idNumSeq = null;
        while (true) {
            idNumSeq = RandomStringUtils.randomNumeric(20);
            ApcChannelExample example = new ApcChannelExample();
            example.createCriteria().andChannelIdEqualTo(idNumSeq);
            long count = channelMapper.countByExample(example);
            if (count < 1) {
                break;
            }
        }
        ApcChannel channel = new ApcChannel();
        channel.setChannelId(idNumSeq);
        channel.setChannelName(channelName);
        channel.setOrderNum(orderNum);
        channel.setNote(note);
        channelMapper.insertSelective(channel);
        return idNumSeq;
    }

    private boolean existsChannelName(String channelName) {
        ApcChannelExample example = new ApcChannelExample();
        example.createCriteria().andChannelNameEqualTo(channelName);
        return channelMapper.countByExample(example) > 0;
    }

    @Override
    public void removeChannel(String channelId) {
        channelMapper.deleteByPrimaryKey(channelId);
    }

    @Override
    public void setOrderNum(String channelId, int orderNum) {
        channelMapper.setOrderNum(channelId, orderNum);
    }

    @Override
    public List<ApcChannel> listChannel() {
        ApcChannelExample example = new ApcChannelExample();
        example.createCriteria();
        example.setOrderByClause("order_num asc");
        return channelMapper.selectByExample(example);
    }

    @Override
    public void mountPortletToChannel(String portletId, String channelId, int orderNum) {
        MtPortletChannel mtPortletChannel = new MtPortletChannel();
        mtPortletChannel.setChannelId(channelId);
        mtPortletChannel.setPortletId(portletId);
        mtPortletChannel.setOrderNum(orderNum);
        portletChannelMapper.insertSelective(mtPortletChannel);
    }

    @Override
    public void unmountPortletFromChannel(String portletId, String channelId) {
        portletChannelMapper.deleteByPrimaryKey(portletId, channelId);
    }

    @Override
    public void setOrderNumOfPortletOnChannel(String portletId, String channelId, int orderNum) {
        portletChannelMapper.setOrderNum(portletId, channelId, orderNum);
    }

    @Override
    public List<ApcPortlet> listPortletOfChannel(String channelId) {
        return portletChannelMapper.listPortletOfChannel(channelId);
    }

    @Override
    public List<ApcChannel> listChannelByPortlet(String portletId) {
        return portletChannelMapper.listChannelByPortlet(portletId);
    }
}
