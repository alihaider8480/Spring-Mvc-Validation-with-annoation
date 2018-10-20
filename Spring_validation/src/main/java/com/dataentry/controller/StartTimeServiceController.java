package com.dataentry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.dataentry.daoimpl.AdminInformationRowMapper;
import com.dataentry.pojo.UserInformationPojo;

@ControllerAdvice
public class StartTimeServiceController 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static List<UserInformationPojo> list2;
	
	@ModelAttribute
	private String loginuserm(Model model) 
	{
     try
	  {
		List<UserInformationPojo> list1 = jdbcTemplate.query("select * from login", new AdminInformationRowMapper());
		if(list1.isEmpty())
		{
		  model.addAttribute("show_admin_information","Empty Records");	
		}
		else
		{
			model.addAttribute("show_admin_information",list1);
		}
	  }
      catch (Exception e) 
      {
		return "all_errors";
	  } 
     return null;
	}	
}