package com.ruoyi.web.controller.special.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.web.controller.special.domain.SpecialLecture;
import com.ruoyi.web.controller.special.mapper.SpecialLectureMapper;
import com.ruoyi.web.controller.special.service.ISpecialLectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 专题授课Service业务层处理
 * 
 * @author Alan
 * @date 2020-08-28
 */
@Service
public class SpecialLectureServiceImpl implements ISpecialLectureService
{
    @Autowired
    private SpecialLectureMapper specialLectureMapper;

    /**
     * 查询专题授课
     * 
     * @param id 专题授课ID
     * @return 专题授课
     */
    @Override
    public SpecialLecture selectSpecialLectureById(String id)
    {
        return specialLectureMapper.selectSpecialLectureById(id);
    }

    /**
     * 查询专题授课列表
     * 
     * @param specialLecture 专题授课
     * @return 专题授课
     */
    @Override
    public List<SpecialLecture> selectSpecialLectureList(SpecialLecture specialLecture)
    {
        return specialLectureMapper.selectSpecialLectureList(specialLecture);
    }

    /**
     * 新增专题授课
     * 
     * @param specialLecture 专题授课
     * @return 结果
     */
    @Override
    public int insertSpecialLecture(SpecialLecture specialLecture)
    {
        specialLecture.setId(UUID.randomUUID().toString());
        specialLecture.setCreateTime(DateUtils.getNowDate());
        specialLecture.setCreateBy(SecurityUtils.getUsername());
        return specialLectureMapper.insertSpecialLecture(specialLecture);
    }

    /**
     * 修改专题授课
     * 
     * @param specialLecture 专题授课
     * @return 结果
     */
    @Override
    public int updateSpecialLecture(SpecialLecture specialLecture)
    {
        specialLecture.setUpdateBy(SecurityUtils.getUsername());
        specialLecture.setUpdateTime(DateUtils.getNowDate());
        return specialLectureMapper.updateSpecialLecture(specialLecture);
    }

    /**
     * 批量删除专题授课
     * 
     * @param ids 需要删除的专题授课ID
     * @return 结果
     */
    @Override
    public int deleteSpecialLectureByIds(String[] ids)
    {
        return specialLectureMapper.deleteSpecialLectureByIds(ids);
    }

    /**
     * 删除专题授课信息
     * 
     * @param id 专题授课ID
     * @return 结果
     */
    @Override
    public int deleteSpecialLectureById(String id)
    {
        return specialLectureMapper.deleteSpecialLectureById(id);
    }

    @Override
    public List<SpecialLecture> selectInspectionWorkByPer(String id) {
        return specialLectureMapper.selectSpecialLectureByPer(id);
    }
}
