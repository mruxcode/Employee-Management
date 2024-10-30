package com.example.employeemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.employeemanagement.model.User;
import com.example.employeemanagement.service.UserService;

@SpringBootApplication
public class EmployeemanagementApplication implements CommandLineRunner{
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User adminUser = new User("admin","admin123");
		userService.saveUser(adminUser);
	}
}
