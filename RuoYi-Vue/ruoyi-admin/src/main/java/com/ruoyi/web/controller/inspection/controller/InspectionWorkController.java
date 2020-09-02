package com.ruoyi.web.controller.inspection.controller;

import java.util.List;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.controller.inspection.domain.InspectionWork;
import com.ruoyi.web.controller.inspection.service.IInspectionWorkService;
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
 * 巡视巡查工作Controller
 * 
 * @author Alan
 * @date 2020-08-28
 */
@RestController
@RequestMapping("/inspection/work")
public class InspectionWorkController extends BaseController
{
    @Autowired
    private IInspectionWorkService inspectionWorkService;

    /**
     * 查询巡视巡查工作列表
     */
    @PreAuthorize("@ss.hasPermi('inspection:work:list')")
    @GetMapping("/list")
    public TableDataInfo list(InspectionWork inspectionWork)
    {
        startPage();
        List<InspectionWork> list = inspectionWorkService.selectInspectionWorkList(inspectionWork);
        return getDataTable(list);
    }

    /**
     * 导出巡视巡查工作列表
     */
    @PreAuthorize("@ss.hasPermi('inspection:work:export')")
    @Log(title = "巡视巡查工作", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(InspectionWork inspectionWork)
    {
        List<InspectionWork> list = inspectionWorkService.selectInspectionWorkList(inspectionWork);
        ExcelUtil<InspectionWork> util = new ExcelUtil<InspectionWork>(InspectionWork.class);
        return util.exportExcel(list, "work");
    }

    /**
     * 获取巡视巡查工作详细信息
     */
    @PreAuthorize("@ss.hasPermi('inspection:work:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(inspectionWorkService.selectInspectionWorkById(id));
    }

    /**
     * 新增巡视巡查工作
     */
    @PreAuthorize("@ss.hasPermi('inspection:work:add')")
    @Log(title = "巡视巡查工作", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InspectionWork inspectionWork) {
        String str ="";
        for (String string:inspectionWork.getJobTypes()){
            str=str+string+",";
        }
        inspectionWork.setJobType(str);
        return toAjax(inspectionWorkService.insertInspectionWork(inspectionWork));
    }

    /**
     * 修改巡视巡查工作
     */
    @PreAuthorize("@ss.hasPermi('inspection:work:edit')")
    @Log(title = "巡视巡查工作", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InspectionWork inspectionWork)
    {
        String str ="";
        for (String string:inspectionWork.getJobTypes()){
            str=str+string+",";
        }
        inspectionWork.setJobType(str);
        return toAjax(inspectionWorkService.updateInspectionWork(inspectionWork));
    }

    /**
     * 删除巡视巡查工作
     */
    @PreAuthorize("@ss.hasPermi('inspection:work:remove')")
    @Log(title = "巡视巡查工作", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(inspectionWorkService.deleteInspectionWorkByIds(ids));
    }
}
