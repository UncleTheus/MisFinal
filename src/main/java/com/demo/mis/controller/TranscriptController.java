package com.demo.mis.controller;

import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;
import com.demo.mis.domain.Transcript;
import com.demo.mis.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TranscriptController {

    @Autowired
    TranscriptService transcriptService;

    @RequestMapping(value="/findGrades")
    public String findGrades(HttpSession session,Model model){
        Student student = (Student) session.getAttribute("student");
        List<Transcript> transcript = transcriptService.getGradeById(student);
        model.addAttribute("grade",transcript);
        return "grade";

    }
}
