package com.assignment.jforce.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.assignment.jforce.model.CommentBO;
import com.assignment.jforce.model.UserBO;

public class CommentMapper implements RowMapper<CommentBO> {

	@Override
	public CommentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CommentBO comment = new CommentBO();
		comment.setId(rs.getLong("id"));
		comment.setComment(rs.getString("comment"));
		UserBO user = new UserBO();
		user.setId(rs.getLong("user_id"));
		comment.setUser(user);
		return comment;
		
	}
	
	

}
