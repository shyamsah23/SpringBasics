package com.example.mysqlConnection.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysqlConnection.mapper.UserMapper;
import com.example.mysqlConnection.model.User;

@Service
public class UserService {
	@Autowired
	private  UserMapper userMapper;
	
	public List<User> getAllUsers()
	{
		return userMapper.getAllUsers()
;	}
	
	public User getUserById(int id)
	{
		return userMapper.getUserById(id);
	}
	
	public User getUserNameAndDepartementName(int id)
	{
		return userMapper.getUserNameAndDepartementName(id);
	}
}
