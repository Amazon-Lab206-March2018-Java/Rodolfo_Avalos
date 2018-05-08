package com.rodoleon.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counters {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("counter");
		if (count != null) {
			session.setAttribute("counter", count+1);
			return "index.jsp";
		} else {
			session.setAttribute("counter", 0);
			return "index.jsp";
		}
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer count = (Integer) session.getAttribute("counter");
		model.addAttribute("counter", count);
		return "counter.jsp";
		}
	}
