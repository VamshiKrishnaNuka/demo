package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String user, String password) {
        return user.equalsIgnoreCase("nuka") && password.equals("nuka");
    }

}
