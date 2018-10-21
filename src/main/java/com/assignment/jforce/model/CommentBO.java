package com.assignment.jforce.model;

import javax.persistence.Entity;

public class CommentBO extends BaseBO {
	
	private String comment;
	
	private UserBO user;
	
	private String likeCount;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public UserBO getUser() {
		return user;
	}

	public void setUser(UserBO user) {
		this.user = user;
	}

	public String getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}
	
	

}
