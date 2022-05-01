package com.code.mongo.service;

import java.util.List;

import com.code.mongo.model.Student;
import com.code.mongo.repo.StudentRepo;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepo repo;
    public List<Student> getAllStudents(){
        return repo.findAll();
    }
}
