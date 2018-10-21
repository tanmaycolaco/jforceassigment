package com.assignment.jforce.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assignment.jforce.dao.UserDao;
import com.assignment.jforce.model.UserBO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	HttpSession httpSession;
	
	@GetMapping("/all")
	@ResponseBody
	public List getUsers() {
		return userDao.getUsers();
	}
	
	@PostMapping("/auth-user")
	@ResponseBody
	public ResponseEntity<String> authenticateUser(@RequestBody UserBO requestUser) {
		UserBO user = userDao.getUser(requestUser.getEmail(), requestUser.getPassword(), true);
		if(user != null) {
			httpSession.setAttribute("activeUser", user);
			return new ResponseEntity<String>("True", HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Invalid Username Or Password", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/register-user")
	@ResponseBody
	public ResponseEntity<String> registerUser(@RequestBody UserBO requestUser) {
		
		try {
		userDao.registerUser(requestUser);
		UserBO user = userDao.getUser(requestUser.getEmail());
		httpSession.setAttribute("activeUser", user);
		return new ResponseEntity<String>("True", HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);

		}
		
	}

}
