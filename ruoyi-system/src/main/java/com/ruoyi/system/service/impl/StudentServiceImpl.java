package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudentMapper;
import com.ruoyi.system.domain.Student;
import com.ruoyi.system.service.IStudentService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-09-06
 */
@Service
public class StudentServiceImpl implements IStudentService 
{
    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param stuUpi 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Student selectStudentByStuUpi(String stuUpi)
    {
        return studentMapper.selectStudentByStuUpi(stuUpi);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param student 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Student> selectStudentList(Student student)
    {
        return studentMapper.selectStudentList(student);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param student 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStudent(Student student)
    {
        return studentMapper.insertStudent(student);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param student 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStudent(Student student)
    {
        return studentMapper.updateStudent(student);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param stuUpis 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStudentByStuUpis(String[] stuUpis)
    {
        return studentMapper.deleteStudentByStuUpis(stuUpis);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param stuUpi 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteStudentByStuUpi(String stuUpi)
    {
        return studentMapper.deleteStudentByStuUpi(stuUpi);
    }
}
