package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: mt_portlet_category
 */
@Data
public class MtPortletCategory {
    /**
     * Column: portlet_id
     * Type: VARCHAR(50)
     */
    private String portletId;

    /**
     * Column: cate_id
     * Type: VARCHAR(50)
     */
    private String cateId;

    /**
     * Column: order_num
     * Type: INT
     * Default value: 0
     * Remark: 在类别中的顺序
     */
    private Integer orderNum;
}