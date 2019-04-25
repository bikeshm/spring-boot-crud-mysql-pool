package com.mytutor.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytutor.models.UserModel;
import com.mytutor.services.interfaces.MyServiceInterface;


@RestController
public class MyFirstController {

	@Autowired
	MyServiceInterface myService;

	@RequestMapping("/")
	String myHome(HttpServletResponse response) {
		
		response.setStatus(201); // setting custom response code
		return "Hello World!";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	String addUser(@RequestBody UserModel user) {
		return myService.addUser(user) > 0 ? "user added" : "faild";
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public UserModel getUserById(@PathVariable("id") long id) {

		return myService.getUser(id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<UserModel> getUsers() {

		return myService.getUsers();
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public String updateUser(@PathVariable("id") long id, @RequestBody UserModel user) {
		return myService.updateUser(id, user) >0 ? "user updated" : "faild";
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable("id") long id) {

		return myService.deleteUser(id)>0 ? "user delete" : "faild";
	}

}


