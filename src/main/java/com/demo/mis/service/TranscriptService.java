package com.demo.mis.service;

import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;
import com.demo.mis.domain.Transcript;

import java.util.List;

public interface TranscriptService {

    List<Transcript> getTranscriptById(Student student);

    List<Transcript> getGradeById(Student student);





}
