package com.ruoyi.web.controller.personnel.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.web.controller.personnel.domain.Certificate;
import com.ruoyi.web.controller.personnel.domain.FamilyRelations;
import com.ruoyi.web.controller.personnel.domain.PersonnelInformation;
import com.ruoyi.web.controller.personnel.mapper.CertificateMapper;
import com.ruoyi.web.controller.personnel.mapper.FamilyRelationsMapper;
import com.ruoyi.web.controller.personnel.mapper.PersonnelInformationMapper;
import com.ruoyi.web.controller.personnel.service.IPersonnelInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * personnelService业务层处理
 * 
 * @author Alan孔
 * @date 2020-08-26
 */
@Service
public class PersonnelInformationServiceImpl implements IPersonnelInformationService
{
    @Autowired
    private PersonnelInformationMapper personnelInformationMapper;

    @Autowired
    private CertificateMapper certificateMapper;

    @Autowired
    private FamilyRelationsMapper familyRelationsMapper;

    /**
     * 查询personnel
     * 
     * @param id personnelID
     * @return personnel
     */
    @Override
    public PersonnelInformation selectPersonnelInformationById(String id)
    {
        return personnelInformationMapper.selectPersonnelInformationById(id);
    }

    /**
     * 查询personnel列表
     * 
     * @param personnelInformation personnel
     * @return personnel
     */
    @Override
    public List<PersonnelInformation> selectPersonnelInformationList(PersonnelInformation personnelInformation)
    {
        return personnelInformationMapper.selectPersonnelInformationList(personnelInformation);
    }

    /**
     * 新增personnel
     * 
     * @param personnelInformation personnel
     * @return 结果
     */
    @Override
    @Transactional
    public int insertPersonnelInformation(PersonnelInformation personnelInformation)
    {
        personnelInformation.setId(UUID.randomUUID().toString());
        personnelInformation.setCreateTime(DateUtils.getNowDate());
        personnelInformation.setCreateBy(SecurityUtils.getUsername());
        for (Certificate certificate:personnelInformation.getCertificate()){
            certificate.setId(UUID.randomUUID().toString());
            certificate.setCreateTime(DateUtils.getNowDate());
            certificate.setCreateBy(SecurityUtils.getUsername());
            certificate.setPersonnelld(personnelInformation.getId());
            certificateMapper.insertCertificate(certificate);
        }

        for (FamilyRelations familyRelations:personnelInformation.getFamilyRelations()){
            familyRelations.setId(UUID.randomUUID().toString());
            familyRelations.setCreateTime(DateUtils.getNowDate());
            familyRelations.setCreateBy(SecurityUtils.getUsername());
            familyRelations.setPersonnelld(personnelInformation.getId());
            familyRelationsMapper.insertFamilyRelations(familyRelations);
        }

        return personnelInformationMapper.insertPersonnelInformation(personnelInformation);
    }

    /**
     * 修改personnel
     * 
     * @param personnelInformation personnel
     * @return 结果
     */
    @Override
    public int updatePersonnelInformation(PersonnelInformation personnelInformation)
    {
        for (Certificate certificate:personnelInformation.getCertificate()){
            if(StringUtils.isBlank(certificate.getId())){
                certificate.setId(UUID.randomUUID().toString());
                certificate.setCreateTime(DateUtils.getNowDate());
                certificate.setCreateBy(SecurityUtils.getUsername());
                certificate.setPersonnelld(personnelInformation.getId());
                certificateMapper.insertCertificate(certificate);
            }else {
                certificate.setUpdateTime(DateUtils.getNowDate());
                certificate.setUpdateBy(SecurityUtils.getUsername());
                certificateMapper.updateCertificate(certificate);
            }

        }
        for (FamilyRelations familyRelations:personnelInformation.getFamilyRelations()){
            if(StringUtils.isBlank(familyRelations.getId())){
                familyRelations.setId(UUID.randomUUID().toString());
                familyRelations.setCreateTime(DateUtils.getNowDate());
                familyRelations.setCreateBy(SecurityUtils.getUsername());
                familyRelations.setPersonnelld(personnelInformation.getId());
                familyRelationsMapper.insertFamilyRelations(familyRelations);
            }else {
                familyRelations.setUpdateTime(DateUtils.getNowDate());
                familyRelations.setUpdateBy(SecurityUtils.getUsername());
                familyRelationsMapper.updateFamilyRelations(familyRelations);
            }

        }
        personnelInformation.setUpdateBy(SecurityUtils.getUsername());
        personnelInformation.setUpdateTime(DateUtils.getNowDate());
        return personnelInformationMapper.updatePersonnelInformation(personnelInformation);
    }

    /**
     * 批量删除personnel
     * 
     * @param ids 需要删除的personnelID
     * @return 结果
     */
    @Override
    @Transactional
    public int deletePersonnelInformationByIds(String[] ids)
    {
        List<String> strings = new ArrayList<>();
        for(String string:ids){
            List<Certificate> byPersonnel = certificateMapper.getByPersonnel(string);
            for (Certificate certificate:byPersonnel){
                strings.add(certificate.getId());
            }
        }
        if(strings.size()>0){
            String[] strs1=strings.toArray(new String[strings.size()]);
            certificateMapper.deleteCertificateByIds(strs1);
        }
        List<String> stringf = new ArrayList<>();
        for(String string:ids){
            List<FamilyRelations> byPersonnelf = familyRelationsMapper.getByPersonnel(string);
            for (FamilyRelations certificate:byPersonnelf){
                strings.add(certificate.getId());
            }
        }
        if(stringf.size()>0){
            String[] strsf=stringf.toArray(new String[stringf.size()]);
            familyRelationsMapper.deleteFamilyRelationsByIds(strsf);
        }
        return personnelInformationMapper.deletePersonnelInformationByIds(ids);
    }

    /**
     * 删除personnel信息
     * 
     * @param id personnelID
     * @return 结果
     */
    @Override
    public int deletePersonnelInformationById(String id)
    {
        return personnelInformationMapper.deletePersonnelInformationById(id);
    }

    @Override
    public boolean updateUserAvatar(String fullName, String avatar) {
        return personnelInformationMapper.updateUserAvatar(fullName, avatar) > 0;
    }
    @DataScope(deptAlias = "d", userAlias = "u")
    @Override
    public List<PersonnelInformation> selectPersonnelStatisticalList(PersonnelInformation personnelInformation) {
        return personnelInformationMapper.selectPersonnelStatisticalList(personnelInformation);
    }
}
