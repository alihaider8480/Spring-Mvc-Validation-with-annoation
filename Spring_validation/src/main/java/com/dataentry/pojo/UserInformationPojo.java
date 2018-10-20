package com.dataentry.pojo;


import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

@Component
public class UserInformationPojo 
{
	@Min(value=1,message="ID Length is Minimum 1.")
	private int user_id;
  
	@Size(min=2, max=20,message="Password Range : Minimum is 2 And Maximum is 20.")
	private String user_password;
	
	@Size(min=2, max=20,message="Name Length is 30 Minimum 1.")
	private String user_name;
    
    @Email(message="Email: Enter Valid Email.")
    private String user_email;
    
    @Size(min=11, max=13,message="Contact Range : Minimum is 11 And Maximum is 13")
    @Pattern(regexp = "[0-9]+", message = "Please Insert Numeric Values In Contact.")
    private String user_contact;
    
    @Size(min=2, max=100,message="Address Range : Address Length is 100 Maximum is 2.")
    private String user_address;
    
    @Pattern(regexp = "[0-9]-", message = "Please Insert Numeric Values In N.I.C.")
    private String user_nic;

  
  public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_email() {
	return user_email;
}
public void setUser_email(String user_email) {
	this.user_email = user_email;
}
public String getUser_contact() {
	return user_contact;
}
public void setUser_contact(String user_contact) {
	this.user_contact = user_contact;
}
public String getUser_address() {
	return user_address;
}
public void setUser_address(String user_address) {
	this.user_address = user_address;
}
public String getUser_nic() {
	return user_nic;
}
public void setUser_nic(String user_nic) {
	this.user_nic = user_nic;
}

  
}
