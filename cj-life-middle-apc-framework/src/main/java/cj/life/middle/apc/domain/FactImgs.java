package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: fact_imgs
 */
@Data
public class FactImgs {
    /**
     * Column: img_id
     * Type: VARCHAR(50)
     * Remark: 标识
     */
    private String imgId;

    /**
     * Column: app_id
     * Type: VARCHAR(50)
     * Remark: 所属应用
     */
    private String appId;

    /**
     * Column: img_src
     * Type: VARCHAR(250)
     * Remark: 图片地址
     */
    private String imgSrc;

    /**
     * Column: create_time
     * Type: VARCHAR(17)
     */
    private String createTime;

    /**
     * Column: img_note
     * Type: VARCHAR(100)
     * Remark: 备注
     */
    private String imgNote;
}