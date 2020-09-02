package com.ruoyi.web.controller.personnel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.web.controller.personnel.domain.StateSettings;
import com.ruoyi.web.controller.personnel.mapper.StateSettingsMapper;
import com.ruoyi.web.controller.personnel.service.IStateSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 人员的状态设置Service业务层处理
 * 
 * @author ALan
 * @date 2020-09-02
 */
@Service
public class StateSettingsServiceImpl implements IStateSettingsService
{
    @Autowired
    private StateSettingsMapper stateSettingsMapper;

    /**
     * 查询人员的状态设置
     * 
     * @param id 人员的状态设置ID
     * @return 人员的状态设置
     */
    @Override
    public StateSettings selectStateSettingsById(String id)
    {
        return stateSettingsMapper.selectStateSettingsById(id);
    }

    /**
     * 查询人员的状态设置列表
     * 
     * @param stateSettings 人员的状态设置
     * @return 人员的状态设置
     */
    @Override
    public List<StateSettings> selectStateSettingsList(StateSettings stateSettings)
    {
        return stateSettingsMapper.selectStateSettingsList(stateSettings);
    }

    /**
     * 新增人员的状态设置
     * 
     * @param stateSettings 人员的状态设置
     * @return 结果
     */
    @Override
    public int insertStateSettings(StateSettings stateSettings)
    {
        stateSettings.setCreateTime(DateUtils.getNowDate());
        return stateSettingsMapper.insertStateSettings(stateSettings);
    }

    /**
     * 修改人员的状态设置
     * 
     * @param stateSettings 人员的状态设置
     * @return 结果
     */
    @Override
    public int updateStateSettings(StateSettings stateSettings)
    {
        stateSettings.setUpdateTime(DateUtils.getNowDate());
        return stateSettingsMapper.updateStateSettings(stateSettings);
    }

    /**
     * 批量删除人员的状态设置
     * 
     * @param ids 需要删除的人员的状态设置ID
     * @return 结果
     */
    @Override
    public int deleteStateSettingsByIds(String[] ids)
    {
        return stateSettingsMapper.deleteStateSettingsByIds(ids);
    }

    /**
     * 删除人员的状态设置信息
     * 
     * @param id 人员的状态设置ID
     * @return 结果
     */
    @Override
    public int deleteStateSettingsById(String id)
    {
        return stateSettingsMapper.deleteStateSettingsById(id);
    }
}
