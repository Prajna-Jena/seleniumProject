package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() {
		try {
			prop=new Properties();
			FileInputStream f=new FileInputStream("/28thOct2024/Project/src/main/java/com/properties/config.properties");
			prop.load(f);
		}catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}		
		
	}
	public static void intialization()
	{
		String Browser=prop.getProperty("Browser");
		if(Browser.equals("Chrome")) {
	        WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeUnit,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
	    String url=prop.getProperty("URL");
	    driver.get(url);
		
	}

}
