package com.assignment.jforce.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.assignment.jforce.model.UserBO;

public class UserMapper implements RowMapper<UserBO> {

	@Override
	public UserBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserBO user = new UserBO();
		user.setId(rs.getLong("id"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setEmail(rs.getString("email"));
		user.setMobileNumber(rs.getString("mobile_no"));
		user.setActive(rs.getBoolean("active"));
		return user;
	}
	
	

}
