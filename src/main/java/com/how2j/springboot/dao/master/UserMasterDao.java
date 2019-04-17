package com.how2j.springboot.dao.master;

import java.util.List;

import org.springframework.stereotype.Component;

import com.how2j.springboot.pojo.User;
@Component
public interface UserMasterDao {

    int addUser(User user);
	
	int deleteUserById(Long id);
	
	int updateUserById(User user);

	User queryUserById(Long id);
	
	List<User> queryUserList();
}
