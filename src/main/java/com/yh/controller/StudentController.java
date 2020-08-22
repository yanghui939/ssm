package com.yh.controller;

import com.github.pagehelper.PageInfo;
import com.yh.pojo.Student;
import com.yh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findByPage/{pageIndex}/{pageSize}")
    public String findByPage(Model model,
                          @PathVariable("pageIndex") Integer pageIndex,
                          @PathVariable("pageSize")Integer pageSize){
        System.out.println("StudentController运行了");
        PageInfo<Student> students = studentService.findByPage(pageIndex,pageSize);
        model.addAttribute("students",students);
        System.out.println(students);
        return "success";
    }
}
