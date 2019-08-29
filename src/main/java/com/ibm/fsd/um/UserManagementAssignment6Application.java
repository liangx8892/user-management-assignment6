package com.ibm.fsd.um;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

@SpringBootApplication
public class UserManagementAssignment6Application {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementAssignment6Application.class, args);
	}

}
