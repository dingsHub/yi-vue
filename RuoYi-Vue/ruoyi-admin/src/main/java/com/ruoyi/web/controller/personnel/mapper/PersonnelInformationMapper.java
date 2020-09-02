package com.ruoyi.web.controller.personnel.mapper;


import com.ruoyi.web.controller.personnel.domain.PersonnelInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * personnelMapper接口
 * 
 * @author Alan孔
 * @date 2020-08-26
 */
public interface PersonnelInformationMapper 
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
     * 删除personnel
     * 
     * @param id personnelID
     * @return 结果
     */
    public int deletePersonnelInformationById(String id);

    /**
     * 批量删除personnel
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePersonnelInformationByIds(String[] ids);

    int updateUserAvatar(@Param("fullName") String fullName,@Param("avatar") String avatar);

    List<PersonnelInformation> selectPersonnelStatisticalList(PersonnelInformation personnelInformation);
}
