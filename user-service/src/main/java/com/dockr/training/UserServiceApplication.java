package com.dockr.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dockr.training.dao.UserRepository;
import com.dockr.training.model.User;

@SpringBootApplication
@EnableJpaRepositories
public class UserServiceApplication implements CommandLineRunner {
	
	@Autowired 
	UserRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User entity = new User();
		entity.setId(1);
		entity.setEmail("john.doe@google.com");
		entity.setName("John");
		entity.setAge("23");
		if(!repo.existsById(1))
		repo.save(entity );
	}

}
