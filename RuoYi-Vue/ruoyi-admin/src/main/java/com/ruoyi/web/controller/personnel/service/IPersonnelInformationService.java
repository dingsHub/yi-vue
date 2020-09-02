package com.ruoyi.web.controller.personnel.service;


import com.ruoyi.web.controller.personnel.domain.PersonnelInformation;

import java.util.List;

/**
 * personnelService接口
 * 
 * @author Alan孔
 * @date 2020-08-26
 */
public interface IPersonnelInformationService 
{
    /**
     * 查询personnel
     * 
     * @param id personnelID
     * @return personnel
     */
    public PersonnelInformation selectPersonnelInformationById(String id);

    /**
     * 查询personnel列表
     * 
     * @param personnelInformation personnel
     * @return personnel集合
     */
    public List<PersonnelInformation> selectPersonnelInformationList(PersonnelInformation personnelInformation);

    /**
     * 新增personnel
     * 
     * @param personnelInformation personnel
     * @return 结果
     */
    public int insertPersonnelInformation(PersonnelInformation personnelInformation);

    /**
     * 修改personnel
     * 
     * @param personnelInformation personnel
     * @return 结果
     */
    public int updatePersonnelInformation(PersonnelInformation personnelInformation);

    /**
     * 批量删除personnel
     * 
     * @param ids 需要删除的personnelID
     * @return 结果
     */
    public int deletePersonnelInformationByIds(String[] ids);

    /**
     * 删除personnel信息
     * 
     * @param id personnelID
     * @return 结果
     */
    public int deletePersonnelInformationById(String id);

    boolean updateUserAvatar(String fullName, String avatar);

    List<PersonnelInformation> selectPersonnelStatisticalList(PersonnelInformation personnelInformation);
}
