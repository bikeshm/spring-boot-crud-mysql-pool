package com.mytutor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
	
	@RequestMapping("/home")     
    String myHome() {
        return "Hello World!";
    }

}
