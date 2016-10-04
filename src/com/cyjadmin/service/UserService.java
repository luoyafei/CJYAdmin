package com.cyjadmin.service;

import java.util.List;

import com.cyjadmin.bean.User;

public interface UserService {

	/**
	 * @param start
	 * @param size
	 * @return
	 */
	public List<User> getAllUsers(int start, int size);
}
