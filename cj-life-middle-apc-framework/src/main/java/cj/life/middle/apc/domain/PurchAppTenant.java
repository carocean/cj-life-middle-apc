package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: purch_app_tenant
 */
@Data
public class PurchAppTenant {
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
}