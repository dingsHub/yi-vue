package com.ruoyi.web.controller.inspection.mapper;

import com.ruoyi.web.controller.inspection.domain.InspectionWork;

import java.util.List;

/**
 * 巡视巡查工作Mapper接口
 * 
 * @author Alan
 * @date 2020-08-28
 */
public interface InspectionWorkMapper 
{
    /**
     * 查询巡视巡查工作
     * 
     * @param id 巡视巡查工作ID
     * @return 巡视巡查工作
     */
    public InspectionWork selectInspectionWorkById(String id);

    public List<InspectionWork> selectInspectionWorkByPer(String id);

    /**
     * 查询巡视巡查工作列表
     * 
     * @param inspectionWork 巡视巡查工作
     * @return 巡视巡查工作集合
     */
    public List<InspectionWork> selectInspectionWorkList(InspectionWork inspectionWork);

    /**
     * 新增巡视巡查工作
     * 
     * @param inspectionWork 巡视巡查工作
     * @return 结果
     */
    public int insertInspectionWork(InspectionWork inspectionWork);

    /**
     * 修改巡视巡查工作
     * 
     * @param inspectionWork 巡视巡查工作
     * @return 结果
     */
    public int updateInspectionWork(InspectionWork inspectionWork);

    /**
     * 删除巡视巡查工作
     * 
     * @param id 巡视巡查工作ID
     * @return 结果
     */
    public int deleteInspectionWorkById(String id);

    /**
     * 批量删除巡视巡查工作
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInspectionWorkByIds(String[] ids);
}
