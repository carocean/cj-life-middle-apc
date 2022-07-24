package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.ApcChannel;
import cj.life.middle.apc.domain.ApcPortlet;
import cj.life.middle.apc.domain.MtPortletChannel;
import cj.life.middle.apc.domain.MtPortletChannelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MtPortletChannelMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(MtPortletChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(MtPortletChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(@Param("portletId") String portletId, @Param("channelId") String channelId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(MtPortletChannel row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(MtPortletChannel row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<MtPortletChannel> selectByExample(MtPortletChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MtPortletChannel selectByPrimaryKey(@Param("portletId") String portletId, @Param("channelId") String channelId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") MtPortletChannel row, @Param("example") MtPortletChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") MtPortletChannel row, @Param("example") MtPortletChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(MtPortletChannel row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(MtPortletChannel row);

    void setOrderNum(@Param("portletId") String portletId,@Param("channelId") String channelId, @Param("orderNum") int orderNum);

    List<ApcPortlet> listPortletOfChannel(String channelId);

    List<ApcChannel> listChannelByPortlet(String portletId);
}