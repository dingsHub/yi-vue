package com.ruoyi.web.controller.business.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.web.controller.business.domain.BusinessTraining;
import com.ruoyi.web.controller.business.mapper.BusinessTrainingMapper;
import com.ruoyi.web.controller.business.service.IBusinessTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务培训Service业务层处理
 * 
 * @author Alan
 * @date 2020-08-28
 */
@Service
public class BusinessTrainingServiceImpl implements IBusinessTrainingService
{
    @Autowired
    private BusinessTrainingMapper businessTrainingMapper;

    @Override
    public List<BusinessTraining> selectInspectionWorkByPer(String id) {
        return businessTrainingMapper.selectBusinessTrainingByPer(id);
    }

    /**
     * 查询业务培训
     * 
     * @param id 业务培训ID
     * @return 业务培训
     */
    @Override
    public BusinessTraining selectBusinessTrainingById(String id)
    {
        return businessTrainingMapper.selectBusinessTrainingById(id);
    }

    /**
     * 查询业务培训列表
     * 
     * @param businessTraining 业务培训
     * @return 业务培训
     */
    @DataScope(deptAlias = "d", userAlias = "u")
    @Override
    public List<BusinessTraining> selectBusinessTrainingList(BusinessTraining businessTraining)
    {
        return businessTrainingMapper.selectBusinessTrainingList(businessTraining);
    }

    /**
     * 新增业务培训
     * 
     * @param businessTraining 业务培训
     * @return 结果
     */
    @Override
    public int insertBusinessTraining(BusinessTraining businessTraining)
    {
        businessTraining.setId(UUID.randomUUID().toString());
        businessTraining.setCreateTime(DateUtils.getNowDate());
        businessTraining.setCreateBy(SecurityUtils.getUsername());
        return businessTrainingMapper.insertBusinessTraining(businessTraining);
    }

    /**
     * 修改业务培训
     * 
     * @param businessTraining 业务培训
     * @return 结果
     */
    @Override
    public int updateBusinessTraining(BusinessTraining businessTraining)
    {
        businessTraining.setUpdateBy(SecurityUtils.getUsername());
        businessTraining.setUpdateTime(DateUtils.getNowDate());
        return businessTrainingMapper.updateBusinessTraining(businessTraining);
    }

    /**
     * 批量删除业务培训
     * 
     * @param ids 需要删除的业务培训ID
     * @return 结果
     */
    @Override
    public int deleteBusinessTrainingByIds(String[] ids)
    {
        return businessTrainingMapper.deleteBusinessTrainingByIds(ids);
    }

    /**
     * 删除业务培训信息
     * 
     * @param id 业务培训ID
     * @return 结果
     */
    @Override
    public int deleteBusinessTrainingById(String id)
    {
        return businessTrainingMapper.deleteBusinessTrainingById(id);
    }
}
