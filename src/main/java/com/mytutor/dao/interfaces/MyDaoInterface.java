package com.mytutor.dao.interfaces;

import java.util.List;

import com.mytutor.models.UserModel;

public interface MyDaoInterface {
	long addUser(UserModel user);
	UserModel getUser(long id);
	List<UserModel> getUsers();
	boolean updateUser(long id, UserModel user );
	boolean deleteUser(long id);
}
