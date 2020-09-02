package com.ruoyi.web.controller.personnel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 family_relations
 * 
 * @author ruoyi
 * @date 2020-08-26
 */
public class FamilyRelations extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 称谓 */
    @Excel(name = "称谓")
    private String familyAppellation;

    /** 姓名 */
    @Excel(name = "姓名")
    private String familyName;

    /** 年龄 */
    @Excel(name = "年龄")
    private String familyAge;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String familyZzmm;

    /** 工作单位及职务 */
    @Excel(name = "工作单位及职务")
    private String familyGzdw;

    /** 人员信息的外键 */
    @Excel(name = "人员信息的外键")
    private String personnelld;

    /** 0  未删 1已删 */
    @Excel(name = "0  未删 1已删")
    private String isdel;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setFamilyAppellation(String familyAppellation) 
    {
        this.familyAppellation = familyAppellation;
    }

    public String getFamilyAppellation() 
    {
        return familyAppellation;
    }
    public void setFamilyName(String familyName) 
    {
        this.familyName = familyName;
    }

    public String getFamilyName() 
    {
        return familyName;
    }
    public void setFamilyAge(String familyAge) 
    {
        this.familyAge = familyAge;
    }

    public String getFamilyAge() 
    {
        return familyAge;
    }
    public void setFamilyZzmm(String familyZzmm) 
    {
        this.familyZzmm = familyZzmm;
    }

    public String getFamilyZzmm() 
    {
        return familyZzmm;
    }
    public void setFamilyGzdw(String familyGzdw) 
    {
        this.familyGzdw = familyGzdw;
    }

    public String getFamilyGzdw() 
    {
        return familyGzdw;
    }
    public void setPersonnelld(String personnelld) 
    {
        this.personnelld = personnelld;
    }

    public String getPersonnelld() 
    {
        return personnelld;
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
            .append("familyAppellation", getFamilyAppellation())
            .append("familyName", getFamilyName())
            .append("familyAge", getFamilyAge())
            .append("familyZzmm", getFamilyZzmm())
            .append("familyGzdw", getFamilyGzdw())
            .append("personnelld", getPersonnelld())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("isdel", getIsdel())
            .toString();
    }
}
