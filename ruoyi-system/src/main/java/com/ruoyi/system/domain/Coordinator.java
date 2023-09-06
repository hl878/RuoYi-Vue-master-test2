package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 coordinator
 * 
 * @author ruoyi
 * @date 2023-09-06
 */
public class Coordinator extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String coordinatorType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String coordinatorName;

    /** $column.columnComment */
    private String coordinatorEmail;

    public void setCoordinatorType(String coordinatorType) 
    {
        this.coordinatorType = coordinatorType;
    }

    public String getCoordinatorType() 
    {
        return coordinatorType;
    }
    public void setCoordinatorName(String coordinatorName) 
    {
        this.coordinatorName = coordinatorName;
    }

    public String getCoordinatorName() 
    {
        return coordinatorName;
    }
    public void setCoordinatorEmail(String coordinatorEmail) 
    {
        this.coordinatorEmail = coordinatorEmail;
    }

    public String getCoordinatorEmail() 
    {
        return coordinatorEmail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("coordinatorType", getCoordinatorType())
            .append("coordinatorName", getCoordinatorName())
            .append("coordinatorEmail", getCoordinatorEmail())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
