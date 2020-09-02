package com.ruoyi.web.controller.personnel.controller;

import java.util.List;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.controller.personnel.domain.StateSettings;
import com.ruoyi.web.controller.personnel.service.IStateSettingsService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人员的状态设置Controller
 * 
 * @author ALan
 * @date 2020-09-02
 */
@RestController
@RequestMapping("/state/settings")
public class StateSettingsController extends BaseController
{
    @Autowired
    private IStateSettingsService stateSettingsService;

    /**
     * 查询人员的状态设置列表
     */
    @PreAuthorize("@ss.hasPermi('state:settings:list')")
    @GetMapping("/list")
    public TableDataInfo list(StateSettings stateSettings)
    {
        startPage();
        List<StateSettings> list = stateSettingsService.selectStateSettingsList(stateSettings);
        return getDataTable(list);
    }

    /**
     * 导出人员的状态设置列表
     */
    @PreAuthorize("@ss.hasPermi('state:settings:export')")
    @Log(title = "人员的状态设置", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(StateSettings stateSettings)
    {
        List<StateSettings> list = stateSettingsService.selectStateSettingsList(stateSettings);
        ExcelUtil<StateSettings> util = new ExcelUtil<StateSettings>(StateSettings.class);
        return util.exportExcel(list, "settings");
    }

    /**
     * 获取人员的状态设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('state:settings:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(stateSettingsService.selectStateSettingsById(id));
    }

    /**
     * 新增人员的状态设置
     */
    @PreAuthorize("@ss.hasPermi('state:settings:add')")
    @Log(title = "人员的状态设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StateSettings stateSettings)
    {
        return toAjax(stateSettingsService.insertStateSettings(stateSettings));
    }

    /**
     * 修改人员的状态设置
     */
    @PreAuthorize("@ss.hasPermi('state:settings:edit')")
    @Log(title = "人员的状态设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StateSettings stateSettings)
    {
        return toAjax(stateSettingsService.updateStateSettings(stateSettings));
    }

    /**
     * 删除人员的状态设置
     */
    @PreAuthorize("@ss.hasPermi('state:settings:remove')")
    @Log(title = "人员的状态设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(stateSettingsService.deleteStateSettingsByIds(ids));
    }
}
