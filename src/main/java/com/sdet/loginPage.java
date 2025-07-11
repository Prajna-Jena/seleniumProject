package com.sdet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class loginPage extends BaseClass {
	@FindBy(id="email")
	WebElement Username;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name="login")
	WebElement login;
	@FindBy(xpath="//img[contains(@class,'fb_logo _8ilh img')]")
	WebElement FbLogo;
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateLogInPageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateFBLogo()
	{
		return FbLogo.isDisplayed();
	}
	public void login(String un, String pass)
	{
		Username.sendKeys(un);
		password.sendKeys(pass);
		login.click();
	}

}
