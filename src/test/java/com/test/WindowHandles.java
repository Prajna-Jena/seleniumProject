package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
    public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//input[@name='username']")).isDisplayed());
		driver.findElement(By.xpath("//input[@name='username']")).click();
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String parent=driver.getWindowHandle();
	     //new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("pasword"))));
		Set<String> windows=driver.getWindowHandles();
		List<String> handles=new ArrayList<String>(windows);
		callWindowHandles(parent,handles);
	}
	public static void callWindowHandles(String parentwindow,List<String> handles){
		for(String handle:handles) {
			
			if(!(handle.contains(parentwindow))) {
				driver.switchTo().window(handle).close();
			}
			
		}
		
	}

}
