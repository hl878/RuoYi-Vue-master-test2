package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Coordinator;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-09-06
 */
public interface ICoordinatorService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param coordinatorEmail 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Coordinator selectCoordinatorByCoordinatorEmail(String coordinatorEmail);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param coordinator 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Coordinator> selectCoordinatorList(Coordinator coordinator);

    /**
     * 新增【请填写功能名称】
     * 
     * @param coordinator 【请填写功能名称】
     * @return 结果
     */
    public int insertCoordinator(Coordinator coordinator);

    /**
     * 修改【请填写功能名称】
     * 
     * @param coordinator 【请填写功能名称】
     * @return 结果
     */
    public int updateCoordinator(Coordinator coordinator);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param coordinatorEmails 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteCoordinatorByCoordinatorEmails(String[] coordinatorEmails);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param coordinatorEmail 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCoordinatorByCoordinatorEmail(String coordinatorEmail);
}
