package com.dataentry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController 
{
	@GetMapping("/LoginPage")
	private String cheack_login(Model model)
	{
		return "loginpage";
	}
	
	@GetMapping("/")
	private String test()
	{
		return "homepage";
	}
	
	@GetMapping("/CreateUser")
	private String createusers()
	{
		return "create_new_user";
	}

	@GetMapping("/ShowAdminInformaion")
	private String showadmindata()
	{
		return "show_admin_information";
	}
}
