package com.demo.mis.dao;

import com.demo.mis.domain.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CourseDao {
    @Select("select * from course")
    List<Course> findAll();

    @Select("select * from course where courseid=#{courseid}")
    Course findById(String courseid);


    @Insert("insert into course(number,name,credit) values(#{number},#{name},#{credit})")
    void insertCourse(Course course);

    @Update("update course set name=#{name},credit=#{credit} where courseid=#{courseid}")
    void updateCourseById(Course course);

    @Delete("delete from course where courseid=#{courseid}")
    void deleteCourseById(String courseid);

    @Select("select * from course where courseid in (select course_id from studyplan where student_id = #{id})")
    List<Course> getCoursesByStudentId(String id);

}
