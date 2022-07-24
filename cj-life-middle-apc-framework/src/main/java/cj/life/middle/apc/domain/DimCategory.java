package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: dim_category
 */
@Data
public class DimCategory {
    /**
     * Column: cate_id
     * Type: VARCHAR(50)
     * Remark: 类别标识
     */
    private String cateId;

    /**
     * Column: cate_name
     * Type: VARCHAR(50)
     * Remark: 类别名
     */
    private String cateName;

    /**
     * Column: order_num
     * Type: INT
     * Default value: 0
     */
    private Integer orderNum;

    /**
     * Column: cate_note
     * Type: VARCHAR(100)
     * Remark: 备注
     */
    private String cateNote;
}