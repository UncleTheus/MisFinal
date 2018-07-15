package com.demo.mis.specification;

public interface Specification<Section,Student> {
   boolean isSatisfiedBy(Section section,Student student);
}
