package com.ruoyi.web.controller.personnel.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员的状态设置对象 state_settings
 * 
 * @author ALan
 * @date 2020-09-02
 */
public class StateSettings extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 2:退休 3:离职 */
    @Excel(name = "2:退休 3:离职")
    private String state;

    /** 变动时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "变动时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date timeChange;

    /** 文件 */
    @Excel(name = "文件")
    private String file;

    /** $column.columnComment */
    @Excel(name = "文件")
    private Long personnelid;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setTimeChange(Date timeChange) 
    {
        this.timeChange = timeChange;
    }

    public Date getTimeChange() 
    {
        return timeChange;
    }
    public void setFile(String file) 
    {
        this.file = file;
    }

    public String getFile() 
    {
        return file;
    }
    public void setPersonnelid(Long personnelid) 
    {
        this.personnelid = personnelid;
    }

    public Long getPersonnelid() 
    {
        return personnelid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("state", getState())
            .append("timeChange", getTimeChange())
            .append("file", getFile())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("personnelid", getPersonnelid())
            .toString();
    }
}
