package com.hp.service.impl;


import com.hp.mapper.UsersMapper;
import com.hp.pojo.Users;
import com.hp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersMapper usersMapper;
	//登录

	public Users login(Users users) {
		// TODO Auto-generated method stub
		return usersMapper.login(users);
	}



}
