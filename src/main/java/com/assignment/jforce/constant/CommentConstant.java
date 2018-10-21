package com.assignment.jforce.constant;

public interface CommentConstant {
	
	String GET_COMMENT_QUERY = "select id,comment ,user_id from comment where active= true"; 
	
	String MAKE_COMMENT_QUERY = "insert into comment(comment,user_id,active , created_date ,created_by ,last_modified_date , last_modified_by)values('?,?,true,now(),'system',now(),'system')";

}
