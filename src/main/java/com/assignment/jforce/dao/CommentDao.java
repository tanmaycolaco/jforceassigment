package com.assignment.jforce.dao;

import java.util.List;

import com.assignment.jforce.model.CommentBO;

public interface CommentDao {
	
	public void makeComment(CommentBO comment);
	
	public void deleteComment(Long id);
	
	public List getComments();

}
