package cj.life.middle.apc.domain;

import lombok.Data;

/**
 * Table: dim_country
 */
@Data
public class DimCountry {
    /**
     * Column: country_id
     * Type: VARCHAR(50)
     * Remark: 标识
     */
    private String countryId;

    /**
     * Column: cn_name
     * Type: VARCHAR(30)
     * Remark: 中文名
     */
    private String cnName;

    /**
     * Column: en_name
     * Type: VARCHAR(30)
     * Remark: 英文名
     */
    private String enName;

    /**
     * Column: alpha2_code
     * Type: VARCHAR(10)
     * Remark: 二字母码
     */
    private String alpha2Code;

    /**
     * Column: alpha3_code
     * Type: VARCHAR(10)
     * Remark: 三字母码
     */
    private String alpha3Code;

    /**
     * Column: numeric_code
     * Type: VARCHAR(10)
     * Remark: 数字代码
     */
    private String numericCode;

    /**
     * Column: area_code
     * Type: VARCHAR(10)
     * Remark: 国际电话区号
     */
    private String areaCode;
}