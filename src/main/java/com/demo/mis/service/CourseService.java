package com.demo.mis.service;

import com.demo.mis.domain.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll();

    Course findById(String courseid);

    void addCourse(Course course);

    void updateCourse(Course course);

    void deleteCourse(String courseid);

}
