package com.ruoyi.web.controller.personnel.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 查办案件对象 investigating
 * 
 * @author Alan孔
 * @date 2020-08-27
 */
public class Investigating extends BaseEntity
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

    /** 参与类型   逗号分隔 */
    @Excel(name = "参与类型   逗号分隔")
    private String typesParticipation;
    private String[] typesParticipations;

    public String[] getTypesParticipations() {
        return typesParticipations;
    }

    public void setTypesParticipations(String[] typesParticipations) {
        this.typesParticipations = typesParticipations;
    }

    /** 角色 */
    @Excel(name = "角色")
    private String roleName;

    /** 是否主办人 */
    private String sponsor;

    /** 案件内容 */
    private String caseContent;

    /** $column.columnComment */
    private String isdel;
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
    public void setTypesParticipation(String typesParticipation) 
    {
        this.typesParticipation = typesParticipation;
    }

    public String getTypesParticipation() 
    {
        return typesParticipation;
    }
    public void setRoleName(String roleName) 
    {
        this.roleName = roleName;
    }

    public String getRoleName() 
    {
        return roleName;
    }
    public void setSponsor(String sponsor) 
    {
        this.sponsor = sponsor;
    }

    public String getSponsor() 
    {
        return sponsor;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("btime", getBtime())
            .append("etime", getEtime())
            .append("nameCase", getNameCase())
            .append("caseArea", getCaseArea())
            .append("typesParticipation", getTypesParticipation())
            .append("roleName", getRoleName())
            .append("sponsor", getSponsor())
            .append("caseContent", getCaseContent())
            .append("isdel", getIsdel())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
