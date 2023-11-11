package com.example.fristproject.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    private int id;
    private String name;
    private String email;
    private String genger;
    private  int roll;
    private  int age;
}
