package ru.geekbrains.mvc_example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.geekbrains.mvc_example.services.StudentService;

@Controller
public class StudentController {


    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/index")
    public String adminCategoriesPage(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }

}
