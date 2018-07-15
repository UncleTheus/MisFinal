package com.demo.mis.domain;

import java.util.List;

public class Course {

    private String courseid;

    private String name;

    private String credit;

    public List<Course> preCourses;

    public List<Section> sections;

    public Course course;

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public List<Course> getPreCourses() {
        return preCourses;
    }

    public void setPreCourses(List<Course> preCourses) {
        this.preCourses = preCourses;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
