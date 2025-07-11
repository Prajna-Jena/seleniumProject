package com.test;

import org.testng.annotations.Test;

import com.base.GooglePage;

public class GoogleTest extends GooglePage {
	GooglePage gp=new GooglePage();

	@Test(priority=0)
	public void navigateURL()
	{
		gp.openUrl();
	}
	@Test(priority=1)
	public void logIn()
	{
		 gp.loginToFacebook();
	}
	@Test(priority=2)
	public void loginFB()
	{
		gp.login("lipii.mca@gmail.com", "P00rvans");
	}
}

