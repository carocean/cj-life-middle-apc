package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: apc_channel
 */
@Data
public class ApcChannel {
    /**
     * Column: channel_id
     * Type: VARCHAR(50)
     * Remark: 频道标识
     */
    private String channelId;

    /**
     * Column: channel_name
     * Type: VARCHAR(20)
     * Remark: 频道名
     */
    private String channelName;

    /**
     * Column: order_num
     * Type: INT
     * Default value: 0
     * Remark: 顺序
     */
    private Integer orderNum;

    /**
     * Column: note
     * Type: VARCHAR(100)
     * Remark: 备注
     */
    private String note;
}