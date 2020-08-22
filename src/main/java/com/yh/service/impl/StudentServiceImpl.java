package com.yh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yh.dao.StudentDao;
import com.yh.pojo.Student;
import com.yh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public PageInfo<Student> findByPage(Integer pageIndex,Integer pageSize) {
        System.out.println("StudentService运行了");
        PageHelper.startPage(pageIndex,pageSize);
        List<Student> studentList = studentDao.findAll();
        PageInfo<Student> pageInfo = new PageInfo<>(studentList);
        return pageInfo;
    }
}
