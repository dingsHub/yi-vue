package com.ruoyi.web.controller.inspection.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 巡视巡查工作对象 inspection_work
 * 
 * @author Alan
 * @date 2020-08-28
 */
public class InspectionWork extends BaseEntity
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

    /** 巡视地区或单位 */
    @Excel(name = "巡视地区或单位")
    private String inspectionArea;

    /** 工作类型 */
    @Excel(name = "工作类型")
    private String jobType;

    /** 评级 */
    @Excel(name = "评级")
    private String grade;

    /** $column.columnComment */
    @Excel(name = "评级")
    private String isdel;

    private String jobTypeValue;

    private String remarks;

    private String userId;


    private String nickName;

    private String departName;

    private String[] jobTypes;

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

    public String getJobTypeValue() {
        return jobTypeValue;
    }

    public void setJobTypeValue(String jobTypeValue) {
        this.jobTypeValue = jobTypeValue;
    }

    public String[] getJobTypes() {
        return jobTypes;
    }

    public void setJobTypes(String[] jobTypes) {
        this.jobTypes = jobTypes;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
    public void setInspectionArea(String inspectionArea) 
    {
        this.inspectionArea = inspectionArea;
    }

    public String getInspectionArea() 
    {
        return inspectionArea;
    }
    public void setJobType(String jobType) 
    {
        this.jobType = jobType;
    }

    public String getJobType() 
    {
        return jobType;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
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
            .append("btime", getBtime())
            .append("etime", getEtime())
            .append("inspectionArea", getInspectionArea())
            .append("jobType", getJobType())
            .append("grade", getGrade())
            .append("isdel", getIsdel())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
