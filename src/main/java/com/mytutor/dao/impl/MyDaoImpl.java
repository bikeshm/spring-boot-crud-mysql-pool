package com.mytutor.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mytutor.dao.interfaces.MyDaoInterface;
import com.mytutor.mapper.UserMapper;
import com.mytutor.models.UserModel;
import com.mytutor.utils.Query;

@Repository
public class MyDaoImpl implements MyDaoInterface  {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public long addUser(UserModel user) {
		return jdbcTemplate.update(Query.ADD_USER_QUERY, user.getName(), user.getEmail());
	}

	@Override
	public UserModel getUser(long id) {
		return jdbcTemplate.queryForObject(Query.GET_USER_QUERY, new UserMapper(), id);
	}

	@Override
	public List<UserModel> getUsers() {
        return this.jdbcTemplate.query(Query.GET_USERS_QUERY,new UserMapper() );
	}

	@Override
	public int updateUser(long id, UserModel user) {
		return jdbcTemplate.update(Query.UPDATE_USER_QUERY, user.getName(), user.getEmail(), user.getId());
	}

	@Override
	public int deleteUser(long id) {
		return jdbcTemplate.update(Query.DELETE_USER_QUERY, id);
	}

}
