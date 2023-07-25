package com.BikkadIT.CrudRepoMethods.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepoMethods.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
	
	
	
}
