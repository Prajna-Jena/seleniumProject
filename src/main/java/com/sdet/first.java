package com.sdet;

import java.util.ResourceBundle;

public class first {
	public  int logIn(String user_in,String password_in) {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName=rb.getString("userName");
		String Password=rb.getString("password");
		if(user_in.equals(userName) && password_in.equals(Password)) 
		  return 1;
		
		else 
			return 0;
		
		
	}

}
