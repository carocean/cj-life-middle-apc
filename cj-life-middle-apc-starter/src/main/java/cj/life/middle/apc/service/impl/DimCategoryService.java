package cj.life.middle.apc.service.impl;

import cj.life.ability.api.exception.ApiException;
import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.DimCategory;
import cj.life.middle.apc.domain.DimCategoryExample;
import cj.life.middle.apc.domain.MtPortletCategory;
import cj.life.middle.apc.repository.mapper.DimCategoryMapper;
import cj.life.middle.apc.repository.mapper.MtPortletCategoryMapper;
import cj.life.middle.apc.service.IDimCategoryService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DimCategoryService implements IDimCategoryService {
    @Resource
    DimCategoryMapper categoryMapper;
    @Resource
    MtPortletCategoryMapper portletCategoryMapper;

    @Override
    public String createCategory(String cateName, int orderNum, String cateNote) {
        if (existsCategoryName(cateName)) {
            throw new ApiException("5000", "The name of category already exist.");
        }
        String idNumSeq = null;
        while (true) {
            idNumSeq = RandomStringUtils.randomNumeric(20);
            DimCategoryExample example = new DimCategoryExample();
            example.createCriteria().andCateIdEqualTo(idNumSeq);
            long count = categoryMapper.countByExample(example);
            if (count < 1) {
                break;
            }
        }
        DimCategory category = new DimCategory();
        category.setOrderNum(orderNum);
        category.setCateId(idNumSeq);
        category.setCateName(cateName);
        category.setCateNote(cateNote);
        categoryMapper.insertSelective(category);
        return idNumSeq;
    }

    public boolean existsCategoryName(String cateName) {
        DimCategoryExample example = new DimCategoryExample();
        example.createCriteria().andCateNameEqualTo(cateName);
        return categoryMapper.countByExample(example) > 0;
    }

    @Override
    public void removeCategory(String cateId) {
        categoryMapper.deleteByPrimaryKey(cateId);
    }

    @Override
    public void setOrderNum(String cateId, int orderNum) {
        categoryMapper.setOrderNum(cateId, orderNum);
    }

    @Override
    public List<DimCategory> listCategory() {
        DimCategoryExample example = new DimCategoryExample();
        example.createCriteria();
        example.setOrderByClause("order_num asc");
        return categoryMapper.selectByExample(example);
    }

    @Override
    public void mountPortletToCategory(String portletId, String cateId, int orderNum) {
        MtPortletCategory mtPortletCategory = new MtPortletCategory();
        mtPortletCategory.setPortletId(portletId);
        mtPortletCategory.setCateId(cateId);
        mtPortletCategory.setOrderNum(orderNum);
        portletCategoryMapper.insertSelective(mtPortletCategory);
    }

    @Override
    public void unmountPortletToCategory(String portletId, String cateId) {
        portletCategoryMapper.deleteByPrimaryKey(portletId, cateId);
    }

    @Override
    public List<ApcPortlet> listPortletByCategory(String cateId) {
        return portletCategoryMapper.listPortletByCategory(cateId);
    }

    @Override
    public List<DimCategory> listCategoryByPortlet(String portletId) {
        return portletCategoryMapper.listCategoryByPortlet(portletId);
    }
}
