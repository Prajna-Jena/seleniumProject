package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ISDisplayedValidation {
	public static WebDriver driver;
/*isDisplayed() - it is used to verify the presence of web elements in the web Page, it returns true, if the element is present or
 * else returns false. This method is applicable for all the elements present in the webPage
 * isEnabled()-This method is used to verify the element is enabled or disabled. Returns true if the element is enabled or returns
 * false if the element is disabled. It is mostly applicable for  buttons.
 * isSelected()- This method is used to verify the element is selected or not, it returns true, if the element is selected or false if 
 * not selected. This method is applicable to check for checekboxes, dropdowns, radio buttons etc.
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://freecrm.com");
		System.out.println(driver.findElement(By.xpath("//input[@type='email']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Go pro')]/preceding-sibling::a")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id='Navigation / Globe']//parent::*/following-sibling::p")).getText());
		driver.findElement(By.xpath("//*[@id='Navigation / Globe']/parent::*/parent::button")).click();
		driver.findElement(By.xpath("//li[@role='menuitem']/p[contains(text(),'English (UK)')]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//*[@id='Navigation / Globe']//parent::*/following-sibling::p")).getText());

	}

}
