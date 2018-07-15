package com.demo.mis.dao;

import com.demo.mis.domain.Transcript;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TranscriptDao {

    //查询选课记录
    @Select("select * from transcript where student_id = #{id}")
    List<Transcript> findTranscriptById(String id);

    //查询成绩
    @Select("select * from transcript where student_id = #{id} and grade is not null")
    @Results({
            @Result(column = "course_id",
                    property = "course",
                    one = @One(select = "com.demo.mis.dao." +
                            "CourseDao.findById"))
    })
    List<Transcript> findGradesById(String id);

    //插入选课记录
    @Insert("insert into transcript(student_id,section_id) values(#{student.id},#{section.sectionid})")
    void insertTranscript(Transcript transcript);

    @Select("select * from transcript where section_id = #{sectionid}")
    List<Transcript> findTranscriptOfSection(String id);

}
