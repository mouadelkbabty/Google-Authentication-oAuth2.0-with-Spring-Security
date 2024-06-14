package com.saml.controller;

import com.saml.Repository.StudentRepository;
import com.saml.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/api/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
