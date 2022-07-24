package cj.life.middle.apc.web;

import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.FactApp;

import java.util.List;

public interface IPortletRC {
    String createPortlet(String portletName, String showMode, String portletNote);

    List<String> enumShowModes();

    void removePortlet(String portletId);

    void setShowMode(String portletId, String showMode);

    List<ApcPortlet> listPortlet(int limit, long offset);

    List<ApcPortlet> listPortletByShowMode(String showMode, int limit, long offset);

    void mountAppToPortlet(String appId, String portletId, int orderNum);

    void unmountAppToPortlet(String appId, String portletId);

    List<FactApp> listAppByPortlet(String portletId, int limit, long offset);

    List<ApcPortlet> listPortletByApp(String appId);

}
