package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.DimCategory;
import cj.life.middle.apc.domain.MtPortletCategory;
import cj.life.middle.apc.domain.MtPortletCategoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MtPortletCategoryMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(MtPortletCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(MtPortletCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(@Param("portletId") String portletId, @Param("cateId") String cateId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(MtPortletCategory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(MtPortletCategory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<MtPortletCategory> selectByExample(MtPortletCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MtPortletCategory selectByPrimaryKey(@Param("portletId") String portletId, @Param("cateId") String cateId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") MtPortletCategory row, @Param("example") MtPortletCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") MtPortletCategory row, @Param("example") MtPortletCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(MtPortletCategory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(MtPortletCategory row);

    List<ApcPortlet> listPortletByCategory(@Param("cateId") String cateId);

    List<DimCategory> listCategoryByPortlet(@Param("portletId") String portletId);
}