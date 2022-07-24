package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: dim_charge
 */
@Data
public class DimCharge {
    /**
     * Column: charge_id
     * Type: VARCHAR(10)
     * Remark: 标识：free|pay
     */
    private String chargeId;

    /**
     * Column: charge_name
     * Type: VARCHAR(10)
     * Remark: 要价名：免费｜付费
     */
    private String chargeName;
}