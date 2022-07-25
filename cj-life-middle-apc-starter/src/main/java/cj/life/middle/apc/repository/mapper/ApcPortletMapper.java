package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.ApcPortletExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApcPortletMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ApcPortletExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ApcPortletExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String portletId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ApcPortlet row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ApcPortlet row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ApcPortlet> selectByExample(ApcPortletExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ApcPortlet selectByPrimaryKey(String portletId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") ApcPortlet row, @Param("example") ApcPortletExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") ApcPortlet row, @Param("example") ApcPortletExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ApcPortlet row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ApcPortlet row);

    void setShowMode(@Param("portletId") String portletId,@Param("showMode") String showMode);

    List<ApcPortlet> listPortlet(@Param("limit") int limit,@Param("offset") long offset);

    List<ApcPortlet> listPortletByShowMode(@Param("showMode")String showMode, @Param("limit") int limit,@Param("offset") long offset);
}