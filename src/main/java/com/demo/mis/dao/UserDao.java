package com.demo.mis.dao;

import com.demo.mis.domain.Professor;
import com.demo.mis.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao {

    @Select("select * from student where id=#{id} and password=#{password}")
    Student studentLogin(@Param("id")String id,@Param("password")String password);

    @Select("select * from student where name=#{name}")
    Student studentfindByname(String name);

    @Select("select * from student where id=#{id}")
    Student studentfindById(String id);

    @Insert("insert into student(id,name,degree,major,password) values(#{id},#{name},#{degree},#{major},#{password})")
    void addStudent(Student student);

    @Select("select * from professor where id=#{id}")
    Professor professorfindById(String id);

    @Select("select * from professor where id=#{id} and password=#{password}")
    Professor professorLogin(@Param("id")String id,@Param("password")String password);
}
