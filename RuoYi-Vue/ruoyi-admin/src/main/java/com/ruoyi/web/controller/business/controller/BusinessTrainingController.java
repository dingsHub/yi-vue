package com.ruoyi.web.controller.business.controller;

import java.util.List;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.controller.business.domain.BusinessTraining;
import com.ruoyi.web.controller.business.service.IBusinessTrainingService;
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
 * 业务培训Controller
 * 
 * @author Alan
 * @date 2020-08-28
 */
@RestController
@RequestMapping("/business/training")
public class BusinessTrainingController extends BaseController
{
    @Autowired
    private IBusinessTrainingService businessTrainingService;

    /**
     * 查询业务培训列表
     */
    @PreAuthorize("@ss.hasPermi('business:training:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusinessTraining businessTraining)
    {
        startPage();
        List<BusinessTraining> list = businessTrainingService.selectBusinessTrainingList(businessTraining);
        return getDataTable(list);
    }

    /**
     * 导出业务培训列表
     */
    @PreAuthorize("@ss.hasPermi('business:training:export')")
    @Log(title = "业务培训", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(BusinessTraining businessTraining)
    {
        List<BusinessTraining> list = businessTrainingService.selectBusinessTrainingList(businessTraining);
        ExcelUtil<BusinessTraining> util = new ExcelUtil<BusinessTraining>(BusinessTraining.class);
        return util.exportExcel(list, "training");
    }

    /**
     * 获取业务培训详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:training:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(businessTrainingService.selectBusinessTrainingById(id));
    }

    /**
     * 新增业务培训
     */
    @PreAuthorize("@ss.hasPermi('business:training:add')")
    @Log(title = "业务培训", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusinessTraining businessTraining)
    {
        return toAjax(businessTrainingService.insertBusinessTraining(businessTraining));
    }

    /**
     * 修改业务培训
     */
    @PreAuthorize("@ss.hasPermi('business:training:edit')")
    @Log(title = "业务培训", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusinessTraining businessTraining)
    {
        return toAjax(businessTrainingService.updateBusinessTraining(businessTraining));
    }

    /**
     * 删除业务培训
     */
    @PreAuthorize("@ss.hasPermi('business:training:remove')")
    @Log(title = "业务培训", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(businessTrainingService.deleteBusinessTrainingByIds(ids));
    }
}
