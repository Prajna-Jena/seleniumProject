package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrawBorder {
    public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement signin=driver.findElement(By.xpath("//a[contains(@aria-label,'Sign in')]"));
		drawBorder(signin,driver);//draw border
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//Taking the screenshot
		FileUtils.copyFile(src, new File("/Users/npraj/OneDrive/Documents/FrameworkActivity/element.png"));
		String color=signin.getCssValue("backgroundColor");
		System.out.println(color);
		//changeColor(color,signin,driver);
		//Click the signinButtonusing javascriptexecutor
		clickbyJavascript(signin,driver);
		//Get the title of page byJS
		System.out.println(getTitleByJS(driver));

	}
	public static void clickbyJavascript(WebElement signin,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click()",signin);
	}
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	public static void changeColor(String Red,WebElement signin,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolor='"+Red+"'", signin);
	}
	public static void drawBorder(WebElement signin,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid Red'", signin);
	}

}
