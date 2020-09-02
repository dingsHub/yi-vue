package com.ruoyi.web.controller.special.mapper;

import com.ruoyi.web.controller.special.domain.SpecialLecture;

import java.util.List;
/*
 * 专题授课Mapper接口
 * 
 * @author Alan
 * @date 2020-08-28
 */
public interface SpecialLectureMapper 
{
    /**
     * 查询专题授课
     * 
     * @param id 专题授课ID
     * @return 专题授课
     */
    public SpecialLecture selectSpecialLectureById(String id);

    public List<SpecialLecture> selectSpecialLectureByPer(String id);
    /**
     * 查询专题授课列表
     * 
     * @param specialLecture 专题授课
     * @return 专题授课集合
     */
    public List<SpecialLecture> selectSpecialLectureList(SpecialLecture specialLecture);

    /**
     * 新增专题授课
     * 
     * @param specialLecture 专题授课
     * @return 结果
     */
    public int insertSpecialLecture(SpecialLecture specialLecture);

    /**
     * 修改专题授课
     * 
     * @param specialLecture 专题授课
     * @return 结果
     */
    public int updateSpecialLecture(SpecialLecture specialLecture);

    /**
     * 删除专题授课
     * 
     * @param id 专题授课ID
     * @return 结果
     */
    public int deleteSpecialLectureById(String id);

    /**
     * 批量删除专题授课
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpecialLectureByIds(String[] ids);
}
