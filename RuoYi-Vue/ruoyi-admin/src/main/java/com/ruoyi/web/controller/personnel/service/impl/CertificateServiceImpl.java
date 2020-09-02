package com.ruoyi.web.controller.personnel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.web.controller.personnel.domain.Certificate;
import com.ruoyi.web.controller.personnel.mapper.CertificateMapper;
import com.ruoyi.web.controller.personnel.service.ICertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-26
 */
@Service
public class CertificateServiceImpl implements ICertificateService
{
    @Autowired
    private CertificateMapper certificateMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Certificate selectCertificateById(String id)
    {
        return certificateMapper.selectCertificateById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param certificate 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Certificate> selectCertificateList(Certificate certificate)
    {
        return certificateMapper.selectCertificateList(certificate);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param certificate 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCertificate(Certificate certificate)
    {
        certificate.setCreateTime(DateUtils.getNowDate());
        return certificateMapper.insertCertificate(certificate);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param certificate 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCertificate(Certificate certificate)
    {
        certificate.setUpdateTime(DateUtils.getNowDate());
        return certificateMapper.updateCertificate(certificate);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCertificateByIds(String[] ids)
    {
        return certificateMapper.deleteCertificateByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCertificateById(String id)
    {
        return certificateMapper.deleteCertificateById(id);
    }

    @Override
    public List<Certificate> getByPersonnel(String id) {
        return certificateMapper.getByPersonnel(id);
    }
}
