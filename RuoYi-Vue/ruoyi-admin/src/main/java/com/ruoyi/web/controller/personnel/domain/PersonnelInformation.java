package com.ruoyi.web.controller.personnel.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.web.controller.business.domain.BusinessTraining;
import com.ruoyi.web.controller.inspection.domain.InspectionWork;
import com.ruoyi.web.controller.special.domain.SpecialLecture;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * personnel对象 personnel_information
 * 
 * @author Alan孔
 * @date 2020-08-26
 */
public class PersonnelInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private String ehostCase;
    private String bhostCase;
    private String etoLoan;
    private String btoLoan;
    private String bage;
    private String eage;
    private Long deptId;

    private String dept;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEhostCase() {
        return ehostCase;
    }

    public void setEhostCase(String ehostCase) {
        this.ehostCase = ehostCase;
    }

    public String getBhostCase() {
        return bhostCase;
    }

    public void setBhostCase(String bhostCase) {
        this.bhostCase = bhostCase;
    }

    public String getEtoLoan() {
        return etoLoan;
    }

    public void setEtoLoan(String etoLoan) {
        this.etoLoan = etoLoan;
    }

    public String getBtoLoan() {
        return btoLoan;
    }

    public void setBtoLoan(String btoLoan) {
        this.btoLoan = btoLoan;
    }

    public String getBage() {
        return bage;
    }

    public void setBage(String bage) {
        this.bage = bage;
    }

    public String getEage() {
        return eage;
    }

    public void setEage(String eage) {
        this.eage = eage;
    }

    /** $column.columnComment */
    private String id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String fullName;

    /** '用户性别（0男 1女 2未知）', */
    @Excel(name = "'用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 出生年月 */
    private Date birthTime;

    /** 名族 */
    private String nation;

    /** 籍贯 */
    private String nativePlace;

    /** 出生地 */
    private String birthplace;

    /** 入党时间 */
    private Date joinTime;

    /** 参加工作时间 */
    private Date workTime;

    private String avatarfile;

    private String[] expertises;
    private String expertise;
    public String[] getExpertises() {
        return expertises;
    }

    public void setExpertises(String[] expertises) {
        this.expertises = expertises;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getAvatarfile() {
        return avatarfile;
    }

    public void setAvatarfile(String avatarfile) {
        this.avatarfile = avatarfile;
    }

    /** 政治面貌 */
    private String politicalOutlook;

    /** 现任职务 */
    @Excel(name = "现任职务")
    private String currentPosition;

    /** 职级 */
    private String ranks;

    /** 工作单位 */
    @Excel(name = "工作单位")
    private String workUnit;

    /** 全日制教育 */
    private String fullTime;

    private String fullEducation;

    private String theEducation;

    private String deptName;

    private List<FamilyRelations> familyRelations;

    private List<Certificate> certificate;

    private List<BusinessTraining> businessTrainings;

    private List<InspectionWork> inspectionWorks;
    private List<ActualCombat> actualCombats;

    private List<Investigating> investigatings;
    private List<SpecialLecture> specialLectures;


    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
    }

    public List<BusinessTraining> getBusinessTrainings() {
        return businessTrainings;
    }

    public void setBusinessTrainings(List<BusinessTraining> businessTrainings) {
        this.businessTrainings = businessTrainings;
    }

    public List<InspectionWork> getInspectionWorks() {
        return inspectionWorks;
    }

    public void setInspectionWorks(List<InspectionWork> inspectionWorks) {
        this.inspectionWorks = inspectionWorks;
    }

    public List<ActualCombat> getActualCombats() {
        return actualCombats;
    }

    public void setActualCombats(List<ActualCombat> actualCombats) {
        this.actualCombats = actualCombats;
    }

    public List<Investigating> getInvestigatings() {
        return investigatings;
    }

    public void setInvestigatings(List<Investigating> investigatings) {
        this.investigatings = investigatings;
    }

    public List<SpecialLecture> getSpecialLectures() {
        return specialLectures;
    }

    public void setSpecialLectures(List<SpecialLecture> specialLectures) {
        this.specialLectures = specialLectures;
    }

    public String getFullTime() {
        return fullTime;
    }

    public List<FamilyRelations> getFamilyRelations() {
        return familyRelations;
    }

    public void setFamilyRelations(List<FamilyRelations> familyRelations) {
        this.familyRelations = familyRelations;
    }

    public List<Certificate> getCertificate() {
        return certificate;
    }

    public void setCertificate(List<Certificate> certificate) {
        this.certificate = certificate;
    }

    public void setFullTime(String fullTime) {
        this.fullTime = fullTime;
    }

    public String getFullEducation() {
        return fullEducation;
    }

    public void setFullEducation(String fullEducation) {
        this.fullEducation = fullEducation;
    }

    public String getTheEducation() {
        return theEducation;
    }

    public void setTheEducation(String theEducation) {
        this.theEducation = theEducation;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /** 全日制毕业院校及专业 */
    private String fullGraduated;

    /** 在职教育 */
    private String theJob;

    /** 在职教育毕业院校及专业 */
    private String theJobGraduated;

    /** 身份证号码 */
    private String idNumber;

    /** 人员类型 */
    private String personnelType;

    /** 人员状态 0：在职 1：离职 */
    private String personnelStatus;

    /** 工作简历 */
    private String resume;

    /** $column.columnComment */
    private String isdel;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
    }

    public String getFullName() 
    {
        return fullName;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setBirthTime(Date birthTime) 
    {
        this.birthTime = birthTime;
    }

    public Date getBirthTime() 
    {
        return birthTime;
    }
    public void setNation(String nation) 
    {
        this.nation = nation;
    }

    public String getNation() 
    {
        return nation;
    }
    public void setNativePlace(String nativePlace) 
    {
        this.nativePlace = nativePlace;
    }

    public String getNativePlace() 
    {
        return nativePlace;
    }
    public void setBirthplace(String birthplace) 
    {
        this.birthplace = birthplace;
    }

    public String getBirthplace() 
    {
        return birthplace;
    }
    public void setJoinTime(Date joinTime) 
    {
        this.joinTime = joinTime;
    }

    public Date getJoinTime() 
    {
        return joinTime;
    }
    public void setWorkTime(Date workTime) 
    {
        this.workTime = workTime;
    }

    public Date getWorkTime() 
    {
        return workTime;
    }
    public void setPoliticalOutlook(String politicalOutlook) 
    {
        this.politicalOutlook = politicalOutlook;
    }

    public String getPoliticalOutlook() 
    {
        return politicalOutlook;
    }
    public void setCurrentPosition(String currentPosition) 
    {
        this.currentPosition = currentPosition;
    }

    public String getCurrentPosition() 
    {
        return currentPosition;
    }
    public void setWorkUnit(String workUnit) 
    {
        this.workUnit = workUnit;
    }

    public String getWorkUnit() 
    {
        return workUnit;
    }
    public void setFullGraduated(String fullGraduated)
    {
        this.fullGraduated = fullGraduated;
    }

    public String getFullGraduated() 
    {
        return fullGraduated;
    }
    public void setTheJob(String theJob) 
    {
        this.theJob = theJob;
    }

    public String getTheJob() 
    {
        return theJob;
    }
    public void setTheJobGraduated(String theJobGraduated) 
    {
        this.theJobGraduated = theJobGraduated;
    }

    public String getTheJobGraduated() 
    {
        return theJobGraduated;
    }
    public void setIdNumber(String idNumber) 
    {
        this.idNumber = idNumber;
    }

    public String getIdNumber() 
    {
        return idNumber;
    }
    public void setPersonnelType(String personnelType) 
    {
        this.personnelType = personnelType;
    }

    public String getPersonnelType() 
    {
        return personnelType;
    }
    public void setPersonnelStatus(String personnelStatus) 
    {
        this.personnelStatus = personnelStatus;
    }

    public String getPersonnelStatus() 
    {
        return personnelStatus;
    }
    public void setResume(String resume) 
    {
        this.resume = resume;
    }

    public String getResume() 
    {
        return resume;
    }
    public void setIsdel(String isdel) 
    {
        this.isdel = isdel;
    }

    public String getIsdel() 
    {
        return isdel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fullName", getFullName())
            .append("sex", getSex())
            .append("birthTime", getBirthTime())
            .append("nation", getNation())
            .append("nativePlace", getNativePlace())
            .append("birthplace", getBirthplace())
            .append("joinTime", getJoinTime())
            .append("workTime", getWorkTime())
            .append("politicalOutlook", getPoliticalOutlook())
            .append("currentPosition", getCurrentPosition())
            .append("workUnit", getWorkUnit())
            .append("fullGraduated", getFullGraduated())
            .append("theJob", getTheJob())
            .append("theJobGraduated", getTheJobGraduated())
            .append("idNumber", getIdNumber())
            .append("personnelType", getPersonnelType())
            .append("personnelStatus", getPersonnelStatus())
            .append("resume", getResume())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("isdel", getIsdel())
            .toString();
    }
}
