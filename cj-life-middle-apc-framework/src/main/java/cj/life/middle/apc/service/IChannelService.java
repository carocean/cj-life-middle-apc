package cj.life.middle.apc.service;

import cj.life.middle.apc.domain.ApcChannel;
import cj.life.middle.apc.domain.ApcPortlet;

import java.util.List;

public interface IChannelService {
    String createChannel(String channelName, int orderNum, String note);

    void removeChannel(String channelId);

    void setOrderNum(String channelId, int orderNum);

    List<ApcChannel> listChannel();

    void mountPortletToChannel(String portletId, String channelId,int orderNum);

    void unmountPortletFromChannel(String portletId, String channelId);
    void setOrderNumOfPortletOnChannel(String portletId, String channelId,int orderNum);
    List<ApcPortlet> listPortletOfChannel(String channelId);

    List<ApcChannel> listChannelByPortlet(String portletId);
}
