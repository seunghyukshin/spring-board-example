package com.myhome.myboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhome.myboard.dao.UserDao;
import com.myhome.myboard.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public UserDto login(UserDto userDto) {
		return userDao.login(userDto);
	}

}
