package com.ruoyi.web.controller.inspection.service;

import com.ruoyi.web.controller.inspection.domain.InspectionWork;

import java.util.List;

/**
 * 巡视巡查工作Service接口
 * 
 * @author Alan
 * @date 2020-08-28
 */
public interface IInspectionWorkService 
{
    /**
     * 查询巡视巡查工作
     * 
     * @param id 巡视巡查工作ID
     * @return 巡视巡查工作
     */
    public InspectionWork selectInspectionWorkById(String id);

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
     * 批量删除巡视巡查工作
     * 
     * @param ids 需要删除的巡视巡查工作ID
     * @return 结果
     */
    public int deleteInspectionWorkByIds(String[] ids);

    /**
     * 删除巡视巡查工作信息
     * 
     * @param id 巡视巡查工作ID
     * @return 结果
     */
    public int deleteInspectionWorkById(String id);

    List<InspectionWork> selectInspectionWorkByPer(String id);
}
