package com.cyjadmin.dao;

import java.util.List;

import com.cyjadmin.bean.User;

public interface UserDao {
	/**
	 * @param start
	 * @param size
	 * @return
	 */
	public List<User> getAllUsers(int start, int size);
}
