package com.ruoyi.web.controller.special.controller;

import java.util.List;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.controller.special.domain.SpecialLecture;
import com.ruoyi.web.controller.special.service.ISpecialLectureService;
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
 * 专题授课Controller
 * 
 * @author Alan
 * @date 2020-08-28
 */
@RestController
@RequestMapping("/special/lecture")
public class SpecialLectureController extends BaseController
{
    @Autowired
    private ISpecialLectureService specialLectureService;

    /**
     * 查询专题授课列表
     */
    @PreAuthorize("@ss.hasPermi('special:lecture:list')")
    @GetMapping("/list")
    public TableDataInfo list(SpecialLecture specialLecture)
    {
        startPage();
        List<SpecialLecture> list = specialLectureService.selectSpecialLectureList(specialLecture);
        return getDataTable(list);
    }

    /**
     * 导出专题授课列表
     */
    @PreAuthorize("@ss.hasPermi('special:lecture:export')")
    @Log(title = "专题授课", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SpecialLecture specialLecture)
    {
        List<SpecialLecture> list = specialLectureService.selectSpecialLectureList(specialLecture);
        ExcelUtil<SpecialLecture> util = new ExcelUtil<SpecialLecture>(SpecialLecture.class);
        return util.exportExcel(list, "lecture");
    }

    /**
     * 获取专题授课详细信息
     */
    @PreAuthorize("@ss.hasPermi('special:lecture:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(specialLectureService.selectSpecialLectureById(id));
    }

    /**
     * 新增专题授课
     */
    @PreAuthorize("@ss.hasPermi('special:lecture:add')")
    @Log(title = "专题授课", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SpecialLecture specialLecture)
    {
        return toAjax(specialLectureService.insertSpecialLecture(specialLecture));
    }

    /**
     * 修改专题授课
     */
    @PreAuthorize("@ss.hasPermi('special:lecture:edit')")
    @Log(title = "专题授课", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SpecialLecture specialLecture)
    {
        return toAjax(specialLectureService.updateSpecialLecture(specialLecture));
    }

    /**
     * 删除专题授课
     */
    @PreAuthorize("@ss.hasPermi('special:lecture:remove')")
    @Log(title = "专题授课", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(specialLectureService.deleteSpecialLectureByIds(ids));
    }
}
