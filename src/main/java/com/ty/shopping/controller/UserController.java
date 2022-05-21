package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.User;
import com.ty.shopping.user_service.UserService;

public class UserController {

	public static void main(String[] args) {
		UserService userService = new UserService();
		User user = new User();

//		user.setName("Naresh");
//		user.setEmail("Naresh@gmail.com");
//		user.setPhone(3093780l);
//		user.setPassword("236");

//		userService.saveUser(user);
//		
//		System.out.println("Id : "+user.getId());
//		System.out.println("Name : "+user.getName());
//		System.out.println("Email : "+user.getEmail());
//		System.out.println("Phone : "+user.getPhone());
//		System.out.println("Password : "+user.getPassword());
//		userService.getUserById(1);

//		List<User> users = userService.getAllUsers();
//
//		for (User userl : users) {
//			System.out.println("Id : " + userl.getId());
//			System.out.println("Name : " + userl.getName());
//			System.out.println("Email : " + userl.getEmail());
//			System.out.println("Phone : " + userl.getPhone());
//			System.out.println("Password : " + userl.getPassword());
//			System.out.println("==========================");
//		}
		
		user = userService.validateUser("Naresh@gmail.com", "236");
		System.out.println("Id : "+user.getId());
		System.out.println("Name : "+user.getName());
		System.out.println("Email : "+user.getEmail());
		System.out.println("Phone : "+user.getPhone());
		System.out.println("Password : "+user.getPassword());
		
		if(userService.deleteUserById(1))
		{
			System.out.println("Row deleted successfully");
		}
		else
			System.out.println("No id found");

	}
}
