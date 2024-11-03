package com.example.mysqlConnection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysqlConnection.Service.UserService;
import com.example.mysqlConnection.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("user/{id}")
	public User getUserById(@PathVariable int id)
	{
		return userService.getUserById(id);
	}
	@GetMapping("user/name/{id}")
	
		public User getUserNameAndDepartementName(@PathVariable int id)
		{
			return userService.getUserNameAndDepartementName(id);
		}
	
}
