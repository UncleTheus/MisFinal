package com.demo.mis.service;

import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;

import java.util.List;

public interface SectionService {

    List<Section> getAll();

    Section getSectionById(String sectionid);

    void selectSection(Section section,Student student);

    List<Section> getSelectSection();
}
