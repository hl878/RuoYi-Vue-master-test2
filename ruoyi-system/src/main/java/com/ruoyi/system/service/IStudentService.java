package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Student;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-09-06
 */
public interface IStudentService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param stuUpi 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Student selectStudentByStuUpi(String stuUpi);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param student 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增【请填写功能名称】
     * 
     * @param student 【请填写功能名称】
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改【请填写功能名称】
     * 
     * @param student 【请填写功能名称】
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param stuUpis 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteStudentByStuUpis(String[] stuUpis);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param stuUpi 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteStudentByStuUpi(String stuUpi);
}
