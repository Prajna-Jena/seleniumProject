package com.test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class HeaadersInfo {
    //@Test
	void testHeaders() {
		given()
		.when()
		.get("https://www.google.com")
		.then()
		.header("Content-Type","text/html; charset=ISO-8859-1")
		.header("Content-Encoding","gzip");
	}
    //get header values
    //@Test
    void captureValueOfHeader() {
    	Response res=given()
		.when()
		.get("https://www.google.com");
    	String header_value=res.getHeader("Content-Type");
    	System.out.println(header_value);
    	
    }
    //capture all headers
    @Test
    void getAllHeadersInfo() {
    	Response res=given()
    			.when()
    			.get("https://www.google.com");
    	Headers headers=res.getHeaders();
    	for(Header header:headers) {
    		String header_name=header.getName();
    		System.out.println(header_name+" "+res.getHeader(header_name));
    	}
    }
}
