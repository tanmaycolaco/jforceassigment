package com.assignment.jforce.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.assignment.jforce.constant.CommentConstant;
import com.assignment.jforce.dao.CommentDao;
import com.assignment.jforce.mapper.CommentMapper;
import com.assignment.jforce.model.CommentBO;

@Repository
public class CommentDaoImpl implements CommentDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void makeComment(CommentBO comment) {
		 jdbcTemplate.update(CommentConstant.MAKE_COMMENT_QUERY, comment.getComment(),comment.getUser().getId());
	}

	@Override
	public void deleteComment(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getComments() {
		
		return jdbcTemplate.query(CommentConstant.GET_COMMENT_QUERY, new CommentMapper());
	}

}
