package com.demo.mis.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void selectSection(){
        Student student1 = new Student();
        student1.setId("09150001");
        student1.setName("张三");
        student1.setMajor("电子商务");
        student1.setDegree("大三");

        Student student2 = new Student();
        student1.setId("09150002");
        student1.setName("李四");
        student1.setMajor("工商管理");
        student1.setDegree("大四");

        Student student3 = new Student();
        student1.setId("09150003");
        student1.setName("王五");
        student1.setMajor("人力资源管理");
        student1.setDegree("大三");



        Course course1 = new Course();
        course1.setCourseid("CUMT001");
        course1.setName("电子商务基础");
        course1.setCredit("3.0");

        Course course2 = new Course();
        course2.setCourseid("CUMT002");
        course2.setName("信息系统设计与实现");
        course2.setCredit("4.0");

        Course course3 = new Course();
        course3.setCourseid("CUMT003");
        course3.setName("管理信息系统");
        course3.setCredit("3.0");



        Section section1 = new Section();
        section1.setSectionid("001");
        section1.setCapacity(3);
        section1.setRoom("教二B101");
        section1.setDayofweek("星期四");
        section1.setTimeofday("08:00~09:45");

        Section section2 = new Section();
        section2.setSectionid("002");
        section2.setCapacity(2);
        section2.setRoom("教一B203");
        section2.setDayofweek("星期三");
        section2.setTimeofday("10:15~11:05");

        Section section3 = new Section();
        section3.setSectionid("003");
        section3.setCapacity(1);
        section3.setRoom("教四A401");
        section3.setDayofweek("星期二");
        section3.setTimeofday("16:15~18:00");

        Transcript transcript1 = new Transcript();
        transcript1.setStudent(student1);
        transcript1.setSection(section1);

        Transcript transcript2 = new Transcript();
        transcript2.setStudent(student1);
        transcript2.setSection(section2);


        List<Transcript> transcripts1 = new ArrayList<>();
        section1.setTranscripts(transcripts1);

        List<Transcript> transcripts2 = new ArrayList<>();
        section2.setTranscripts(transcripts2);

        //检验学习计划
        List<Course> planofstudy = new ArrayList<>();
        planofstudy.add(course1);
        planofstudy.add(course2);
        student1.setPlanofstudy(planofstudy);

//        //先行课验证
        List<Course> courses = new ArrayList<>();
        courses.add(course2);
//        courses.add(course3);
//        course1.setPreCourses(courses);
        section1.setCourse(course1);
        section2.setCourse(course2);
//        section3.setCourse(course3);

//        Transcript transcript2 = new Transcript();
//        transcript2.setSection(section2);
//        Transcript transcript3 = new Transcript();
//        transcript3.setSection(section3);

//        List<Transcript> transcripts = new ArrayList<>();
////        transcripts.add(transcript2);
////        transcripts.add(transcript3);
//        student1.setTranscripts(transcripts);



        System.out.println(student1.getName()+"选择"+course1.getName());
        if(student1.CanChoose(section1,student1)){
            student1.ChooseSection(section1,student1);
        }
        System.out.println(student1.getName()+"选择"+course2.getName());
        if(student1.CanChoose(section2,student1)){
            student1.ChooseSection(section2,student1);
        }

        }

    }
