package com.ruoyi.web.controller.business.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 业务培训对象 business_training
 * 
 * @author Alan
 * @date 2020-08-28
 */
public class BusinessTraining extends BaseEntity
{

    private static final long serialVersionUID = 1L;
    private String userId;


    private String nickName;

    private String departName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
    /** $column.columnComment */
    private String id;

    /** 班次名称 */
    @Excel(name = "班次名称")
    private String shiftName;

    /** 举办部门 */
    @Excel(name = "举办部门")
    private String organizingDepartment;

    /** 培训开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "培训开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date trainBtime;

    /** 培训结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "培训结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date trainEtime;

    /** 个人评价 */
    @Excel(name = "个人评价")
    private String personalEvaluation;

    /** $column.columnComment */
    @Excel(name = "个人评价")
    private String isdel;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setShiftName(String shiftName) 
    {
        this.shiftName = shiftName;
    }

    public String getShiftName() 
    {
        return shiftName;
    }
    public void setOrganizingDepartment(String organizingDepartment) 
    {
        this.organizingDepartment = organizingDepartment;
    }

    public String getOrganizingDepartment() 
    {
        return organizingDepartment;
    }
    public void setTrainBtime(Date trainBtime) 
    {
        this.trainBtime = trainBtime;
    }

    public Date getTrainBtime() 
    {
        return trainBtime;
    }
    public void setTrainEtime(Date trainEtime) 
    {
        this.trainEtime = trainEtime;
    }

    public Date getTrainEtime() 
    {
        return trainEtime;
    }
    public void setPersonalEvaluation(String personalEvaluation) 
    {
        this.personalEvaluation = personalEvaluation;
    }

    public String getPersonalEvaluation() 
    {
        return personalEvaluation;
    }
    public void setIsdel(String isdel) 
    {
        this.isdel = isdel;
    }

    public String getIsdel() 
    {
        return isdel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shiftName", getShiftName())
            .append("organizingDepartment", getOrganizingDepartment())
            .append("trainBtime", getTrainBtime())
            .append("trainEtime", getTrainEtime())
            .append("personalEvaluation", getPersonalEvaluation())
            .append("isdel", getIsdel())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
