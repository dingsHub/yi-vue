package com.ruoyi.common.core.domain.entity;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.core.domain.TreeEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * 擅长工作领域对象 areas_of_work
 * 
 * @author ruoyi
 * @date 2020-08-27
 */
public class AreasOfWork extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工作领域id */
    private Long areasId;

    /** 工作领域名称 */
    @Excel(name = "工作领域名称")
    private String areasName;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;
    /** 父部门ID */
    private Long parentId;

    private String ancestors;

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    private String orderNum;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /** 子菜单 */
    private List<AreasOfWork> children = new ArrayList<AreasOfWork>();

    public List<AreasOfWork> getChildren()
    {
        return children;
    }

    public void setChildren(List<AreasOfWork> children)
    {
        this.children = children;
    }

   

    public void setAreasId(Long areasId) 
    {
        this.areasId = areasId;
    }

    public Long getAreasId() 
    {
        return areasId;
    }
    public void setAreasName(String areasName) 
    {
        this.areasName = areasName;
    }

    public String getAreasName() 
    {
        return areasName;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }



}
