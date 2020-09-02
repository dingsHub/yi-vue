package com.ruoyi.system.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.common.core.domain.entity.AreasOfWork;
import com.ruoyi.common.core.domain.entity.SysDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AreasOfWorkMapper;
import com.ruoyi.system.service.IAreasOfWorkService;

/**
 * 擅长工作领域Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-27
 */
@Service
public class AreasOfWorkServiceImpl implements IAreasOfWorkService 
{
    @Autowired
    private AreasOfWorkMapper areasOfWorkMapper;
    /**
     * 得到子节点列表
     */
    private List<com.ruoyi.common.core.domain.entity.AreasOfWork> getChildList(List<com.ruoyi.common.core.domain.entity.AreasOfWork> list, com.ruoyi.common.core.domain.entity.AreasOfWork t)
    {
        List<com.ruoyi.common.core.domain.entity.AreasOfWork> tlist = new ArrayList<com.ruoyi.common.core.domain.entity.AreasOfWork>();
        Iterator<com.ruoyi.common.core.domain.entity.AreasOfWork> it = list.iterator();
        while (it.hasNext())
        {
            com.ruoyi.common.core.domain.entity.AreasOfWork n = (com.ruoyi.common.core.domain.entity.AreasOfWork) it.next();
            if (n.getParentId().longValue() == t.getAreasId().longValue())
            {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<com.ruoyi.common.core.domain.entity.AreasOfWork> list, com.ruoyi.common.core.domain.entity.AreasOfWork t)
    {
        return getChildList(list, t).size() > 0 ? true : false;
    }
    /**
     * 递归列表
     *
     * @param list
     * @param t
     */
    private void recursionFn(List<com.ruoyi.common.core.domain.entity.AreasOfWork> list, com.ruoyi.common.core.domain.entity.AreasOfWork t)
    {
        // 得到子节点列表
        List<com.ruoyi.common.core.domain.entity.AreasOfWork> childList = getChildList(list, t);
        t.setChildren(childList);
        for (com.ruoyi.common.core.domain.entity.AreasOfWork tChild : childList)
        {
            if (hasChild(list, tChild))
            {
                // 判断是否有子节点
                Iterator<com.ruoyi.common.core.domain.entity.AreasOfWork> it = childList.iterator();
                while (it.hasNext())
                {
                    com.ruoyi.common.core.domain.entity.AreasOfWork n = (com.ruoyi.common.core.domain.entity.AreasOfWork) it.next();
                    recursionFn(list, n);
                }
            }
        }
    }
    /**
     * 构建前端所需要树结构
     *
     * @param menus 菜单列表
     * @return 树结构列表
     */
    public List<com.ruoyi.common.core.domain.entity.AreasOfWork> buildMenuTree(List<com.ruoyi.common.core.domain.entity.AreasOfWork> menus)
    {
        List<com.ruoyi.common.core.domain.entity.AreasOfWork> returnList = new ArrayList<com.ruoyi.common.core.domain.entity.AreasOfWork>();
        List<Long> tempList = new ArrayList<Long>();
        for (AreasOfWork dept : menus)
        {
            tempList.add(dept.getAreasId());
        }
        for (Iterator<com.ruoyi.common.core.domain.entity.AreasOfWork> iterator = menus.iterator(); iterator.hasNext();)
        {
            com.ruoyi.common.core.domain.entity.AreasOfWork t = (com.ruoyi.common.core.domain.entity.AreasOfWork) iterator.next();
            // 根据传入的某个父节点ID,遍历该父节点的所有子节点
            if (!tempList.contains(t.getParentId()))
            {
                recursionFn(menus, t);
                returnList.add(t);
            }

        }
        if (returnList.isEmpty())
        {
            returnList = menus;
        }
        return returnList;
    }
    /**
     * 构建前端所需要下拉树结构
     *
     * @param menus 菜单列表
     * @return 下拉树结构列表
     */
    @Override
    public List<TreeSelect> buildMenuTreeSelect(List<com.ruoyi.common.core.domain.entity.AreasOfWork> menus)
    {
        List<com.ruoyi.common.core.domain.entity.AreasOfWork> menuTrees = buildMenuTree(menus);
        return menuTrees.stream().map(TreeSelect::new).collect(Collectors.toList());
    }
    /**
     * 查询擅长工作领域
     * 
     * @param areasId 擅长工作领域ID
     * @return 擅长工作领域
     */
    @Override
    public AreasOfWork selectAreasOfWorkById(Long areasId)
    {
        return areasOfWorkMapper.selectAreasOfWorkById(areasId);
    }

    /**
     * 查询擅长工作领域列表
     * 
     * @param areasOfWork 擅长工作领域
     * @return 擅长工作领域
     */
    @Override
    public List<AreasOfWork> selectAreasOfWorkList(AreasOfWork areasOfWork)
    {
        return areasOfWorkMapper.selectAreasOfWorkList(areasOfWork);
    }

    /**
     * 新增擅长工作领域
     * 
     * @param areasOfWork 擅长工作领域
     * @return 结果
     */
    @Override
    public int insertAreasOfWork(AreasOfWork areasOfWork)
    {
        return areasOfWorkMapper.insertAreasOfWork(areasOfWork);
    }

    /**
     * 修改擅长工作领域
     * 
     * @param areasOfWork 擅长工作领域
     * @return 结果
     */
    @Override
    public int updateAreasOfWork(AreasOfWork areasOfWork)
    {
        return areasOfWorkMapper.updateAreasOfWork(areasOfWork);
    }

    /**
     * 批量删除擅长工作领域
     * 
     * @param areasIds 需要删除的擅长工作领域ID
     * @return 结果
     */
    @Override
    public int deleteAreasOfWorkByIds(Long[] areasIds)
    {
        return areasOfWorkMapper.deleteAreasOfWorkByIds(areasIds);
    }

    /**
     * 删除擅长工作领域信息
     * 
     * @param areasId 擅长工作领域ID
     * @return 结果
     */
    @Override
    public int deleteAreasOfWorkById(Long areasId)
    {
        return areasOfWorkMapper.deleteAreasOfWorkById(areasId);
    }
}
