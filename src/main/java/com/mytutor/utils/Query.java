package com.mytutor.utils;

public final class Query {

	    public static final String GET_USERS_QUERY =  "SELECT * from users";
	    public static final String GET_USER_QUERY =  "SELECT * from users WHERE id = ?";
		public static final String ADD_USER_QUERY = "INSERT INTO users (name, email) values (?,?)";
		public static final String UPDATE_USER_QUERY = "UPDATE users SET name = ? , email = ? where id = ?";
		public static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id = ?";
}
