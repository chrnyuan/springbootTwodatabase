package com.how2j.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.how2j.springboot.pojo.User;
import com.how2j.springboot.service.UserService;

@RestController
public class TestDataSourceController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/adddb1")
	public String adddb1User(){
		System.out.println("111");
		User user = new User();
		user.setAge(11);
		user.setId(1L);
		user.setName("jock");
		int i = userService.addUser(user );
		if (i==1) {
			return "success";
		}
		return "fail";
		
	}

	
	@RequestMapping("/adddb2")
	public String adddb2User(){
		System.out.println("111");
		User user = new User();
		user.setAge(11);
		user.setId(1L);
		user.setName("huhu");
		int i = userService.adddb2User(user);
		if (i==1) {
			return "success";
		}
		return "fail";
		
	}
}