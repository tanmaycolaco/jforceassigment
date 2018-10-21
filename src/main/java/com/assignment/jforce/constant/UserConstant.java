package com.assignment.jforce.constant;

public interface UserConstant {
	
		/* Querys */
	
	String GET_ALL_USERS = "select id, firstname ,lastname , email , mobile_no , active from user";

	String GET_USER_BY_PASSSWORD_EMAIL = "select id, firstname ,lastname , email , mobile_no , active  from user where email = ? and password = ? and active = ?";
	
	String GET_USER_BY_EMAIL = "select id, firstname ,lastname , email , mobile_no , active from user where email = ? ";
	
	String REGISTER_USER_QUERY = "insert into user( firstname ,lastname , email , mobile_no,password , active , created_date ,created_by ,last_modified_date , last_modified_by)values(?,?,?,?,?,true,now(),?,now(),?) ";
}
