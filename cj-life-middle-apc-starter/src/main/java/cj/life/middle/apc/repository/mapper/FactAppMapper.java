package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.domain.FactAppExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactAppMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FactAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FactAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String appId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FactApp row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FactApp row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FactApp> selectByExample(FactAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FactApp selectByPrimaryKey(String appId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") FactApp row, @Param("example") FactAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") FactApp row, @Param("example") FactAppExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FactApp row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FactApp row);

    List<FactApp> listFactApp(@Param("limit") int limit, @Param("offset") long offset);

    List<FactApp> listFactAppWithDim(@Param("cateId") String cateId,@Param("terminalId") String terminalId, @Param("countryId")String countryId,@Param("chargeMode") String chargeMode, @Param("limit")int limit, @Param("offset")long offset);
}