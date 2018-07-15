package com.demo.mis.controller;

import com.demo.mis.domain.Section;
import com.demo.mis.domain.Student;
import com.demo.mis.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SectionController {

    @Autowired
    SectionService sectionService;

    @RequestMapping(value="/findSections")
    public String findSections(Model model){
        List<Section> sections = sectionService.getAll();
        model.addAttribute("sections",sections);
        return "studentmain";
    }

    @RequestMapping(value="/findSectionsPro")
    public String findSectionsPro(Model model){
        List<Section> sections = sectionService.getAll();
        model.addAttribute("sections",sections);
        return "professormain";
    }

    @RequestMapping(value="/studentSelectSections")
    public String studentSelectSections(Section section, HttpSession session,Model model){
        Student student = (Student) session.getAttribute("student");
        sectionService.selectSection(section,student);
        model.addAttribute("message","已成功选课");
        return "redirect:/findSections";
    }

    @RequestMapping(value="/findSelectSection")
    public String findSelectSection(Model model){
        List<Section> sections = sectionService.getSelectSection();
        model.addAttribute("sections",sections);
        return "courses";
    }
}



