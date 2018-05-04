package com.rodoleon.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date cdate = new java.util.Date();
		String d = new SimpleDateFormat("EEEE, 'the' d 'of' MMMM, YYYY").format(cdate);
		model.addAttribute("date", d);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date ctime = new java.util.Date();
		String t = new SimpleDateFormat("h:m a").format(ctime);
		model.addAttribute("time", t);
		return "time.jsp";
	}

}
