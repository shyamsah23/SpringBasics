package com.example.mysqlConnection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mysqlConnection.Service.UserService;
import com.example.mysqlConnection.mapper.UserMapper;
import com.example.mysqlConnection.model.Departement;
import com.example.mysqlConnection.model.User;

@SpringBootTest
class MysqlConnectionApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Mock
	private UserMapper userMapper;
	
	@InjectMocks
	private UserService userService;
	
	@BeforeEach
	public void setup()
	{
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void getUserByIdTest()
	{
		Departement d1 = new Departement();
		d1.setId(101);
		d1.setName("IT-Dept");
		User mockUser = new User();
		mockUser.setDepartement(d1);
		mockUser.setId(1);
		mockUser.setName("Shyam");
		
		when(userMapper.getUserById(1)).thenReturn(mockUser);
		
		User result = userService.getUserById(1);
		assertNotNull(result);
		assertEquals(result.getName(),"Shyam");
	}

}
