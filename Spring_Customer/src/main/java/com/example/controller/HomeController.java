package com.example.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dto.CustomerVO;
import com.example.service.CustomerService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private CustomerService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{

		logger.info("customer");
		
		List<CustomerVO> customerList = service.selectCustomer();
		
		model.addAttribute("customerList", customerList);

		return "customer";
	}
	
}
