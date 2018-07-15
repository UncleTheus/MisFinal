package com.demo.mis.specification;

import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;

public class MaxCountSpecification implements Specification<Section,Student> {
    @Override
    public boolean isSatisfiedBy(Section section, Student student) {
        if (section.getTranscripts().size() < section.getCapacity()) {
            return true;
        }
        return false;
    }
}

//    @Override
//    public boolean isSatisfiedBy(Section section,Student student){
//        int maxCapacity = section.getCapacity();
//        boolean count = section.g
//    }
//}
