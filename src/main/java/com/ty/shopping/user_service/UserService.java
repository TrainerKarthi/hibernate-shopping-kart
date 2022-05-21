package com.ty.shopping.user_service;

import java.util.List;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class UserService {

	public User saveUser(User user) {
		UserDao dao = new UserDao();

		return dao.saveUser(user);
	}

	public User getUserById(int id) {
		UserDao dao = new UserDao();
		return dao.getUserById(id);
	}

	public List<User> getAllUsers() {
		UserDao dao = new UserDao();

		List users = dao.getAllUsers();

		return users;
	}

	public User validateUser(String email, String password) {
		UserDao dao = new UserDao();

		return dao.validateUser(email, password);
	}

	public boolean deleteUserById(int id) {
		UserDao dao = new UserDao();

		return dao.deleteUserById(id);

	}
}
