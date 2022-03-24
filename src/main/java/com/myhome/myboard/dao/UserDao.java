package com.myhome.myboard.dao;

import com.myhome.myboard.dto.UserDto;

public interface UserDao {
	UserDto login(UserDto userDto);
}
