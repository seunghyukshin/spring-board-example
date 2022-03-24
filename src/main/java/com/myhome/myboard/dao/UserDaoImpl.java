package com.myhome.myboard.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myhome.myboard.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public UserDto login(UserDto userDto) {
		// FIX ME : null 값나옴 .DB를 못 읽어 온다..
		UserDto dto = sqlSession.selectOne("com.myhome.myboard.dao.UserDao.login", userDto);
		System.out.println(dto);
		return dto;
	}

}
