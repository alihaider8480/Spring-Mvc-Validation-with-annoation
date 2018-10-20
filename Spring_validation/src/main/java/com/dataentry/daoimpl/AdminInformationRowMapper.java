package com.dataentry.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.dataentry.pojo.UserInformationPojo;

@Component
public class AdminInformationRowMapper implements RowMapper<UserInformationPojo>
{
	@Override
	public UserInformationPojo mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		UserInformationPojo obj = new UserInformationPojo();
		obj.setUser_id(rs.getInt("u_id"));
		obj.setUser_name(rs.getString("u_name"));
		obj.setUser_password(rs.getString("u_password"));
		obj.setUser_email(rs.getString("u_email"));
		obj.setUser_address(rs.getString("u_address"));
		obj.setUser_contact(rs.getString("u_contact"));
		obj.setUser_nic(rs.getString("u_NIC"));
		return obj;
	}	 
}
