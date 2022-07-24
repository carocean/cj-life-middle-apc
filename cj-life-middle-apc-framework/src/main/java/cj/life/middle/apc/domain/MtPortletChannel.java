package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: mt_portlet_channel
 */
@Data
public class MtPortletChannel {
    /**
     * Column: portlet_id
     * Type: VARCHAR(50)
     */
    private String portletId;

    /**
     * Column: channel_id
     * Type: VARCHAR(50)
     */
    private String channelId;

    /**
     * Column: order_num
     * Type: INT
     * Default value: 0
     */
    private Integer orderNum;
}