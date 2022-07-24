package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: mt_portlet_app
 */
@Data
public class MtPortletApp {
    /**
     * Column: portlet_id
     * Type: VARCHAR(50)
     */
    private String portletId;

    /**
     * Column: app_id
     * Type: VARCHAR(50)
     */
    private String appId;

    /**
     * Column: order_num
     * Type: INT
     * Default value: 0
     */
    private Integer orderNum;
}