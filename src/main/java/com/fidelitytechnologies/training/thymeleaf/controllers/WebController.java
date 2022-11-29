/**
 * 
 */
package com.fidelitytechnologies.training.thymeleaf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fidelitytechnologies.training.thymeleaf.controllers.request.LoginRequest;
import com.fidelitytechnologies.training.thymeleaf.model.Product;
import com.fidelitytechnologies.training.thymeleaf.services.UserService;

import ch.qos.logback.classic.Logger;

/**
 * @author cgaspar
 *
 */
@Controller
public class WebController {
	
	

	@RequestMapping(value = "/index")
	public String index(Model model) {
		
		// Initialize mockup product list
		Product product1 = new Product("70963", "Playmo Circus", "Raise the curtain on the stars in the ring! Come on in to the fabulous Playmo Circus. The artists are already looking forward to the show and have been training hard. But before the circus show begins, it's time to take a seat and look around. It's simply magical how the big colourful circus tent arches over the ring and everything sparkles, shines and glows.", "https://i.ebayimg.com/images/g/mIoAAOSwIJ5iTKqJ/s-l500.jpg");
		Product product2 = new Product("70965", "Circus Band", "Colourful circus band with three band members, drums, saxophone, accoredeon and 4-fold sound module.", "https://i.ebayimg.com/images/g/zUwAAOSwSr5in9wA/s-l500.png");
		Product product3 = new Product("70558", "Playmobil Family Fun - Park Set", "Fun at the fair: PLAYMOBIL Large Amusement Park with carousel, swing, candy stand, as well as 11 figures and accessories to play with", "https://i.ebayimg.com/images/g/oaoAAOSw1Apgddym/s-l1600.jpg");
		
		
		List<Product> productList = new ArrayList<>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		model.addAttribute("products", productList);
		
		return "index";
	}
	

}
