package com.ruoyi.web.controller.personnel.service;


import com.ruoyi.web.controller.personnel.domain.Investigating;

import java.util.List;

/**
 * 查办案件Service接口
 * 
 * @author Alan孔
 * @date 2020-08-27
 */
public interface IInvestigatingService 
{
    /**
     * 查询查办案件
     * 
     * @param id 查办案件ID
     * @return 查办案件
     */
    public Investigating selectInvestigatingById(String id);

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
     * 批量删除查办案件
     * 
     * @param ids 需要删除的查办案件ID
     * @return 结果
     */
    public int deleteInvestigatingByIds(String[] ids);

    /**
     * 删除查办案件信息
     * 
     * @param id 查办案件ID
     * @return 结果
     */
    public int deleteInvestigatingById(String id);

    List<Investigating> selectInspectionWorkByPer(String id);
}
