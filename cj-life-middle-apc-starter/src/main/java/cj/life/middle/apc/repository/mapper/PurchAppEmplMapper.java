package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.PurchAppEmpl;
import cj.life.middle.apc.domain.PurchAppEmplExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchAppEmplMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(PurchAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(PurchAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(@Param("appId") String appId, @Param("emplId") String emplId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(PurchAppEmpl row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(PurchAppEmpl row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<PurchAppEmpl> selectByExample(PurchAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") PurchAppEmpl row, @Param("example") PurchAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") PurchAppEmpl row, @Param("example") PurchAppEmplExample example);
}