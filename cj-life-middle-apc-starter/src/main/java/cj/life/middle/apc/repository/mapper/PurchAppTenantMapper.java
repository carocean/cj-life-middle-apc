package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.PurchAppTenant;
import cj.life.middle.apc.domain.PurchAppTenantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchAppTenantMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(PurchAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(PurchAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(@Param("appId") String appId, @Param("tenantId") String tenantId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(PurchAppTenant row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(PurchAppTenant row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<PurchAppTenant> selectByExample(PurchAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") PurchAppTenant row, @Param("example") PurchAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") PurchAppTenant row, @Param("example") PurchAppTenantExample example);
}