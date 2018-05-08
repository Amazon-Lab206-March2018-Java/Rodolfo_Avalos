package com.rodoleon.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Codes {
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String error) {
		return "index.jsp";
	}
	@RequestMapping(path="/verify", method=RequestMethod.POST)
	public String verify(RedirectAttributes ra, @RequestParam("code") String code) {
		if (code.equals("bushido")) {
			return "redirect:/code";
		} else {
			ra.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
}
