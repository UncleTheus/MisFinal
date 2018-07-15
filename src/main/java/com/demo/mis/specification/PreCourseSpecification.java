package com.demo.mis.specification;

import com.demo.mis.domain.Course;
import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class PreCourseSpecification implements Specification<Section,Student> {
    @Override
    public boolean isSatisfiedBy(Section section, Student student) {
        List<Course> courses = new ArrayList<>();
        if(section.getCourse().getPreCourses()!=null) {
            for (Course preCourse : section.getCourse().getPreCourses()) {
                courses.add(preCourse);
            }
            return student.CheckPreCourse(courses, student);
        }
        return true;
    }
}
