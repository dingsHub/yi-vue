package com.ruoyi.web.controller.personnel.controller;

import java.util.List;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.web.controller.business.service.IBusinessTrainingService;
import com.ruoyi.web.controller.inspection.service.IInspectionWorkService;
import com.ruoyi.web.controller.personnel.domain.PersonnelInformation;
import com.ruoyi.web.controller.personnel.service.*;
import com.ruoyi.web.controller.special.service.ISpecialLectureService;
import org.apache.commons.lang3.StringUtils;
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
 * personnelController
 * 
 * @author Alan孔
 * @date 2020-08-26
 */
@RestController
@RequestMapping("/personnel/information")
public class PersonnelInformationController extends BaseController
{
    @Autowired
    private IPersonnelInformationService personnelInformationService;

    @Autowired
    private IFamilyRelationsService iFamilyRelationsService;//家庭关系

    @Autowired
    private ICertificateService iCertificateService;//证书
    @Autowired
    private IBusinessTrainingService iBusinessTrainingService;//业务培训
    @Autowired
    private IInspectionWorkService iInspectionWorkService;//巡视巡查工作
    @Autowired
    private IActualCombatService iActualCombatService; //实战练兵对象
    @Autowired
    private IInvestigatingService iInvestigatingService;//查办案件对象

    @Autowired
    private ISpecialLectureService iSpecialLectureService;//专题授课
    /**
     * 查询personnel列表
     */
    @PreAuthorize("@ss.hasPermi('personnel:information:list')")
    @GetMapping("/list")
    public TableDataInfo list(PersonnelInformation personnelInformation)
    {
        startPage();
        List<PersonnelInformation> list = personnelInformationService.selectPersonnelInformationList(personnelInformation);
        return getDataTable(list);
    }


    /**
     * 查询personnel列表
     */

    @GetMapping("/statisticalList")
    public TableDataInfo statisticalList(PersonnelInformation personnelInformation)
    {
        startPage();
        List<PersonnelInformation> list = personnelInformationService.selectPersonnelStatisticalList(personnelInformation);
        return getDataTable(list);
    }
    /**
     * 导出personnel列表
     */
    @PreAuthorize("@ss.hasPermi('personnel:information:export')")
    @Log(title = "personnel", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(PersonnelInformation personnelInformation)
    {
        List<PersonnelInformation> list = personnelInformationService.selectPersonnelInformationList(personnelInformation);
        ExcelUtil<PersonnelInformation> util = new ExcelUtil<PersonnelInformation>(PersonnelInformation.class);
        return util.exportExcel(list, "information");
    }

    /**
     * 获取personnel详细信息
     */
    @PreAuthorize("@ss.hasPermi('personnel:information:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        PersonnelInformation personnelInformation = personnelInformationService.selectPersonnelInformationById(id);
        personnelInformation.setCertificate(iCertificateService.getByPersonnel(personnelInformation.getId()));
        personnelInformation.setFamilyRelations(iFamilyRelationsService.getByPersonnel(personnelInformation.getId()));
        return AjaxResult.success(personnelInformation);
    }


    /**
     * 获取人员信息的全部详细信息
     */

    @GetMapping(value = "/info/{id}")
    public AjaxResult getInfoPer(@PathVariable("id") String id) {
        PersonnelInformation personnelInformation = personnelInformationService.selectPersonnelInformationById(id);
        personnelInformation.setCertificate(iCertificateService.getByPersonnel(personnelInformation.getId()));
        personnelInformation.setFamilyRelations(iFamilyRelationsService.getByPersonnel(personnelInformation.getId()));
        personnelInformation.setInspectionWorks(iInspectionWorkService.selectInspectionWorkByPer(personnelInformation.getId()));
        personnelInformation.setInvestigatings(iInvestigatingService.selectInspectionWorkByPer(personnelInformation.getId()));
        personnelInformation.setActualCombats(iActualCombatService.selectInspectionWorkByPer(personnelInformation.getId()));
        personnelInformation.setBusinessTrainings(iBusinessTrainingService.selectInspectionWorkByPer(personnelInformation.getId()));
        personnelInformation.setSpecialLectures(iSpecialLectureService.selectInspectionWorkByPer(personnelInformation.getId()));
        return AjaxResult.success(personnelInformation);
    }

    /**
     * 新增personnel
     */
    @PreAuthorize("@ss.hasPermi('personnel:information:add')")
    @Log(title = "personnel", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PersonnelInformation personnelInformation)
    {
        String expertise= StringUtils.join(personnelInformation.getExpertises(),",");
        personnelInformation.setExpertise(expertise);
        return toAjax(personnelInformationService.insertPersonnelInformation(personnelInformation));
    }

    /**
     * 修改personnel
     */
    @PreAuthorize("@ss.hasPermi('personnel:information:edit')")
    @Log(title = "personnel", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PersonnelInformation personnelInformation)
    {
        String expertise= StringUtils.join(personnelInformation.getExpertises(),",");
        personnelInformation.setExpertise(expertise);
        return toAjax(personnelInformationService.updatePersonnelInformation(personnelInformation));
    }

    /**
     * 删除personnel
     */
    @PreAuthorize("@ss.hasPermi('personnel:information:remove')")
    @Log(title = "personnel", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(personnelInformationService.deletePersonnelInformationByIds(ids));
    }

    /**
     * 删除personnel
     */
    @Log(title = "personnelFaily", businessType = BusinessType.DELETE)
    @DeleteMapping("/removeFaily/{ids}")
    public AjaxResult removeFaily(@PathVariable String[] ids)
    {
        return toAjax(iFamilyRelationsService.deleteFamilyRelationsByIds(ids));
    }

    /**
     * 删除personnel
     */
    @Log(title = "personnelFaily", businessType = BusinessType.DELETE)
    @DeleteMapping("/removeCertificate/{ids}")
    public AjaxResult removeCertificate(@PathVariable String[] ids)
    {
        return toAjax(iCertificateService.deleteCertificateByIds(ids));
    }
}
