package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: fact_versions
 */
@Data
public class FactVersions {
    /**
     * Column: version_id
     * Type: VARCHAR(50)
     * Remark: 标识
     */
    private String versionId;

    /**
     * Column: version_num
     * Type: VARCHAR(10)
     * Remark: 版本号
     */
    private String versionNum;

    /**
     * Column: app_id
     * Type: VARCHAR(50)
     * Remark: 应用标识
     */
    private String appId;

    /**
     * Column: pub_time
     * Type: VARCHAR(17)
     * Remark: 发布时间
     */
    private String pubTime;

    /**
     * Column: version_note
     * Type: VARCHAR(500)
     * Remark: 版本说明，拷贝应用描述
     */
    private String versionNote;
}