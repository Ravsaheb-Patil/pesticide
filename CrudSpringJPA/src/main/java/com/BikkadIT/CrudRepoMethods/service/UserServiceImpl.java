package com.BikkadIT.CrudRepoMethods.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepoMethods.model.User;
import com.BikkadIT.CrudRepoMethods.repository.UserRepository;
@Service
public  class UserServiceImpl implements UserServiceI {
   
	
	@Autowired
	private UserRepository userRepository ;

	@Override
	public User saveService(User user) {
		 User save = userRepository.save(user);
		return save;
	}


		
	}

		