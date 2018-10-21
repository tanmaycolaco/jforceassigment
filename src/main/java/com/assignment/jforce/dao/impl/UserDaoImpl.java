package com.assignment.jforce.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.assignment.jforce.constant.UserConstant;
import com.assignment.jforce.dao.UserDao;
import com.assignment.jforce.mapper.UserMapper;
import com.assignment.jforce.model.UserBO;


@Repository
public class UserDaoImpl implements UserDao {
	
//	 @Autowired
//     private DataSource dataSource;
	 
	 @Autowired
     private JdbcTemplate jdbcTemplate;
     
//     public void setDataSource(DataSource dataSource) {
//         this.dataSource = dataSource;
//         this.jdbcTemplate = new JdbcTemplate(dataSource);
// }

	@Override
	public UserBO getUser(String email, String password ,Boolean active) {
		try {
			return jdbcTemplate.queryForObject(UserConstant.GET_USER_BY_PASSSWORD_EMAIL, new Object[] {email,password,active}, new UserMapper());
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
		
	}

	@Override
	public UserBO getUser(String email) {
		try {
				return  jdbcTemplate.queryForObject(UserConstant.GET_USER_BY_EMAIL, new Object[] {email}, new UserMapper());
		}catch(EmptyResultDataAccessException e) {
				return null;
		}
		
	}

	@Override
	public UserBO registerUser(UserBO user) {
		jdbcTemplate.update(UserConstant.REGISTER_USER_QUERY, user.getFirstname(),user.getLastname(),user.getEmail(),user.getMobileNumber(),user.getPassword(),"system","system");
		return null;
	}

	@Override
	public List getUsers() {
		
		return jdbcTemplate.query(UserConstant.GET_ALL_USERS, new UserMapper());
	}

}
