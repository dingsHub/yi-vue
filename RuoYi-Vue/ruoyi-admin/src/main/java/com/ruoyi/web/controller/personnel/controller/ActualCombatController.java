package com.ruoyi.web.controller.personnel.controller;

import java.io.*;
import java.util.List;

import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.file.FileUploadUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.controller.personnel.domain.ActualCombat;
import com.ruoyi.web.controller.personnel.service.IActualCombatService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实战练兵Controller
 * 
 * @author ruoyi
 * @date 2020-08-27
 */

@RestController
@RequestMapping("/actual/combat")
public class ActualCombatController extends BaseController
{
    @Autowired
    private IActualCombatService actualCombatService;
    @Value(value = "${ruoyi.profile}")
    private String uploadpath;
    /**
     * 查询实战练兵列表
     */
    @PreAuthorize("@ss.hasPermi('actual:combat:list')")
    @GetMapping("/list")
    public TableDataInfo list(ActualCombat actualCombat)
    {
        startPage();
        List<ActualCombat> list = actualCombatService.selectActualCombatList(actualCombat);
        return getDataTable(list);
    }

    /**
     * 导出实战练兵列表
     */
    @PreAuthorize("@ss.hasPermi('actual:combat:export')")
    @Log(title = "实战练兵", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ActualCombat actualCombat)
    {
        List<ActualCombat> list = actualCombatService.selectActualCombatList(actualCombat);
        ExcelUtil<ActualCombat> util = new ExcelUtil<ActualCombat>(ActualCombat.class);
        return util.exportExcel(list, "combat");
    }
    /**
     * 个人表现上传
     */
    @Log(title = "个人表现上传", businessType = BusinessType.UPDATE)
    @PostMapping("/importData")
    public AjaxResult avatar( MultipartFile file) throws IOException
    {
        if (!file.isEmpty())
        {
            String avatar = FileUploadUtils.uploads(RuoYiConfig.getDownloadPath(), file);
            AjaxResult ajax = AjaxResult.success();
            ajax.put("fileUrl", avatar);
            return ajax;

        }
        return AjaxResult.error("上传附件异常，请联系管理员");
    }
    /**
     * 获取实战练兵详细信息
     */
    @PreAuthorize("@ss.hasPermi('actual:combat:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(actualCombatService.selectActualCombatById(id));
    }

    /**
     * 新增实战练兵
     */
    @PreAuthorize("@ss.hasPermi('actual:combat:add')")
    @Log(title = "实战练兵", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ActualCombat actualCombat)
    {
        String areasWork=StringUtils.join(actualCombat.getAreasWorks(), ",");
        actualCombat.setAreasWork(areasWork);
        return toAjax(actualCombatService.insertActualCombat(actualCombat));
    }
    /**
     * 修改实战练兵
     */
    @PreAuthorize("@ss.hasPermi('actual:combat:edit')")
    @Log(title = "实战练兵", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ActualCombat actualCombat)
    {
        return toAjax(actualCombatService.updateActualCombat(actualCombat));
    }

    /**
     * 删除实战练兵
     */
    @PreAuthorize("@ss.hasPermi('actual:combat:remove')")
    @Log(title = "实战练兵", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(actualCombatService.deleteActualCombatByIds(ids));
    }
}
