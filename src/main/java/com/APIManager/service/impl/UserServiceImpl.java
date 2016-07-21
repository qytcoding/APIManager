package com.APIManager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.APIManager.bean.User;
import com.APIManager.bean.UserExample;
import com.APIManager.dao.UserMapper;
import com.APIManager.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	@Override
	public int countByExample(UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer ulId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectByPrimaryKey(Integer ulId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(User record, UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(User record, UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getUsers() {
		List<User> list=userMapper.getUsers();
		return list;
	}

	@Override
	public int getUserCount() {
		int count=userMapper.getUserCount();
		return count;
	}
}
