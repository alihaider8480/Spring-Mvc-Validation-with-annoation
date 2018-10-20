package com.dataentry.daoimpl;


import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dataentry.controller.StartTimeServiceController;
import com.dataentry.dao.AdminLoginDAO;
import com.dataentry.pojo.UserInformationPojo;

@Repository
public class AdminLoginDaoImpl implements AdminLoginDAO
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
    
	@Autowired
	StartTimeServiceController obj5;
	
	ListIterator<UserInformationPojo> ll; 
	
	List<UserInformationPojo> list;
	
	@Override
	public String insertnewuser(UserInformationPojo userinformationpojo) 
	{
		//list = obj5.list2;
		try
		{
			jdbcTemplate.update("insert into login(u_id,u_name,u_password,u_email,u_contact,u_address,u_NIC) values(?,?,?,?,?,?,?)",userinformationpojo.getUser_id(),userinformationpojo.getUser_name(),userinformationpojo.getUser_password(),userinformationpojo.getUser_email(),userinformationpojo.getUser_contact(),userinformationpojo.getUser_address(),userinformationpojo.getUser_nic());	
		}
		catch (Exception e) 
		{
			if(e.toString().indexOf("Duplicate entry") >=0)
			{
				return "Cann't Insert Duplicate ID ! Try Again.";
			}
			else
			{
				return "Try Again.";
			}
		}
		return "Insert SucessFully";
	}

	@Override
	public String loginuser(UserInformationPojo userinformationpojo) {
		list = jdbcTemplate.query("select u_id,u_password from login where u_id=? and u_password=?", new AdminRowMapper(),userinformationpojo.getUser_id(),userinformationpojo.getUser_password());
		if(list.isEmpty())
		{
			return "Try Again";
		}
		return "Login SuccesFully";
	}
        
}
