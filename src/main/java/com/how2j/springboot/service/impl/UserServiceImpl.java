package com.how2j.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2j.springboot.dao.master.UserMasterDao;
import com.how2j.springboot.dao.slaver.UserSlaverDao;
import com.how2j.springboot.pojo.User;
import com.how2j.springboot.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMasterDao userMasterDao;
	
	@Autowired
	private UserSlaverDao userSlaverDao;
	
	@Override
	public int addUser(User user) {
		System.out.println(user);
		// TODO Auto-generated method stub
		int i = userMasterDao.addUser(user);
		System.out.println("i"+i);
		
		return i;
	}

	@Override
	public int adddb2User(User user) {
		// TODO Auto-generated method stub
		int i = userSlaverDao.addUser(user);
		return i;
	}

}
