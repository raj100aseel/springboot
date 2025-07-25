package com.rajtech.studentweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rajtech.studentweb.binding.Student;
import com.rajtech.studentweb.repositories.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository repo;
	
	@GetMapping("/")//http://localhost:8080
	public String loadStudentForm(Model model) {
		return "addStudent";
	}
	
	@PostMapping("/save")
	public String handleSubmit(Student stud, Model model) {
		model.addAttribute("msg","Student Inserted");
		return "addStudent";
	}
}
