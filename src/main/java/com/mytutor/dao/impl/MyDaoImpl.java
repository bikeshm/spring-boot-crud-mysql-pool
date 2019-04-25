package com.mytutor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mytutor.dao.interfaces.MyDaoInterface;
import com.mytutor.models.UserModel;

@Repository
public class MyDaoImpl implements MyDaoInterface  {

	@Override
	public long addUser(UserModel user) {
		return 1;
	}

	@Override
	public UserModel getUser(long id) {
		return null;
	}

	@Override
	public List<UserModel> getUsers() {
		return null;
	}

	@Override
	public boolean updateUser(long id, UserModel user) {
		return false;
	}

	@Override
	public boolean deleteUser(long id) {
		return false;
	}

}
