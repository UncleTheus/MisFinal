package com.demo.mis.specification;

import com.demo.mis.domain.Course;
import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;

public class PlanOfStudySpecification implements Specification<Section,Student> {
    @Override
    public boolean isSatisfiedBy(Section section, Student student) {
        for(Course planofstudy : student.getPlanofstudy()){
            if(section.getCourse().getCourseid().equals(
                    planofstudy.getCourseid())){
                return true;
            }
        }
        return false;
    }
}
