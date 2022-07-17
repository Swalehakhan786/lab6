package com.collegefest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.collegefest.util.RestClientUtil;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String home() {
		RestClientUtil util = new RestClientUtil();
		util.getAllArticlesDemo();
		return "home";
	}
}
