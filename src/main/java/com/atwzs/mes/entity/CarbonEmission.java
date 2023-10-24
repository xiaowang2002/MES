package com.atwzs.mes.entity;

import lombok.Getter;

import java.io.Serializable;

/**
 * (CarbonEmission)实体类
 *
 * @author Wang Zhisheng
 * @since 2023-10-24 11:12:56
 */
@Getter
public class CarbonEmission implements Serializable {
    private static final long serialVersionUID = 485158552272310937L;
    /**
     * 编号
     */
    private Long id;
    /**
     * 能耗项
     */
    private String energyConsumption;
    /**
     * 项目类型
     */
    private String projectType;
    /**
     * 时间类型
     */
    private String timeType;
    /**
     * 能耗数
     */
    private Integer energyConsumptionNum;
    /**
     * 预警阈值
     */
    private Integer warningValue;


    public void setId(Long id) {
        this.id = id;
    }

    public void setEnergyConsumption(String energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public void setEnergyConsumptionNum(Integer energyConsumptionNum) {
        this.energyConsumptionNum = energyConsumptionNum;
    }

    public void setWarningValue(Integer warningValue) {
        this.warningValue = warningValue;
    }

}

