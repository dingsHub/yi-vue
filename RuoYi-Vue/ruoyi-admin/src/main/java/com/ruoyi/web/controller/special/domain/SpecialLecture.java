package com.ruoyi.web.controller.special.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 专题授课对象 special_lecture
 * 
 * @author Alan
 * @date 2020-08-28
 */
public class SpecialLecture extends BaseEntity
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

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date btime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date etime;

    /** 举办部门 */
    @Excel(name = "举办部门")
    private String organizingDepartment;

    /** 班次名称 */
    @Excel(name = "班次名称")
    private String shiftName;

    /** 参与对象 */
    @Excel(name = "参与对象")
    private String participants;

    /** 授课名称 */
    @Excel(name = "授课名称")
    private String courseName;

    /** $column.columnComment */
    @Excel(name = "授课名称")
    private String isdel;

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
    public void setOrganizingDepartment(String organizingDepartment) 
    {
        this.organizingDepartment = organizingDepartment;
    }

    public String getOrganizingDepartment() 
    {
        return organizingDepartment;
    }
    public void setShiftName(String shiftName) 
    {
        this.shiftName = shiftName;
    }

    public String getShiftName() 
    {
        return shiftName;
    }
    public void setParticipants(String participants) 
    {
        this.participants = participants;
    }

    public String getParticipants() 
    {
        return participants;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
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
            .append("organizingDepartment", getOrganizingDepartment())
            .append("shiftName", getShiftName())
            .append("participants", getParticipants())
            .append("courseName", getCourseName())
            .append("isdel", getIsdel())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
