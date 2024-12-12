package com.example.spring._docker_postgress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/students")
    public List<Student> getStudents(){
         return studentRepo.findAll();
    }

    @PostMapping("/students")
    public Student getStudents(@RequestBody Student student){
        return studentRepo.save(student);
    }
}
