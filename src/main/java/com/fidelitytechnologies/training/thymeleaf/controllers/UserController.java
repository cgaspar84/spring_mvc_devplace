/**
 * 
 */
package com.fidelitytechnologies.training.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fidelitytechnologies.training.thymeleaf.controllers.request.LoginRequest;
import com.fidelitytechnologies.training.thymeleaf.services.UserService;

/**
 * @author cgaspar
 *
 */
@Controller
@RequestMapping("/login")
public class UserController {

	
	@Autowired
	private UserService user_service;
	
	/**
	 * 
	 */
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("loginRequest", new LoginRequest());
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String doLogin(Model model, @ModelAttribute LoginRequest loginRequest) {
		
		HttpStatus response = user_service.doLogin(loginRequest);
		
		if (response == HttpStatus.OK) {
		
			return "redirect:/index";
		} else {
			model.addAttribute("codError", response);
			return "login";
		}
		
	}
	
	
	
	
}
