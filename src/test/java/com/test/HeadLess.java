package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
/*When the browser is running the test script but you are not seeing the UI means the browser is running is backend but user
 *  is not able to see it frontend, that's called headless mode.
 *  Why we needed head less mode browser?
 * When the script is ready and stable, you will be executing the script in virtual machine or docker container or you might have to 
 * test across multiple agents where the UI is not enabled, take example you want to ren the AWS, and you booked a linux ststem that 
 * does not have UI , there you can run the test in headless mode. So again depends on the requirement you might need to run the test
 * script in head less mode
 * This can also possible using htmlUnitdtiver means it runs the script without opening the browser. in Selenium 3 there is no
 * HtmlUnitDriver present, we have to externaly download the jar file and update that location in our script to run the script in headless 
 * Tesing is happenig behind the scene and htmlunitDriver is very fast , which automatically improve the performance.
 * Disadvantage- it will not suitable for all user actions such as Actions classes we can not used here.
 * HtmlUnitDriver is also called GhostDriver
 * */
public class HeadLess {
   public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto method stub
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--headless=new");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(ch);
		 driver.get("https://www.google.com");
		 System.out.println("The title is "+driver.getTitle());

	}

}
