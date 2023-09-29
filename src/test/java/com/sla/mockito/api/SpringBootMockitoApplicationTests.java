package com.sla.mockito.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.sla.mockito.api.dao.UserRepository;
import com.sla.mockito.api.model.User;
import com.sla.mockito.api.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMockitoApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserRepository repository;

	@Test
	public void getUsersTest() {
		 List<User> list = Arrays.asList(
		            new User(376, "Danile", 31, "USA"),
		            new User(958, "Huy", 35, "UK")		           
		    );


		when(repository.findAll()).thenReturn(list);
		assertEquals(3, service.getUsers().size());
	}
	
	
	
	
	
//	
//	
//	
//
//	@Test
//	public void getUserbyAddressTest() {
//		String address = "Bangalore";
//		List<User> list = Arrays.asList(
//		            new User(376, "Danile", 31, "USA")           
//		    );
//		when(repository.findByAddress(address))
//				.thenReturn(list);
//		assertEquals(1, service.getUserbyAddress(address).size());
//	}
//
//	@Test
//	public void saveUserTest() {
//		User user = new User(999, "Pranya", 33, "Pune");
//		when(repository.save(user)).thenReturn(user);
//		assertEquals(user, service.addUser(user));
//	}
//
//	@Test
//	public void deleteUserTest() {
//		User user = new User(999, "Pranya", 33, "Pune");
//		service.deleteUser(user);
//		verify(repository, times(1)).delete(user);
//	}
//
}
