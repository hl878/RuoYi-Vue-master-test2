package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CoordinatorMapper;
import com.ruoyi.system.domain.Coordinator;
import com.ruoyi.system.service.ICoordinatorService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-09-06
 */
@Service
public class CoordinatorServiceImpl implements ICoordinatorService 
{
    @Autowired
    private CoordinatorMapper coordinatorMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param coordinatorEmail 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Coordinator selectCoordinatorByCoordinatorEmail(String coordinatorEmail)
    {
        return coordinatorMapper.selectCoordinatorByCoordinatorEmail(coordinatorEmail);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param coordinator 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Coordinator> selectCoordinatorList(Coordinator coordinator)
    {
        return coordinatorMapper.selectCoordinatorList(coordinator);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param coordinator 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCoordinator(Coordinator coordinator)
    {
        coordinator.setCreateTime(DateUtils.getNowDate());
        return coordinatorMapper.insertCoordinator(coordinator);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param coordinator 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCoordinator(Coordinator coordinator)
    {
        coordinator.setUpdateTime(DateUtils.getNowDate());
        return coordinatorMapper.updateCoordinator(coordinator);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param coordinatorEmails 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCoordinatorByCoordinatorEmails(String[] coordinatorEmails)
    {
        return coordinatorMapper.deleteCoordinatorByCoordinatorEmails(coordinatorEmails);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param coordinatorEmail 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCoordinatorByCoordinatorEmail(String coordinatorEmail)
    {
        return coordinatorMapper.deleteCoordinatorByCoordinatorEmail(coordinatorEmail);
    }
}
