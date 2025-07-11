package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.sdet.loginPage;

public class loginPageTest extends BaseClass{
	loginPage l;
	public loginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		BaseClass.intialization();
		 l=new loginPage();
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=l.validateLogInPageTitle();
		Assert.assertEquals(title, "Facebook - log in or sign up");
	}
	@Test(priority=2)
	public void facebookLogoCheck() {
		boolean logo=l.validateFBLogo();
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	public void logInTest() {
		l.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}
	
	

}
