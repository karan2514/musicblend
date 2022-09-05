package com.musicblend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.musicblend.model.User;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/index")
	public String homelink()
	{
		return "index.html";
	}
	
	@RequestMapping(path = "/musiclibrary", method = RequestMethod.GET)
	public String explore() {
		return "musiclibrary";
	}
	@RequestMapping(value = "upcomingevents", method = RequestMethod.GET)
	public String events() {
		return "eventstoexplore";
	}
	@RequestMapping(value = "musicStore", method = RequestMethod.GET)
	public String store() {
		return "musicStore";
	}
	@RequestMapping(value = "news", method = RequestMethod.GET)
	public String news() {
		return "news";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(User user, Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	
	
}
