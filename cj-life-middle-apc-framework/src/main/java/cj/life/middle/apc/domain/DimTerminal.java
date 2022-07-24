package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: dim_terminal
 */
@Data
public class DimTerminal {
    /**
     * Column: terminal_id
     * Type: VARCHAR(50)
     * Remark: 终端标识
     */
    private String terminalId;

    /**
     * Column: terminal_name
     * Type: VARCHAR(20)
     * Remark: 终端名
     */
    private String terminalName;

    /**
     * Column: terminal_note
     * Type: VARCHAR(100)
     * Remark: 终端说明
     */
    private String terminalNote;

    /**
     * Column: order_num
     * Type: INT
     * Default value: 0
     */
    private Integer orderNum;
}