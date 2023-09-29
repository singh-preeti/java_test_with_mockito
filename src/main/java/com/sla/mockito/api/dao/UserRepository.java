package com.sla.mockito.api.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sla.mockito.api.model.User;

public interface UserRepository extends MongoRepository<User, Integer>{
	
	List<User> findByAddress(String address);

}
