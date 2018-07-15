package com.demo.mis.service;

import com.demo.mis.dao.UserDao;
import com.demo.mis.domain.Professor;
import com.demo.mis.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public Student studentLogin(String id,String password){
        Student student = userDao.studentLogin(id,password);
        return student;
    }

    @Override
    public void addStudent(Student student){
        userDao.addStudent(student);
    }

    @Override
    public Student findStudent(String name){
        return userDao.studentfindByname(name);
    }

    @Override
    public Professor findProfessor(String id){
        return userDao.professorfindById(id);
    }

    @Override
    public Professor professorLogin(String id,String password){
        Professor professor = userDao.professorLogin(id,password);
        return professor;
    }
}
