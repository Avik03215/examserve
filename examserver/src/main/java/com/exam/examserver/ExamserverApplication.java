package com.exam.examserver;

import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
@Autowired
private UserService userService;
public static void main(String[] args)
    {
	SpringApplication.run(ExamserverApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	    System.out.println("starting code");
//
	////	System.out.println(user1.getUsername());




	}
}

