package com.cyjadmin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cyjadmin.bean.User;
import com.cyjadmin.dao.UserDao;
import com.cyjadmin.service.UserService;

@Component(value="us")
public class UserServiceImpl implements UserService {

	private UserDao ud;
	public UserDao getUd() {
		return ud;
	}
	@Resource(name="ud")
	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	@Override
	public List<User> getAllUsers(int start, int size) {
		// TODO Auto-generated method stub
		return ud.getAllUsers(start, size);
	}

}
