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
	
	/**
	 * 根据isVerify的状态，来获取用户的信息
	 * @param isVerify
	 * @param start
	 * @param length
	 * @return
	 */
	public List<User> getAllVerifyUsers(String isVerify, int start, int length);
	
	/**
	 * 根据isVerify的状态，来获取用户的个数
	 * @param isVerify
	 * @return
	 */
	public int getAllVerifyUsersCounts(String isVerify);

	/**
	 * 用来更新用户的认证情况
	 * @param userId
	 * @param pv
	 * @return
	 */
	public boolean updateUserVerify(String userId, String pv);
}
