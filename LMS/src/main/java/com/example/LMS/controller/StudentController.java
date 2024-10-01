package com.example.LMS.controller;

import com.example.LMS.RequestDto.studentDto;
import com.example.LMS.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
class StudentController {
    @Autowired
    StudentService SS;
    @PostMapping("/add")
    public String addStudent(@RequestBody studentDto s1){
            SS.addStudent(s1);
            return "Student Added";
    }
}
