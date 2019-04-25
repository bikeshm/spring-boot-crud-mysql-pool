package com.mytutor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping("/home")     
    String myHome() {
        return "Hello World!";
    }
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)     
    String addUser(@RequestBody UserModel user) {
        return myService.addUser(user)>0 ? "user added" : "faild";
    }
	
	
}
