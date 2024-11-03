package com.example.mysqlConnection.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.mysqlConnection.model.User;

@Mapper
public interface UserMapper {
//	@Select("SELECT * from user")
	List<User> getAllUsers();
	
//	@Select("Select * from user where id = #{id}")
	User getUserById( int id);
	
	User getUserNameAndDepartementName(int id);
}
