package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: follow_app_empl
 */
@Data
public class FollowAppEmpl {
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

    /**
     * Column: follow_time
     * Type: VARCHAR(17)
     * Remark: 关注时间
     */
    private String followTime;
}