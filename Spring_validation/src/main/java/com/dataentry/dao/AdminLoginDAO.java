package com.dataentry.dao;

import org.springframework.stereotype.Component;

import com.dataentry.pojo.UserInformationPojo;

@Component
public interface AdminLoginDAO 
{
     public String loginuser(UserInformationPojo userinformationpojo); 
     public String insertnewuser(UserInformationPojo userinformationpojo);
}
