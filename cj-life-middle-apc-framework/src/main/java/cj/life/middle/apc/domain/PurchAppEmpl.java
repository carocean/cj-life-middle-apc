package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: purch_app_empl
 */
@Data
public class PurchAppEmpl {
    /**
     * Column: app_id
     * Type: VARCHAR(50)
     * Remark: 应用标识
     */
    private String appId;

    /**
     * Column: empl_id
     * Type: VARCHAR(50)
     * Remark: 员工标识
     */
    private String emplId;
}