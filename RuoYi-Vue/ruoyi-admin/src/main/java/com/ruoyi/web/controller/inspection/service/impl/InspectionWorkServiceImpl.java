package com.ruoyi.web.controller.inspection.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.web.controller.inspection.domain.InspectionWork;
import com.ruoyi.web.controller.inspection.mapper.InspectionWorkMapper;
import com.ruoyi.web.controller.inspection.service.IInspectionWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 巡视巡查工作Service业务层处理
 * 
 * @author Alan
 * @date 2020-08-28
 */
@Service
public class InspectionWorkServiceImpl implements IInspectionWorkService
{
    @Autowired
    private InspectionWorkMapper inspectionWorkMapper;

    /**
     * 查询巡视巡查工作
     * 
     * @param id 巡视巡查工作ID
     * @return 巡视巡查工作
     */
    @Override
    public InspectionWork selectInspectionWorkById(String id)
    {
        return inspectionWorkMapper.selectInspectionWorkById(id);
    }

    /**
     * 查询巡视巡查工作列表
     * 
     * @param inspectionWork 巡视巡查工作
     * @return 巡视巡查工作
     */
    @DataScope(deptAlias = "d", userAlias = "u")
    @Override
    public List<InspectionWork> selectInspectionWorkList(InspectionWork inspectionWork)
    {
        return inspectionWorkMapper.selectInspectionWorkList(inspectionWork);
    }

    /**
     * 新增巡视巡查工作
     * 
     * @param inspectionWork 巡视巡查工作
     * @return 结果
     */
    @Override
    public int insertInspectionWork(InspectionWork inspectionWork)
    {
        inspectionWork.setId(UUID.randomUUID().toString());
        inspectionWork.setCreateTime(DateUtils.getNowDate());
        inspectionWork.setCreateBy(SecurityUtils.getUsername());
        return inspectionWorkMapper.insertInspectionWork(inspectionWork);
    }

    @Override
    public List<InspectionWork> selectInspectionWorkByPer(String id) {
        return inspectionWorkMapper.selectInspectionWorkByPer(id);
    }

    /**
     * 修改巡视巡查工作
     * 
     * @param inspectionWork 巡视巡查工作
     * @return 结果
     */
    @Override
    public int updateInspectionWork(InspectionWork inspectionWork)
    {
        inspectionWork.setUpdateBy(SecurityUtils.getUsername());
        inspectionWork.setUpdateTime(DateUtils.getNowDate());
        return inspectionWorkMapper.updateInspectionWork(inspectionWork);
    }

    /**
     * 批量删除巡视巡查工作
     * 
     * @param ids 需要删除的巡视巡查工作ID
     * @return 结果
     */
    @Override
    public int deleteInspectionWorkByIds(String[] ids)
    {
        return inspectionWorkMapper.deleteInspectionWorkByIds(ids);
    }

    /**
     * 删除巡视巡查工作信息
     * 
     * @param id 巡视巡查工作ID
     * @return 结果
     */
    @Override
    public int deleteInspectionWorkById(String id)
    {
        return inspectionWorkMapper.deleteInspectionWorkById(id);
    }
}
