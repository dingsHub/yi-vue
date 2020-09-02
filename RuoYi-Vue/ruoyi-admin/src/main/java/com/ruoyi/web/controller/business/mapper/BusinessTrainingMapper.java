package com.ruoyi.web.controller.business.mapper;

import com.ruoyi.web.controller.business.domain.BusinessTraining;

import java.util.List;

/**
 * 业务培训Mapper接口
 * 
 * @author Alan
 * @date 2020-08-28
 */
public interface BusinessTrainingMapper 
{
    /**
     * 查询业务培训
     * 
     * @param id 业务培训ID
     * @return 业务培训
     */
    public BusinessTraining selectBusinessTrainingById(String id);

    public List<BusinessTraining> selectBusinessTrainingByPer(String id);

    /**
     * 查询业务培训列表
     * 
     * @param businessTraining 业务培训
     * @return 业务培训集合
     */
    public List<BusinessTraining> selectBusinessTrainingList(BusinessTraining businessTraining);

    /**
     * 新增业务培训
     * 
     * @param businessTraining 业务培训
     * @return 结果
     */
    public int insertBusinessTraining(BusinessTraining businessTraining);

    /**
     * 修改业务培训
     * 
     * @param businessTraining 业务培训
     * @return 结果
     */
    public int updateBusinessTraining(BusinessTraining businessTraining);

    /**
     * 删除业务培训
     * 
     * @param id 业务培训ID
     * @return 结果
     */
    public int deleteBusinessTrainingById(String id);

    /**
     * 批量删除业务培训
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBusinessTrainingByIds(String[] ids);
}
