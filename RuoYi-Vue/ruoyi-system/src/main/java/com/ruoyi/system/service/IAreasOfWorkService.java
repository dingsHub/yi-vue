package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.common.core.domain.entity.AreasOfWork;

/**
 * 擅长工作领域Service接口
 * 
 * @author ruoyi
 * @date 2020-08-27
 */
public interface IAreasOfWorkService 
{
    /**
     * 查询擅长工作领域
     * 
     * @param areasId 擅长工作领域ID
     * @return 擅长工作领域
     */
    public AreasOfWork selectAreasOfWorkById(Long areasId);

    /**
     * 查询擅长工作领域列表
     * 
     * @param areasOfWork 擅长工作领域
     * @return 擅长工作领域集合
     */
    public List<AreasOfWork> selectAreasOfWorkList(AreasOfWork areasOfWork);

    /**
     * 新增擅长工作领域
     * 
     * @param areasOfWork 擅长工作领域
     * @return 结果
     */
    public int insertAreasOfWork(AreasOfWork areasOfWork);

    /**
     * 修改擅长工作领域
     * 
     * @param areasOfWork 擅长工作领域
     * @return 结果
     */
    public int updateAreasOfWork(AreasOfWork areasOfWork);

    /**
     * 批量删除擅长工作领域
     * 
     * @param areasIds 需要删除的擅长工作领域ID
     * @return 结果
     */
    public int deleteAreasOfWorkByIds(Long[] areasIds);

    /**
     * 删除擅长工作领域信息
     * 
     * @param areasId 擅长工作领域ID
     * @return 结果
     */
    public int deleteAreasOfWorkById(Long areasId);

    public List<TreeSelect> buildMenuTreeSelect(List<com.ruoyi.common.core.domain.entity.AreasOfWork> menus);
}
