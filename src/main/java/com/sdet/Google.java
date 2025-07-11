package com.sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("http://opensource-demoorangehrmlive.com");
       driver.manage().window().maximize();
       
	}

}
