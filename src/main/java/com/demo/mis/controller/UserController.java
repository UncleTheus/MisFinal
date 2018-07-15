package com.demo.mis.controller;

import com.demo.mis.domain.Professor;
import com.demo.mis.domain.Student;
import com.demo.mis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/studentLogin")
    public ModelAndView loginStu(String id, String password,
                                 ModelAndView mv, HttpSession session) {
        Student student = userService.studentLogin(id,password);
        if(student != null){
            session.setAttribute("student",student);
            mv.setViewName("studentmain");
        }
        else{
            mv.addObject("message","登录名或密码出错，请重新输入！");
            mv.setViewName("index");
        }
        return mv;
    }

    @RequestMapping(value="/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping(value="/studentRegister")
    public String registerStu(Model model, Student student){
        String name = student.getName();
        if(userService.findStudent(name) == null){
            userService.addStudent(student);
            model.addAttribute("message","您已成功注册！");
            System.out.println("+65+9546131313123");
        }
        else{
            model.addAttribute("message","该用户已注册，请登录！");
            return "index";
        }
        return "studentmain";
    }

    @RequestMapping(value="/professorLogin")
    public ModelAndView loginPro(String id, String password,
                                 ModelAndView mv, HttpSession session) {
        Professor professor = userService.professorLogin(id,password);
        if(professor != null){
            session.setAttribute("professor",professor);
            mv.setViewName("professormain");
        }
        else{
            mv.addObject("message","登录名或密码出错，请重新输入！");
            mv.setViewName("index");
        }
        return mv;
    }
}
