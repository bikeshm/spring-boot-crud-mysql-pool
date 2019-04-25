package com.mytutor.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytutor.dao.interfaces.MyDaoInterface;
import com.mytutor.models.UserModel;
import com.mytutor.services.interfaces.MyServiceInterface;

@Service
public class MyServiceImpl implements MyServiceInterface {

	@Autowired
	MyDaoInterface myDao;
	
	
	@Override
	public long addUser(UserModel user) {
		
		//Service logic
		
		return myDao.addUser(user);
	}

	@Override
	public UserModel getUser(long id) {
		return null;
	}

	@Override
	public List<UserModel> getUsers() {
		return myDao.getUsers();
	}

	@Override
	public long updateUser(long id, UserModel user) {
		return myDao.updateUser(id, user);
	}

	@Override
	public int deleteUser(long id) {
		return myDao.deleteUser(id);
	}

}
