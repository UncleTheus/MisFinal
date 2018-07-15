package com.demo.mis.service;

import com.demo.mis.dao.TranscriptDao;
import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;
import com.demo.mis.domain.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("transcriptService")
public class TranscriptServiceImpl implements TranscriptService {

    @Autowired
    TranscriptDao transcriptDao;

    public List<Transcript> getTranscriptById(Student student) {
        return transcriptDao.findTranscriptById(student.getId());
    }

    public List<Transcript> getGradeById(Student student){
        return  transcriptDao.findGradesById(student.getId());
    }


}
