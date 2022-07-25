package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.domain.MtPortletApp;
import cj.life.middle.apc.domain.MtPortletAppExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MtPortletAppMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(MtPortletAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(MtPortletAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(@Param("portletId") String portletId, @Param("appId") String appId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(MtPortletApp row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(MtPortletApp row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<MtPortletApp> selectByExample(MtPortletAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MtPortletApp selectByPrimaryKey(@Param("portletId") String portletId, @Param("appId") String appId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") MtPortletApp row, @Param("example") MtPortletAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") MtPortletApp row, @Param("example") MtPortletAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(MtPortletApp row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(MtPortletApp row);

    List<FactApp> listAppByPortlet(@Param("portletId") String portletId, @Param("limit") int limit, @Param("offset") long offset);

    List<ApcPortlet> listPortletByApp(@Param("appId") String appId);
}