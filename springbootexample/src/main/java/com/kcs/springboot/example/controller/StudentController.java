package com.kcs.springboot.example.controller;

import com.kcs.springboot.example.data.Student;
import com.kcs.springboot.example.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentController {
    private StudentsService studentsService;

    @Autowired
    public StudentController(StudentsService studentsService) {
        this.studentsService = studentsService;

    }

    @GetMapping
    public List<Student> getStudents() {
        return studentsService.getStudents();

    }

    @GetMapping("/{studentId}")
    public Student getStudents(@PathVariable("studentId") String studentid) {
        return studentsService.getStudents(studentid);
    }
    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentsService.createStudent(student);
    }
}
