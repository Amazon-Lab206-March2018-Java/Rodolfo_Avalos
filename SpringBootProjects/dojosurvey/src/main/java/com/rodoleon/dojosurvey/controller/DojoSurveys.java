package com.rodoleon.dojosurvey.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller	
public class DojoSurveys {
	
	@RequestMapping("/")
	public String index(HttpSession info) {
		return "index.jsp";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String survey(HttpSession info, @RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment) {
		info.setAttribute("name", name);
		info.setAttribute("location", location);
		info.setAttribute("language", language);
		info.setAttribute("comment", comment);
			return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
}
