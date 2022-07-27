package cj.life.middle.apc.domain;

import java.math.BigDecimal;
import lombok.Data;

/**
 * Table: fact_app
 */
@Data
public class FactApp {
    /**
     * Column: app_id
     * Type: VARCHAR(50)
     * Remark: 应用标识，对应uc中的真实app_id
     */
    private String appId;

    /**
     * Column: cate_id
     * Type: VARCHAR(50)
     * Remark: 类别标识
     */
    private String cateId;

    /**
     * Column: terminal_id
     * Type: VARCHAR(50)
     * Remark: 终端标识
     */
    private String terminalId;

    /**
     * Column: country_id
     * Type: VARCHAR(50)
     * Remark: 国家代码表
     */
    private String countryId;

    /**
     * Column: charge_mode
     * Type: VARCHAR(10)
     * Remark: 要价标识:free|pay
     */
    private String chargeMode;

    /**
     * Column: cate_name
     * Type: VARCHAR(50)
     * Remark: 庸余字段：分类名
     */
    private String cateName;

    /**
     * Column: terminal_name
     * Type: VARCHAR(50)
     * Remark: 庸余字段：终端名
     */
    private String terminalName;

    /**
     * Column: country_name
     * Type: VARCHAR(50)
     * Remark: 庸余字段：国家名
     */
    private String countryName;

    /**
     * Column: charge_name
     * Type: VARCHAR(10)
     * Remark: 庸余字段：要价中文称呼
     */
    private String chargeName;

    /**
     * Column: app_name
     * Type: VARCHAR(20)
     * Remark: 应用名
     */
    private String appName;

    /**
     * Column: app_icon
     * Type: VARCHAR(250)
     * Remark: 应用图标
     */
    private String appIcon;

    /**
     * Column: newest_version
     * Type: VARCHAR(10)
     * Remark: 最新版本号
     */
    private String newestVersion;

    /**
     * Column: pub_time
     * Type: VARCHAR(17)
     * Remark: 发布时间
     */
    private String pubTime;

    /**
     * Column: app_developer
     * Type: VARCHAR(50)
     * Remark: 应用开发者
     */
    private String appDeveloper;

    /**
     * Column: app_supplier
     * Type: VARCHAR(50)
     * Remark: 供应商：即开发者的公司
     */
    private String appSupplier;

    /**
     * Column: app_tenant
     * Type: VARCHAR(50)
     * Remark: 来自租户名
     */
    private String appTenant;

    /**
     * Column: app_slogan
     * Type: VARCHAR(100)
     * Remark: 广告语或口号
     */
    private String appSlogan;

    /**
     * Column: empl_unit_price
     * Type: DECIMAL
     * Default value: 0.00
     * Remark: 员工购买价
     */
    private BigDecimal emplUnitPrice;

    /**
     * Column: tenant_unit_price
     * Type: DECIMAL
     * Default value: 0.00
     * Remark: 租户购买单价
     */
    private BigDecimal tenantUnitPrice;

    /**
     * Column: app_note
     * Type: VARCHAR(500)
     * Remark: 应用描述
     */
    private String appNote;
}