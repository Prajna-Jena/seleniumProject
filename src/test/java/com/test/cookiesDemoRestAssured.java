package com.test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class cookiesDemoRestAssured {
	//@Test(priority=1)
	void testCookies() {
		given()
		.when()
		.get("https://www.google.com")
		.then()
		.cookie("AEC","AZ6Zc-VWuZDx3ydAg3z0T5WCeoYAZMZ5fFP3LQebB_Y-F3enFzoe80zPiA")
		.log().all();
		
	}
	@Test(priority=2)
	public void getCaptureCookieInfo() {
		Response res=given()
		.when()
		.get("https://www.google.com");
		//single cookie information
		/*String cookie_var=res.getCookie("AEC");
		System.out.print("The value of cookie " +cookie_var);*/
		//get all cookies inforamtion
		Map<String,String> cookies_all=res.getCookies();
		//for()
		for(String k:cookies_all.keySet()) {
			String cookie_valString=res.getCookie(k);
		
				System.out.println(k +"   "+cookie_valString);
		}
	}

}
