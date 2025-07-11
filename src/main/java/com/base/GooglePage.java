package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage  {
	public static WebDriver driver;
	
	public static void openUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@FindBy(id="email")
	WebElement Username;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name="login")
	WebElement login;
	@FindBy(xpath="//img[contains(@class,'fb_logo _8ilh img')]")
	WebElement FbLogo;
		public  void loginToFacebook()
		{		PageFactory.initElements(driver, this);
			
		}
		public void login(String un, String pass)
		{
			Username.sendKeys(un);
			password.sendKeys(pass);
			login.click();
		}

}
