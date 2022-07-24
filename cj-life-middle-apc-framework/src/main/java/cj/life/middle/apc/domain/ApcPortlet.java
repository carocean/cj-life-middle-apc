package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: apc_portlet
 */
@Data
public class ApcPortlet {
    /**
     * Column: portlet_id
     * Type: VARCHAR(50)
     * Remark: 栏目标识
     */
    private String portletId;

    /**
     * Column: portlet_name
     * Type: VARCHAR(20)
     * Remark: 栏目名
     */
    private String portletName;

    /**
     * Column: show_mode
     * Type: VARCHAR(10)
     * Default value: list
     * Remark: 显示模式：list|alone|waterfall
     */
    private String showMode;

    /**
     * Column: create_time
     * Type: VARCHAR(17)
     */
    private String createTime;

    /**
     * Column: portlet_note
     * Type: VARCHAR(100)
     * Remark: 备注
     */
    private String portletNote;
}