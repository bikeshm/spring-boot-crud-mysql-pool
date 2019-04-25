package com.mytutor.services.interfaces;

import java.util.List;

import com.mytutor.models.UserModel;

public interface MyServiceInterface {

	long addUser(UserModel user);
	UserModel getUser(long id);
	List<UserModel> getUsers();
	long updateUser(long id, UserModel user );
	int deleteUser(long id);
}
