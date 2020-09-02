package com.ruoyi.web.controller.personnel.service;


import com.ruoyi.web.controller.personnel.domain.ActualCombat;

import java.util.List;

/**
 * 实战练兵Service接口
 * 
 * @author ruoyi
 * @date 2020-08-27
 */
public interface IActualCombatService 
{
    /**
     * 查询实战练兵
     * 
     * @param id 实战练兵ID
     * @return 实战练兵
     */
    public ActualCombat selectActualCombatById(String id);

    /**
     * 查询实战练兵列表
     * 
     * @param actualCombat 实战练兵
     * @return 实战练兵集合
     */
    public List<ActualCombat> selectActualCombatList(ActualCombat actualCombat);

    /**
     * 新增实战练兵
     * 
     * @param actualCombat 实战练兵
     * @return 结果
     */
    public int insertActualCombat(ActualCombat actualCombat);

    /**
     * 修改实战练兵
     * 
     * @param actualCombat 实战练兵
     * @return 结果
     */
    public int updateActualCombat(ActualCombat actualCombat);

    /**
     * 批量删除实战练兵
     * 
     * @param ids 需要删除的实战练兵ID
     * @return 结果
     */
    public int deleteActualCombatByIds(String[] ids);

    /**
     * 删除实战练兵信息
     * 
     * @param id 实战练兵ID
     * @return 结果
     */
    public int deleteActualCombatById(String id);

    List<ActualCombat> selectInspectionWorkByPer(String id);
}
