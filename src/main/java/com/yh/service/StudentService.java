package com.yh.service;

import com.github.pagehelper.PageInfo;
import com.yh.pojo.Student;

public interface StudentService {

    PageInfo<Student> findByPage(Integer pageIndex, Integer pageNum);
}
