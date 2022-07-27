package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.domain.FollowAppTenant;
import cj.life.middle.apc.domain.FollowAppTenantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowAppTenantMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FollowAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FollowAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(@Param("appId") String appId, @Param("tenantId") String tenantId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FollowAppTenant row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FollowAppTenant row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FollowAppTenant> selectByExample(FollowAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FollowAppTenant selectByPrimaryKey(@Param("appId") String appId, @Param("tenantId") String tenantId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") FollowAppTenant row, @Param("example") FollowAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") FollowAppTenant row, @Param("example") FollowAppTenantExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FollowAppTenant row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FollowAppTenant row);

    List<FactApp> listAppByTenant(@Param("tenantId") String tenantId, @Param("limit") int limit, @Param("offset") long offset);

}