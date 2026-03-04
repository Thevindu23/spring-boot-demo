package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;
import com.example.demo.Repositaries.StudentRepositary;

@RestController
@RequestMapping(path="api/student")
public class StudentController {
    @Autowired

    private StudentRepositary StudentRepositary;

    @PostMapping(path="/add")
    public @ResponseBody String addNewStudent(@RequestBody String name, @RequestBody String email ,@RequestBody String ContactNo){
    
    Student stu = new Student();
    stu.setName(name);
    stu.setEmail(email);
    stu.setContactNo(ContactNo);
    StudentRepositary.save(stu);
    return "Saved";
}
}
