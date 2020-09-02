package com.ruoyi.web.controller.personnel.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.web.controller.personnel.domain.ActualCombat;
import com.ruoyi.web.controller.personnel.mapper.ActualCombatMapper;
import com.ruoyi.web.controller.personnel.service.IActualCombatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 实战练兵Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-27
 */
@Service
public class ActualCombatServiceImpl implements IActualCombatService
{
    @Autowired
    private ActualCombatMapper actualCombatMapper;

    /**
     * 查询实战练兵
     * 
     * @param id 实战练兵ID
     * @return 实战练兵
     */
    @Override
    public ActualCombat selectActualCombatById(String id)
    {
        return actualCombatMapper.selectActualCombatById(id);
    }

    /**
     * 查询实战练兵列表
     * 
     * @param actualCombat 实战练兵
     * @return 实战练兵
     */
    @DataScope(deptAlias = "d", userAlias = "u")
    @Override
    public List<ActualCombat> selectActualCombatList(ActualCombat actualCombat)
    {
        return actualCombatMapper.selectActualCombatList(actualCombat);
    }

    /**
     * 新增实战练兵
     * 
     * @param actualCombat 实战练兵
     * @return 结果
     */
    @Override
    public int insertActualCombat(ActualCombat actualCombat)
    {
        actualCombat.setId(UUID.randomUUID().toString());
        actualCombat.setCreateTime(DateUtils.getNowDate());
        actualCombat.setCreateBy(SecurityUtils.getUsername());

        return actualCombatMapper.insertActualCombat(actualCombat);
    }

    @Override
    public List<ActualCombat> selectInspectionWorkByPer(String id) {
        return actualCombatMapper.selectActualCombatByPer(id);
    }

    /**
     * 修改实战练兵
     * 
     * @param actualCombat 实战练兵
     * @return 结果
     */
    @Override
    public int updateActualCombat(ActualCombat actualCombat)
    {
        actualCombat.setUpdateBy(SecurityUtils.getUsername());
        actualCombat.setUpdateTime(DateUtils.getNowDate());
        return actualCombatMapper.updateActualCombat(actualCombat);
    }

    /**
     * 批量删除实战练兵
     * 
     * @param ids 需要删除的实战练兵ID
     * @return 结果
     */
    @Override
    public int deleteActualCombatByIds(String[] ids)
    {
        return actualCombatMapper.deleteActualCombatByIds(ids);
    }

    /**
     * 删除实战练兵信息
     * 
     * @param id 实战练兵ID
     * @return 结果
     */
    @Override
    public int deleteActualCombatById(String id)
    {
        return actualCombatMapper.deleteActualCombatById(id);
    }
}
