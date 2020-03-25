package com.kcs.springboot.example.controller;

import com.kcs.springboot.example.data.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/firstController")
public class FirstController {
    @GetMapping("/sayHi")
    public String sayHi(){
        return "Hello man";
    }
    @GetMapping("sayHi/{name}")
    public String sayHi(@PathVariable("name") String name){
        return "Hello "+name;
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return List.of(new Student(1, "Test", "Test Surname", "Test Phone", "Test Email"),
                new Student(2, "t2name", "t2surname", "test2phone", "t2email"));
    }

}
