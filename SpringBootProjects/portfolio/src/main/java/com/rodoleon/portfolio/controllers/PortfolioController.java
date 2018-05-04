package com.rodoleon.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortfolioController {
	@RequestMapping("/")
	public String index() {
		return "/index.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		return "/projects.html";
	}
	
	@RequestMapping("/me")
	public String me() {
		return "forward:/me.html";
	}

}
