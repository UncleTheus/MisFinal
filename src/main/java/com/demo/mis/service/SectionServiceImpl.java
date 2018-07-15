package com.demo.mis.service;

import com.demo.mis.dao.CourseDao;
import com.demo.mis.dao.SectionDao;
import com.demo.mis.dao.TranscriptDao;
import com.demo.mis.dao.UserDao;
import com.demo.mis.domain.Course;
import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;
import com.demo.mis.domain.Transcript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sectionService")
public class SectionServiceImpl implements SectionService{

    @Autowired
    SectionDao sectionDao;

    @Autowired
    TranscriptDao transcriptDao;

    @Autowired
    CourseDao courseDao;

    @Autowired
    UserDao userDao;

    @Override
    public List<Section> getAll(){
        return  sectionDao.findAll();
    }

    @Override
    public Section getSectionById(String sectionid){
        return  sectionDao.findSectionById(sectionid);
    }

    @Override
    public void selectSection(Section section,Student student) {
        List<Transcript> transcripts = transcriptDao.findTranscriptOfSection(section.getSectionid());
        section.setTranscripts(transcripts);
        Course course = courseDao.findById(section.getCourse().getCourseid());
        section.setCourse(course);
        List<Course> courses = courseDao.getCoursesByStudentId(student.getId());
        student.setPlanofstudy(courses);
        if(student.CanChoose(section,student)){
            Transcript transcript = student.ChooseSection(section,student);
            transcriptDao.insertTranscript(transcript);
        }
    }

    @Override
    public List<Section> getSelectSection(){
        return sectionDao.selectChooseSection();
    }
}
