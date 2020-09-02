package com.ruoyi.web.controller.personnel.mapper;


import com.ruoyi.web.controller.personnel.domain.FamilyRelations;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-26
 */
public interface FamilyRelationsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public FamilyRelations selectFamilyRelationsById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param familyRelations 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FamilyRelations> selectFamilyRelationsList(FamilyRelations familyRelations);

    /**
     * 新增【请填写功能名称】
     * 
     * @param familyRelations 【请填写功能名称】
     * @return 结果
     */
    public int insertFamilyRelations(FamilyRelations familyRelations);

    /**
     * 修改【请填写功能名称】
     * 
     * @param familyRelations 【请填写功能名称】
     * @return 结果
     */
    public int updateFamilyRelations(FamilyRelations familyRelations);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteFamilyRelationsById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFamilyRelationsByIds(String[] ids);

    List<FamilyRelations> getByPersonnel(String id);
}
