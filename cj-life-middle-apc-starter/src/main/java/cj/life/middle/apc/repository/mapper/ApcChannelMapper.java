package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.ApcChannel;
import cj.life.middle.apc.domain.ApcChannelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApcChannelMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ApcChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ApcChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String channelId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ApcChannel row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ApcChannel row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ApcChannel> selectByExample(ApcChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ApcChannel selectByPrimaryKey(String channelId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") ApcChannel row, @Param("example") ApcChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") ApcChannel row, @Param("example") ApcChannelExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ApcChannel row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ApcChannel row);

    void setOrderNum(@Param("channelId") String channelId, @Param("orderNum") int orderNum);
}