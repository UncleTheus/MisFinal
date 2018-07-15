package com.demo.mis.dao;

import com.demo.mis.domain.Section;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface SectionDao {
    @Select("select * from section")
    @Results({
            @Result(column = "course_id",
                    property = "course",
                    one = @One(select = "com.demo.mis.dao." +
                            "CourseDao.findById")
            ),
            @Result(column = "professor_id",
                    property = "professor",
                    one = @One(select = "com.demo.mis.dao." +
                            "UserDao.professorfindById")
            )

    })
    List<Section> findAll();

    @Select("select * from section where sectionid = #{sectionid}")
    @Results({
            @Result(column = "id",
                    property = "transcript",
                    many = @Many(select = "com.demo.mis.dao." +
                    "TranscriptDao.findTranscriptOfSection",
                    fetchType = FetchType.LAZY)),
            @Result(column = "course_id",
                    property = "course",
                    one = @One(select = "com.demo.mis.dao." +
                    "CourseDao.findById"))
    })
    Section findSectionById(String sectionid);

    @Select("select * from section where grade is null")
    List<Section> selectChooseSection();
}
