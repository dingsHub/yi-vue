package com.ruoyi.web.controller.personnel.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.web.controller.personnel.domain.Investigating;
import com.ruoyi.web.controller.personnel.mapper.InvestigatingMapper;
import com.ruoyi.web.controller.personnel.service.IInvestigatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 查办案件Service业务层处理
 * 
 * @author Alan孔
 * @date 2020-08-27
 */
@Service
public class InvestigatingServiceImpl implements IInvestigatingService
{
    @Autowired
    private InvestigatingMapper investigatingMapper;

    /**
     * 查询查办案件
     * 
     * @param id 查办案件ID
     * @return 查办案件
     */
    @Override
    public Investigating selectInvestigatingById(String id)
    {
        return investigatingMapper.selectInvestigatingById(id);
    }

    /**
     * 查询查办案件列表
     * 
     * @param investigating 查办案件
     * @return 查办案件
     */
    @DataScope(deptAlias = "d", userAlias = "u")
    @Override
    public List<Investigating> selectInvestigatingList(Investigating investigating)
    {
        return investigatingMapper.selectInvestigatingList(investigating);
    }

    /**
     * 新增查办案件
     * 
     * @param investigating 查办案件
     * @return 结果
     */
    @Override
    public int insertInvestigating(Investigating investigating)
    {
        investigating.setId(UUID.randomUUID().toString());
        investigating.setCreateBy(SecurityUtils.getUsername());
        investigating.setCreateTime(DateUtils.getNowDate());
        return investigatingMapper.insertInvestigating(investigating);
    }

    @Override
    public List<Investigating> selectInspectionWorkByPer(String id) {
        return investigatingMapper.selectInvestigatingByPer(id);
    }

    /**
     * 修改查办案件
     * 
     * @param investigating 查办案件
     * @return 结果
     */
    @Override
    public int updateInvestigating(Investigating investigating)
    {
        investigating.setUpdateTime(DateUtils.getNowDate());
        return investigatingMapper.updateInvestigating(investigating);
    }

    /**
     * 批量删除查办案件
     * 
     * @param ids 需要删除的查办案件ID
     * @return 结果
     */
    @Override
    public int deleteInvestigatingByIds(String[] ids)
    {
        return investigatingMapper.deleteInvestigatingByIds(ids);
    }

    /**
     * 删除查办案件信息
     * 
     * @param id 查办案件ID
     * @return 结果
     */
    @Override
    public int deleteInvestigatingById(String id)
    {
        return investigatingMapper.deleteInvestigatingById(id);
    }
}
