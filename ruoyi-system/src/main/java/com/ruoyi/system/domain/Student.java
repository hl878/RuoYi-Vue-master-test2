package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 student
 * 
 * @author ruoyi
 * @date 2023-09-06
 */
public class Student extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuName;

    /** $column.columnComment */
    private String stuUpi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long stuAuid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuEmail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuCurrentOverseas;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuCurrentOverseasBacknz;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuCitizen;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuCitizenVisa;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuEnrolmentDetail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuEducation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuTaorgta;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuTaortgaContracts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long stuMaximumWorktime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long stuGrade;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuWhyQualify;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuExperience;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuApplicationStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stuStudyed;

    public void setStuName(String stuName) 
    {
        this.stuName = stuName;
    }

    public String getStuName() 
    {
        return stuName;
    }
    public void setStuUpi(String stuUpi) 
    {
        this.stuUpi = stuUpi;
    }

    public String getStuUpi() 
    {
        return stuUpi;
    }
    public void setStuAuid(Long stuAuid) 
    {
        this.stuAuid = stuAuid;
    }

    public Long getStuAuid() 
    {
        return stuAuid;
    }
    public void setStuEmail(String stuEmail) 
    {
        this.stuEmail = stuEmail;
    }

    public String getStuEmail() 
    {
        return stuEmail;
    }
    public void setStuCurrentOverseas(String stuCurrentOverseas) 
    {
        this.stuCurrentOverseas = stuCurrentOverseas;
    }

    public String getStuCurrentOverseas() 
    {
        return stuCurrentOverseas;
    }
    public void setStuCurrentOverseasBacknz(String stuCurrentOverseasBacknz) 
    {
        this.stuCurrentOverseasBacknz = stuCurrentOverseasBacknz;
    }

    public String getStuCurrentOverseasBacknz() 
    {
        return stuCurrentOverseasBacknz;
    }
    public void setStuCitizen(String stuCitizen) 
    {
        this.stuCitizen = stuCitizen;
    }

    public String getStuCitizen() 
    {
        return stuCitizen;
    }
    public void setStuCitizenVisa(String stuCitizenVisa) 
    {
        this.stuCitizenVisa = stuCitizenVisa;
    }

    public String getStuCitizenVisa() 
    {
        return stuCitizenVisa;
    }
    public void setStuEnrolmentDetail(String stuEnrolmentDetail) 
    {
        this.stuEnrolmentDetail = stuEnrolmentDetail;
    }

    public String getStuEnrolmentDetail() 
    {
        return stuEnrolmentDetail;
    }
    public void setStuEducation(String stuEducation) 
    {
        this.stuEducation = stuEducation;
    }

    public String getStuEducation() 
    {
        return stuEducation;
    }
    public void setStuTaorgta(String stuTaorgta) 
    {
        this.stuTaorgta = stuTaorgta;
    }

    public String getStuTaorgta() 
    {
        return stuTaorgta;
    }
    public void setStuTaortgaContracts(String stuTaortgaContracts) 
    {
        this.stuTaortgaContracts = stuTaortgaContracts;
    }

    public String getStuTaortgaContracts() 
    {
        return stuTaortgaContracts;
    }
    public void setStuMaximumWorktime(Long stuMaximumWorktime) 
    {
        this.stuMaximumWorktime = stuMaximumWorktime;
    }

    public Long getStuMaximumWorktime() 
    {
        return stuMaximumWorktime;
    }
    public void setStuGrade(Long stuGrade) 
    {
        this.stuGrade = stuGrade;
    }

    public Long getStuGrade() 
    {
        return stuGrade;
    }
    public void setStuWhyQualify(String stuWhyQualify) 
    {
        this.stuWhyQualify = stuWhyQualify;
    }

    public String getStuWhyQualify() 
    {
        return stuWhyQualify;
    }
    public void setStuExperience(String stuExperience) 
    {
        this.stuExperience = stuExperience;
    }

    public String getStuExperience() 
    {
        return stuExperience;
    }
    public void setStuApplicationStatus(String stuApplicationStatus) 
    {
        this.stuApplicationStatus = stuApplicationStatus;
    }

    public String getStuApplicationStatus() 
    {
        return stuApplicationStatus;
    }
    public void setStuStudyed(String stuStudyed) 
    {
        this.stuStudyed = stuStudyed;
    }

    public String getStuStudyed() 
    {
        return stuStudyed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stuName", getStuName())
            .append("stuUpi", getStuUpi())
            .append("stuAuid", getStuAuid())
            .append("stuEmail", getStuEmail())
            .append("stuCurrentOverseas", getStuCurrentOverseas())
            .append("stuCurrentOverseasBacknz", getStuCurrentOverseasBacknz())
            .append("stuCitizen", getStuCitizen())
            .append("stuCitizenVisa", getStuCitizenVisa())
            .append("stuEnrolmentDetail", getStuEnrolmentDetail())
            .append("stuEducation", getStuEducation())
            .append("stuTaorgta", getStuTaorgta())
            .append("stuTaortgaContracts", getStuTaortgaContracts())
            .append("stuMaximumWorktime", getStuMaximumWorktime())
            .append("stuGrade", getStuGrade())
            .append("stuWhyQualify", getStuWhyQualify())
            .append("stuExperience", getStuExperience())
            .append("stuApplicationStatus", getStuApplicationStatus())
            .append("stuStudyed", getStuStudyed())
            .toString();
    }
}
