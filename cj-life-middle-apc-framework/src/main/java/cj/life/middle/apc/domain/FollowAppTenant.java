package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: follow_app_tenant
 */
@Data
public class FollowAppTenant {
    /**
     * Column: app_id
     * Type: VARCHAR(50)
     * Remark: 应用标识
     */
    private String appId;

    /**
     * Column: tenant_id
     * Type: VARCHAR(50)
     * Remark: 租户标识
     */
    private String tenantId;

    /**
     * Column: follow_time
     * Type: VARCHAR(17)
     * Remark: 关注时间
     */
    private String followTime;
}