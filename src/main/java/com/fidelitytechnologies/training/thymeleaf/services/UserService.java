/**
 * 
 */
package com.fidelitytechnologies.training.thymeleaf.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fidelitytechnologies.training.thymeleaf.controllers.request.LoginRequest;

/**
 * @author cgaspar
 *
 */
@Service
public class UserService {

	/**
	 * 
	 */
	public UserService() {
		// TODO Auto-generated constructor stub
	}
	
	public HttpStatus doLogin(LoginRequest request) {
		
		if ((request.getUsername().equals("opAdmin")) 
			&& (request.getPassword().equals("changeit"))) {
			return HttpStatus.OK;
		} else {
			return HttpStatus.FORBIDDEN;
		}
		
		
	}

}
