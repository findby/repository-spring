package com.sys.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	//@Reference
	//private UserService userService;
	
	//@RequestMapping("/list")
/*	public List<UserModulePO> query() {
		return null;
		//return userService.findUserList();
	}*/
	
	@RequestMapping("/hello")
	public String hello() {
		return "dubbo-hello.do";
		//return userService.findUserList();
	}
}
