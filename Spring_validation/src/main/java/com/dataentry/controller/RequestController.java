package com.dataentry.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dataentry.daoimpl.AdminLoginDaoImpl;
import com.dataentry.pojo.UserInformationPojo;

@Controller
public class RequestController 
{
	@Autowired
	AdminLoginDaoImpl adminlogindaoimpl_obj1;
  	
    @PostMapping("/UserLoginPage")
	private String login(@ModelAttribute("UserInformationPojo1") @Valid UserInformationPojo userinformationpojo_obj1,BindingResult bind1, Model model_obj)
	{
		if(bind1.hasErrors())
		{
			return "loginpage";
		}
		model_obj.addAttribute("login_error",adminlogindaoimpl_obj1.loginuser(userinformationpojo_obj1));	
		return "loginpage";
	}
    
    @PostMapping("/new_user_data")
	private String newuser(@ModelAttribute("UserInformationPojo2") @Valid UserInformationPojo userinformationpojo_obj2,BindingResult bind2, Model model_obj2)
	{
		if(bind2.hasErrors())
		{
			return "create_new_user";
		}
		model_obj2.addAttribute("insert_new_user_error",adminlogindaoimpl_obj1.insertnewuser(userinformationpojo_obj2));	
		return "create_new_user";
	}

}
