package com.mytutor.dao;

import java.util.List;

import com.mytutor.models.UserModel;

public interface MyDaoInterface {
	long addUser(UserModel user);
	UserModel getUser(long id);
	List<UserModel> getUsers();
	int updateUser(long id, UserModel user );
	int deleteUser(long id);
}
