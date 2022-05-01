package com.code.mongo.repo;

import java.util.Optional;

import com.code.mongo.model.Student;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {
    Optional<Student> findStudentByEmail(String email);
}
