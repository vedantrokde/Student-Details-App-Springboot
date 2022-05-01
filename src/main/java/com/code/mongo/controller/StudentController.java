package com.code.mongo.controller;

import java.util.List;

import com.code.mongo.model.Student;
import com.code.mongo.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;
    @GetMapping
    public List<Student> fetchAllStudents() {
        return service.getAllStudents();
    }
}
