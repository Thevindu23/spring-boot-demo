package com.example.demo.Models;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "students")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Nullable Integer id;

    private String name;

    private String email;

    private String contactNo;

    // public Student(name,email,contactNo){
    //         this.name = name;
    //         this.email = email;
    //         this.contactNo = contactNo;
    // }

}
