package com.demo.mis.domain;

import com.demo.mis.specification.MaxCountSpecification;
import com.demo.mis.specification.PlanOfStudySpecification;
import com.demo.mis.specification.PreCourseSpecification;

import java.util.List;

public class Student {
    private String id;

    private String name;

    private String degree;

    private String major;

    private String password;

    public List<Course> getPlanofstudy() {
        return planofstudy;
    }

    public void setPlanofstudy(List<Course> planofstudy) {
        this.planofstudy = planofstudy;
    }

    public List<Transcript> getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(List<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    public List<Course> planofstudy;

    public List<Transcript> transcripts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean matches(List<Transcript> transcripts, Course course) {
        for (Transcript transcript : transcripts) {
            if (course.getCourseid().equals(transcript.getSection().getCourse().getCourseid())) {
                return true;
            }
        }
        return false;
    }

    public boolean CheckPreCourse(List<Course> courses, Student student) {
        this.transcripts = student.getTranscripts();
        for (Course course : courses) {
            if (!this.matches(this.transcripts, course)) {
                return false;
            }
        }
        return true;
    }

    public boolean CanChoose(Section section, Student student) {
        MaxCountSpecification maxCountSpecification = new MaxCountSpecification();
        if (!maxCountSpecification.isSatisfiedBy(section, student)) {
            System.out.println("超过最大容量！请选择其他课程！");
            return false;
        }
        PreCourseSpecification prevCourseSpecification = new PreCourseSpecification();
        if (!prevCourseSpecification.isSatisfiedBy(section, student)) {
            System.out.println("未完成先修课程！");
            return false;
        }
        PlanOfStudySpecification studyPlanSpecification = new PlanOfStudySpecification();
        if (!studyPlanSpecification.isSatisfiedBy(section, student)) {
            System.out.println("该课程不在学习计划中！");
            return false;
        }
        return true;
    }
    public Transcript ChooseSection(Section section,Student student){
        Transcript transcript = new Transcript();
        if(CanChoose(section,student)){
            transcript=TranscriptFactory.CreateTranscript(section,this);
            System.out.println("已成功选课!");
        }
       return transcript;
    }
}
