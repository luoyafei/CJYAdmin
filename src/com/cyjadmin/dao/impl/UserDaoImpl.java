package com.cyjadmin.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import com.cyjadmin.bean.User;
import com.cyjadmin.dao.UserDao;

@Component(value = "ud")
public class UserDaoImpl implements UserDao {

	private SqlSessionTemplate sqlSession;

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	@Resource(name = "sqlSession")
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<User> getAllUsers(int start, int size) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("maxSize", size);
		return sqlSession.selectList("User.getAllUser", map);
	}
	

	@Override
	public List<User> getAllVerifyUsers(String isVerify, int start, int length) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isVerify", isVerify);
		map.put("start", start);
		map.put("length", length);
		return sqlSession.selectList("User.getAllVerifyUsers", map);
	}

	@Override
	public int getAllVerifyUsersCounts(String isVerify) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("User.getAllVerifyUsersCounts", isVerify);
	}

}
