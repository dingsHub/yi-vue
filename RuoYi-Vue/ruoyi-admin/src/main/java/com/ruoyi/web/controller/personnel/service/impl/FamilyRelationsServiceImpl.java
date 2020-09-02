package com.ruoyi.web.controller.personnel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.web.controller.personnel.domain.FamilyRelations;
import com.ruoyi.web.controller.personnel.mapper.FamilyRelationsMapper;
import com.ruoyi.web.controller.personnel.service.IFamilyRelationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-26
 */
@Service
public class FamilyRelationsServiceImpl implements IFamilyRelationsService
{
    @Autowired
    private FamilyRelationsMapper familyRelationsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public FamilyRelations selectFamilyRelationsById(String id)
    {
        return familyRelationsMapper.selectFamilyRelationsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param familyRelations 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FamilyRelations> selectFamilyRelationsList(FamilyRelations familyRelations)
    {
        return familyRelationsMapper.selectFamilyRelationsList(familyRelations);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param familyRelations 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFamilyRelations(FamilyRelations familyRelations)
    {
        familyRelations.setCreateTime(DateUtils.getNowDate());
        return familyRelationsMapper.insertFamilyRelations(familyRelations);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param familyRelations 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFamilyRelations(FamilyRelations familyRelations)
    {
        familyRelations.setUpdateTime(DateUtils.getNowDate());
        return familyRelationsMapper.updateFamilyRelations(familyRelations);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFamilyRelationsByIds(String[] ids)
    {
        return familyRelationsMapper.deleteFamilyRelationsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteFamilyRelationsById(String id)
    {
        return familyRelationsMapper.deleteFamilyRelationsById(id);
    }

    @Override
    public List<FamilyRelations> getByPersonnel(String id) {
        return familyRelationsMapper.getByPersonnel(id);
    }
}
