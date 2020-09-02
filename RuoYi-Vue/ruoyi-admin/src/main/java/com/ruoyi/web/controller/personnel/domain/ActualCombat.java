package com.ruoyi.web.controller.personnel.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 实战练兵对象 actual_combat
 * 
 * @author ruoyi
 * @date 2020-08-27
 */
public class ActualCombat extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date btime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date etime;

    /** 案件名称 */
    @Excel(name = "案件名称")
    private String nameCase;

    /** 案件领域 */
    @Excel(name = "案件领域")
    private String caseArea;

    /** 是否借调 */
    @Excel(name = "是否借调")
    private String toLoan;

    /** 案件内容 */
    @Excel(name = "案件内容")
    private String caseContent;

    /** $column.columnComment */
    @Excel(name = "案件内容")
    private String isdel;

    /** 承办部门 */
    @Excel(name = "承办部门")
    private String department;

    /** 擅长工作领域  逗号分隔 */
    @Excel(name = "擅长工作领域  逗号分隔")
    private String areasWork;


    private String[] areasWorks;
    /** 个人表现 */
    private String personalPerformance;

    /** 政治素质 */
    private String politicalQuality;

    /** 业务能力 */
    private String businessCapability;

    /** 工作作风 */
    private String styleWork;

    private String userId;


    private String nickName;
    private String performanceName;
    private String departName;

    public String getPerformanceName() {
        return performanceName;
    }

    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName;
    }

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

    public String[] getAreasWorks() {
        return areasWorks;
    }

    public void setAreasWorks(String[] areasWorks) {
        this.areasWorks = areasWorks;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setBtime(Date btime) 
    {
        this.btime = btime;
    }

    public Date getBtime() 
    {
        return btime;
    }
    public void setEtime(Date etime) 
    {
        this.etime = etime;
    }

    public Date getEtime() 
    {
        return etime;
    }
    public void setNameCase(String nameCase) 
    {
        this.nameCase = nameCase;
    }

    public String getNameCase() 
    {
        return nameCase;
    }
    public void setCaseArea(String caseArea) 
    {
        this.caseArea = caseArea;
    }

    public String getCaseArea() 
    {
        return caseArea;
    }
    public void setToLoan(String toLoan) 
    {
        this.toLoan = toLoan;
    }

    public String getToLoan() 
    {
        return toLoan;
    }
    public void setCaseContent(String caseContent) 
    {
        this.caseContent = caseContent;
    }

    public String getCaseContent() 
    {
        return caseContent;
    }
    public void setIsdel(String isdel) 
    {
        this.isdel = isdel;
    }

    public String getIsdel() 
    {
        return isdel;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setAreasWork(String areasWork) 
    {
        this.areasWork = areasWork;
    }

    public String getAreasWork() 
    {
        return areasWork;
    }
    public void setPersonalPerformance(String personalPerformance) 
    {
        this.personalPerformance = personalPerformance;
    }

    public String getPersonalPerformance() 
    {
        return personalPerformance;
    }
    public void setPoliticalQuality(String politicalQuality) 
    {
        this.politicalQuality = politicalQuality;
    }

    public String getPoliticalQuality() 
    {
        return politicalQuality;
    }
    public void setBusinessCapability(String businessCapability) 
    {
        this.businessCapability = businessCapability;
    }

    public String getBusinessCapability() 
    {
        return businessCapability;
    }
    public void setStyleWork(String styleWork) 
    {
        this.styleWork = styleWork;
    }

    public String getStyleWork() 
    {
        return styleWork;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("btime", getBtime())
            .append("etime", getEtime())
            .append("nameCase", getNameCase())
            .append("caseArea", getCaseArea())
            .append("toLoan", getToLoan())
            .append("caseContent", getCaseContent())
            .append("isdel", getIsdel())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("department", getDepartment())
            .append("areasWork", getAreasWork())
            .append("personalPerformance", getPersonalPerformance())
            .append("politicalQuality", getPoliticalQuality())
            .append("businessCapability", getBusinessCapability())
            .append("styleWork", getStyleWork())
            .toString();
    }
}
