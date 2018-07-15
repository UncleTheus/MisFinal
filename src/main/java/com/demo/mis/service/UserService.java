package com.demo.mis.service;

import com.demo.mis.domain.Professor;
import com.demo.mis.domain.Student;

public interface UserService {

    Student studentLogin(String id,String password);

    void addStudent(Student student);

    Student findStudent(String name);

    Professor findProfessor(String id);

    Professor professorLogin(String id,String password);
}
