package com.ruoyi.web.controller.personnel.service;


import com.ruoyi.web.controller.personnel.domain.Certificate;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-08-26
 */
public interface ICertificateService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Certificate selectCertificateById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param certificate 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Certificate> selectCertificateList(Certificate certificate);

    /**
     * 新增【请填写功能名称】
     * 
     * @param certificate 【请填写功能名称】
     * @return 结果
     */
    public int insertCertificate(Certificate certificate);

    /**
     * 修改【请填写功能名称】
     * 
     * @param certificate 【请填写功能名称】
     * @return 结果
     */
    public int updateCertificate(Certificate certificate);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCertificateByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCertificateById(String id);

    List<Certificate> getByPersonnel(String id);
}
