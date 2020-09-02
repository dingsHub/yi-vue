package com.ruoyi.web.controller.system;

import java.util.ArrayList;
import java.util.List;

import com.ruoyi.common.core.domain.entity.AreasOfWork;
import com.ruoyi.framework.web.service.TokenService;
import org.springframework.beans.BeanUtils;
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
import com.ruoyi.system.service.IAreasOfWorkService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 擅长工作领域Controller
 * 
 * @author ruoyi
 * @date 2020-08-27
 */
@RestController
@RequestMapping("/system/work")
public class AreasOfWorkController extends BaseController
{
    @Autowired
    private IAreasOfWorkService areasOfWorkService;
    @Autowired
    private TokenService tokenService;
    /**
     * 查询擅长工作领域列表
     */
    @PreAuthorize("@ss.hasPermi('system:work:list')")
    @GetMapping("/list")
    public AjaxResult list(AreasOfWork areasOfWork)
    {
        List<AreasOfWork> list = areasOfWorkService.selectAreasOfWorkList(areasOfWork);
        return AjaxResult.success(list);
    }

    /**
     * 导出擅长工作领域列表
     */
    @PreAuthorize("@ss.hasPermi('system:work:export')")
    @Log(title = "擅长工作领域", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(AreasOfWork areasOfWork)
    {
        List<AreasOfWork> list = areasOfWorkService.selectAreasOfWorkList(areasOfWork);
        ExcelUtil<AreasOfWork> util = new ExcelUtil<AreasOfWork>(AreasOfWork.class);
        return util.exportExcel(list, "work");
    }

    /**
     * 获取擅长工作领域下拉树列表
     */
    @GetMapping("/treeselect")
    public AjaxResult treeselect(AreasOfWork areasOfWork)
    {
        com.ruoyi.common.core.domain.entity.AreasOfWork areas=new com.ruoyi.common.core.domain.entity.AreasOfWork();
        List<AreasOfWork> menus = areasOfWorkService.selectAreasOfWorkList(areasOfWork);


        return AjaxResult.success(areasOfWorkService.buildMenuTreeSelect(menus));
    }
    /**
     * 获取擅长工作领域详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:work:query')")
    @GetMapping(value = "/{areasId}")
    public AjaxResult getInfo(@PathVariable("areasId") Long areasId)
    {
        return AjaxResult.success(areasOfWorkService.selectAreasOfWorkById(areasId));
    }

    /**
     * 新增擅长工作领域
     */
    @PreAuthorize("@ss.hasPermi('system:work:add')")
    @Log(title = "擅长工作领域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AreasOfWork areasOfWork)
    {
        return toAjax(areasOfWorkService.insertAreasOfWork(areasOfWork));
    }

    /**
     * 修改擅长工作领域
     */
    @PreAuthorize("@ss.hasPermi('system:work:edit')")
    @Log(title = "擅长工作领域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AreasOfWork areasOfWork)
    {
        return toAjax(areasOfWorkService.updateAreasOfWork(areasOfWork));
    }

    /**
     * 删除擅长工作领域
     */
    @PreAuthorize("@ss.hasPermi('system:work:remove')")
    @Log(title = "擅长工作领域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{areasIds}")
    public AjaxResult remove(@PathVariable Long[] areasIds)
    {
        return toAjax(areasOfWorkService.deleteAreasOfWorkByIds(areasIds));
    }
}
