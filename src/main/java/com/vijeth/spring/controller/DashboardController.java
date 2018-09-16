package com.vijeth.spring.controller;

import java.util.Arrays;
import java.util.List;

import com.vijeth.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	ModelAndView model = new ModelAndView();
    	model.addObject("users", getUsers());
    	model.setViewName("dashboard");
    	return model;
    }

	private List<User> getUsers() {
		User user = new User();
		user.setEmail("vijethk@gmail.com");
		user.setName("Vijeth K");
		user.setAddress("Bangalore, Karnataka");

		User user1 = new User();
		user1.setEmail("bharathpg@yahoo.com");
		user1.setName("Bharath Gowdra");
		user1.setAddress("Bangalore, Karnataka");

		User user2 = new User();
		user2.setEmail("prasanna.bhat@gmail.com");
		user2.setName("Prasanna Bhat");
		user2.setAddress("Bangalore, Karnataka");

		User user3 = new User();
		user3.setEmail("mahesh.saka@gmail.com");
		user3.setName("Mahesh Saka");
		user3.setAddress("Hyderabad, Andhra Pradesh");

		return Arrays.asList(user, user1, user2, user3);
	}

}
