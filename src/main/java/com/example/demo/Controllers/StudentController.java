package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.DTO.StudentDTO;
import com.example.demo.Models.Student;
import com.example.demo.Repositaries.StudentRepositary;

@RestController
@RequestMapping(path="api/student")
public class StudentController {

    @Autowired
    private StudentRepositary studentRepository;

    @PostMapping(path="/add")
    public String addNewStudent(@RequestBody StudentDTO student){
        Student stu = Student.builder()
                             .email(student.getEmail())
                             .name(student.getName())
                             .contactNo(student.getContactNo())
                             .build();
        studentRepository.save(stu);
        return "Saved";
    }

    @GetMapping(path = "/")
    public String getMethodName() {
        return "Hi mama thevindu";
    }

    // @GetMapping(path = "/all")
    // public String getAllStudents() {
    //     return "Hi mn Oshada";
    // }
}
