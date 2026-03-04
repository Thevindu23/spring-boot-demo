package com.example.demo.Repositaries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Student;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Integer>{

}
