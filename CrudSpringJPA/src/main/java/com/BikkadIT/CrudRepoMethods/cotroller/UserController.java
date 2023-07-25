package com.BikkadIT.CrudRepoMethods.cotroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.BikkadIT.CrudRepoMethods.model.User;
import com.BikkadIT.CrudRepoMethods.service.UserServiceI;

@Controller
public class UserController {
	
	
        @Autowired	
	    private UserServiceI userServiceI;
        
        public User saveUser(User user) {
		User user1=userServiceI.saveService(user);
        	
        	return user1;
        	
        	
        }

}
