package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.DimCharge;
import cj.life.middle.apc.domain.DimChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DimChargeMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(DimChargeExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(DimChargeExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String chargeId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(DimCharge row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(DimCharge row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<DimCharge> selectByExample(DimChargeExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    DimCharge selectByPrimaryKey(String chargeId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") DimCharge row, @Param("example") DimChargeExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") DimCharge row, @Param("example") DimChargeExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(DimCharge row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(DimCharge row);
}