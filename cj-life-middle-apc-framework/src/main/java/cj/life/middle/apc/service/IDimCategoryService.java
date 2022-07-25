package cj.life.middle.apc.service;

import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.DimCategory;

import java.util.List;

public interface IDimCategoryService {
    String createCategory(String cateName, int orderNum, String cateNote);

    void removeCategory(String cateId);

    void setOrderNum(String cateId, int orderNum);

    List<DimCategory> listCategory();

    void mountPortletToCategory(String portletId, String cateId, int orderNum);

    void unmountPortletToCategory(String portletId, String cateId);

    List<ApcPortlet> listPortletByCategory(String cateId);

    List<DimCategory> listCategoryByPortlet(String portletId);
}
