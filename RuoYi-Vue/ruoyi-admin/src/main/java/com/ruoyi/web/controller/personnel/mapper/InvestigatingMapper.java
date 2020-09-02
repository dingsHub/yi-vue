package com.ruoyi.web.controller.personnel.mapper;

import com.ruoyi.web.controller.personnel.domain.Investigating;

import java.util.List;

/**
 * 查办案件Mapper接口
 * 
 * @author Alan孔
 * @date 2020-08-27
 */
public interface InvestigatingMapper 
{
    /**
     * 查询查办案件
     * 
     * @param id 查办案件ID
     * @return 查办案件
     */
    public Investigating selectInvestigatingById(String id);

    public List<Investigating> selectInvestigatingByPer(String id);

    /**
     * 查询查办案件列表
     * 
     * @param investigating 查办案件
     * @return 查办案件集合
     */
    public List<Investigating> selectInvestigatingList(Investigating investigating);

    /**
     * 新增查办案件
     * 
     * @param investigating 查办案件
     * @return 结果
     */
    public int insertInvestigating(Investigating investigating);

    /**
     * 修改查办案件
     * 
     * @param investigating 查办案件
     * @return 结果
     */
    public int updateInvestigating(Investigating investigating);

    /**
     * 删除查办案件
     * 
     * @param id 查办案件ID
     * @return 结果
     */
    public int deleteInvestigatingById(String id);

    /**
     * 批量删除查办案件
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInvestigatingByIds(String[] ids);
}
