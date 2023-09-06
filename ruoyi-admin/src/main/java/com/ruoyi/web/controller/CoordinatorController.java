package com.ruoyi.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Coordinator;
import com.ruoyi.system.service.ICoordinatorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-09-06
 */
@RestController
@RequestMapping("/system/coordinator")
public class CoordinatorController extends BaseController
{
    @Autowired
    private ICoordinatorService coordinatorService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:coordinator:list')")
    @GetMapping("/list")
    public TableDataInfo list(Coordinator coordinator)
    {
        startPage();
        List<Coordinator> list = coordinatorService.selectCoordinatorList(coordinator);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:coordinator:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Coordinator coordinator)
    {
        List<Coordinator> list = coordinatorService.selectCoordinatorList(coordinator);
        ExcelUtil<Coordinator> util = new ExcelUtil<Coordinator>(Coordinator.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:coordinator:query')")
    @GetMapping(value = "/{coordinatorEmail}")
    public AjaxResult getInfo(@PathVariable("coordinatorEmail") String coordinatorEmail)
    {
        return success(coordinatorService.selectCoordinatorByCoordinatorEmail(coordinatorEmail));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:coordinator:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Coordinator coordinator)
    {
        return toAjax(coordinatorService.insertCoordinator(coordinator));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:coordinator:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Coordinator coordinator)
    {
        return toAjax(coordinatorService.updateCoordinator(coordinator));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:coordinator:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{coordinatorEmails}")
    public AjaxResult remove(@PathVariable String[] coordinatorEmails)
    {
        return toAjax(coordinatorService.deleteCoordinatorByCoordinatorEmails(coordinatorEmails));
    }
}
