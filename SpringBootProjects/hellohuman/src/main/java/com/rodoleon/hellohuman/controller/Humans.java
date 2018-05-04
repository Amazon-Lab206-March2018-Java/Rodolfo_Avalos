package com.rodoleon.hellohuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/your_server")
public class Humans {
	@RequestMapping("/")
	public String name(@RequestParam(value="name", defaultValue ="Human") String name, Model model) {
		model.addAttribute("name", name);
		return "index.jsp";
	}
}
