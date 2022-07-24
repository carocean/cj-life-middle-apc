package cj.life.middle.apc.service.impl;

import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.ApcPortletExample;
import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.domain.MtPortletApp;
import cj.life.middle.apc.repository.mapper.ApcPortletMapper;
import cj.life.middle.apc.repository.mapper.MtPortletAppMapper;
import cj.life.middle.apc.service.IPortletService;
import cj.life.middle.apc.util.IDateUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class PortletService implements IPortletService {
    @Resource
    ApcPortletMapper portletMapper;
    @Resource
    MtPortletAppMapper portletAppMapper;

    @Override
    public String createPortlet(String portletName, String showMode, String portletNote) {
        String idNumSeq = null;
        while (true) {
            idNumSeq = RandomStringUtils.randomNumeric(20);
            ApcPortletExample example = new ApcPortletExample();
            example.createCriteria().andPortletIdEqualTo(idNumSeq);
            long count = portletMapper.countByExample(example);
            if (count < 1) {
                break;
            }
        }
        ApcPortlet portlet = new ApcPortlet();
        portlet.setPortletId(idNumSeq);
        portlet.setPortletName(portletName);
        portlet.setShowMode(showMode);
        portlet.setCreateTime(IDateUtil.toDateEndMicoSecond(System.currentTimeMillis()));
        portlet.setPortletNote(portletNote);
        portletMapper.insertSelective(portlet);
        return idNumSeq;
    }

    @Override
    public List<String> enumShowModes() {
        return Arrays.asList("list", "alone", "waterfall");
    }

    @Override
    public void removePortlet(String portletId) {
        portletMapper.deleteByPrimaryKey(portletId);
    }

    @Override
    public void setShowMode(String portletId, String showMode) {
        portletMapper.setShowMode(portletId, showMode);
    }

    @Override
    public List<ApcPortlet> listPortlet(int limit, long offset) {
        return portletMapper.listPortlet(limit, offset);
    }

    @Override
    public List<ApcPortlet> listPortletByShowMode(String showMode, int limit, long offset) {
        return portletMapper.listPortletByShowMode(showMode, limit, offset);
    }

    @Override
    public void mountAppToPortlet(String appId, String portletId, int orderNum) {
        MtPortletApp portletApp = new MtPortletApp();
        portletApp.setAppId(appId);
        portletApp.setPortletId(portletId);
        portletApp.setOrderNum(orderNum);
        portletAppMapper.insertSelective(portletApp);
    }

    @Override
    public void unmountAppToPortlet(String appId, String portletId) {
        portletAppMapper.deleteByPrimaryKey(portletId, appId);
    }

    @Override
    public List<FactApp> listAppByPortlet(String portletId, int limit, long offset) {
        return portletAppMapper.listAppByPortlet(portletId, limit, offset);
    }

    @Override
    public List<ApcPortlet> listPortletByApp(String appId) {
        return portletAppMapper.listPortletByApp(appId);
    }
}
