package com.rodoleon.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Learningplatformcontrollers {
	@RequestMapping()
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("m/{chapter}/0483/{assignmentnumber}")
	public String assignment(@PathVariable("chapter") String chapter, @PathVariable("assignmentnumber") String assign, Model model) {
		switch (assign) {
		case "0345":
			model.addAttribute("display", "Coding Forms");
			break;
		case "2342":
			model.addAttribute("display", "Fortran to Binary");
			break;
		}
		return "assignment.jsp";
	}
	@RequestMapping("m/{chapter}/0553/{lesson}")
	public String lesson(@PathVariable("chapter") String chapter, @PathVariable("lesson") String lesson, Model model) {
		switch (lesson) {
		case "0733":
			model.addAttribute("display", "Setting up your servers");
			break;
		case "0342":
			model.addAttribute("display", "Punch Cards");
			break;
		case "0348":
			model.addAttribute("display", "Advanced Fortran Info");
			break;
		}
		return "lesson.jsp";
	}
}
