package com.mytutor.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mytutor.dao.MyDaoInterface;
import com.mytutor.models.UserModel;
import com.mytutor.services.MyServiceInterface;

@Service
public class MyServiceImpl implements MyServiceInterface {

	@Autowired
	MyDaoInterface myDao;
	
	
	@Override
	@Transactional
	public long addUser(UserModel user) {
		
		//Service logic
		
		return myDao.addUser(user);
	}

	@Override
	@Transactional
	public UserModel getUser(long id) {
		return null;
	}

	@Override
	@Transactional
	public List<UserModel> getUsers() {
		return myDao.getUsers();
	}

	@Override
	@Transactional
	public long updateUser(long id, UserModel user) {
		return myDao.updateUser(id, user);
	}

	@Override
	@Transactional
	public int deleteUser(long id) {
		return myDao.deleteUser(id);
	}

}
