package com.rodoleon.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ninjas {
	
	@RequestMapping("/")
	public String index(HttpSession ninja) {
		if (ninja.getAttribute("gold") == null){
			Integer gold = 0;
			ninja.setAttribute("gold", gold);
		}
		if (ninja.getAttribute("activities") == null) {
			ArrayList<String> activity = new ArrayList<String>();
			activity.add(0, "No activity yet. Please select an option.");
			ninja.setAttribute("activities", activity);			
		}
		return "index.jsp";
	}
	
	@RequestMapping(path="/process", method=RequestMethod.POST)
	public String process (@RequestParam(value="building") String location, HttpSession ninja) {
		
		Random random = new Random();
		int gold = (int) ninja.getAttribute("gold");
		ArrayList<String> activity = (ArrayList<String>) ninja.getAttribute("activities");
		SimpleDateFormat datedata = new SimpleDateFormat ("MMMM dd, yyyy HH:mm:ss a");
		String date = datedata.format(new Date());
		
		int randomNumber = 0;
		
		if (location.toString() == "farm".toString()) {
		}
		
		switch (location) {
			case "farm":
				randomNumber = random.nextInt(11)+10;
				activity.add(0, "<p class='green'>You travelled to the farm and earned "+randomNumber+" gold. ("+date+")</p>");
				break;
			case "cave":
				randomNumber = random.nextInt(6)+5;
				activity.add(0, "<p class='green'>You searched through the cave and found "+randomNumber+" gold. ("+date+")</p>");
				break;
			case "house":
				randomNumber = random.nextInt(4)+2;
				activity.add(0, "<p class='green'>You worked at the house and earned "+randomNumber+" gold. ("+date+")</p>");
				break;
			case "casino":
				randomNumber = random.nextInt(101)-50;
				ninja.setAttribute("gold", gold);
				if (randomNumber > 0) {
					activity.add(0, "<p class='green'>You gambled in the casino and earned "+randomNumber+" gold. ("+date+")</p>");
				} else {
					activity.add(0, "<p class='red'>You gambled in the casino and lost "+Math.abs(randomNumber)+" gold. Ouch!  ("+date+")</p>");
				}
				break;
		}
		
		gold += randomNumber;
		ninja.setAttribute("gold", gold);
		
		return "redirect:/";
	}
	@RequestMapping("/clear")
	public String clear(HttpSession ninja) {
		ninja.setAttribute("gold", 0);
		((ArrayList<String>) ninja.getAttribute("activities")).clear();
		return "redirect:/";		
	}
}
