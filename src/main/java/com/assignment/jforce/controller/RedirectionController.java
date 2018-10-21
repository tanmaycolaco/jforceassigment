package com.assignment.jforce.controller;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.assignment.jforce.model.UserBO;

@Controller
public class RedirectionController {
	
	@Autowired
	HttpSession httpSession;
	
	@GetMapping("/home")
	public String redirectToHome() {
		UserBO user = (UserBO) httpSession.getAttribute("activeUser");
		if(user != null) {
			return "home";
		}
		return "login";
		
	}
	

}
