package com.demo.mis.controller;

import com.demo.mis.domain.Course;
import com.demo.mis.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(value="findCourses")
    public String findCourses(Model model){
        List<Course> courses = courseService.findAll();
        model.addAttribute("courses",courses);
        return "studentmain";
    }

    @RequestMapping(value="addCourse")
    public String addCourse(Model model,Course course){
        courseService.addCourse(course);
       return findCourses(model);
    }
    @RequestMapping(value="updateCourse")
    public String updateCourse(Model model,Course course){
        courseService.updateCourse(course);
        return findCourses(model);
    }
    @RequestMapping(value="deleteCourse")
    public String deleteCourse(Model model,Course course){
        courseService.deleteCourse(course.getCourseid());
        return findCourses(model);
    }

}
