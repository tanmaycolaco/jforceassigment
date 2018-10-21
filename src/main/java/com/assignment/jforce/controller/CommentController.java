package com.assignment.jforce.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.jforce.dao.CommentDao;
import com.assignment.jforce.model.CommentBO;
import com.assignment.jforce.model.UserBO;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentDao commentDao;
	
	@Autowired
	HttpSession httpSession;
	
	@PostMapping("/make-comment")
	public ResponseEntity<String> makeComment(@RequestBody CommentBO commentBO) {
		try {
			UserBO userBO = (UserBO) httpSession.getAttribute("activeUser");
			commentBO.setUser(userBO);
			commentDao.makeComment(commentBO);
			return new ResponseEntity<String>("True",HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getComments() {
		try {
			return new ResponseEntity<List>(commentDao.getComments(),HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}

}
