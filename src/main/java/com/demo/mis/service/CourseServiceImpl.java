package com.demo.mis.service;

import com.demo.mis.dao.CourseDao;
import com.demo.mis.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseDao courseDao;

    @Override
    public List<Course> findAll(){
        return  courseDao.findAll();
    }

    @Override
    public void addCourse(Course course){
        courseDao.insertCourse(course);
    }

    @Override
    public Course findById(String courseid){
        return  courseDao.findById(courseid);
    }

    @Override
    public void updateCourse(Course course){
        courseDao.updateCourseById(course);
    }

    @Override
    public void deleteCourse(String courseid){
        courseDao.deleteCourseById(courseid);
    }
}
