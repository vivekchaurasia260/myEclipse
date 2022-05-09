package com.practice.validate.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message = "User Name can not be empty !!")
	@Size(min = 3, max = 20, message = "user name must be between 3 - 20 characters !!")
	private String userName;
	
	@Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	
	@AssertTrue(message="must agree Terms and Conditions !!")
	private boolean agreed;
		
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	public boolean isAgreed() {
		return agreed;
	}
	
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	

}
