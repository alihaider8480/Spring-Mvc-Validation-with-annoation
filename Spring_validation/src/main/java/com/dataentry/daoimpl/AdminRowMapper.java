package com.dataentry.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.dataentry.pojo.UserInformationPojo;

@Component
public class AdminRowMapper implements RowMapper<UserInformationPojo>
{
	@Override
	public UserInformationPojo mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		UserInformationPojo obj = new UserInformationPojo();
		obj.setUser_id(rs.getInt("u_id"));
		obj.setUser_password(rs.getString("u_password"));

		return obj;
	}	 
}
