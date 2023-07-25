package com.BikkadIT.CrudRepoMethods;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.CrudRepoMethods.cotroller.UserController;
import com.BikkadIT.CrudRepoMethods.model.User;

@SpringBootApplication
public class CrudSpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CrudSpringJpaApplication.class, args);
		UserController bean = run.getBean(UserController.class); 
		
		User user=new User();
		
		user.setUserName("Sujit");
		user.setUserAddress("Nashik");
		user.setUserage(14);
		user.setUserEmail("Sujit@12Gmail.com");
		user.setUserPass("12345");
	   bean.saveUser(user); 
	
	}

}
