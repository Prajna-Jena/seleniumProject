package com.test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
public class RestAssuredPost {
	//@Test(priority=1)
	public void testPostCreation()
	{
	HashMap hm=new HashMap();
	hm.put("name","Prajna");
	hm.put("location","Scottsdale");
	hm.put("Phone", "3425116");
	String courses[]= {"science","Math"};
	hm.put("courses", courses);
given()
	.contentType("application/json")
	.body(hm)
.when()
	.post("http://localhost:3000/students")
.then()
	.statusCode(201)
	.body("name",equalTo("Prajna"))
	.body("location",equalTo("Scottsdale"))
	.body("Phone",equalTo("3425116"))
	.body("courses[0]",equalTo("science"))
	.body("courses[1]",equalTo("Math"))
	.header("Content-Type","application/json")
	.log().all();
	}
	//@Test(priority=1)
	void testDelete() {
		given()
		.when()
		.post("http://localhost:3000/students/1005")
		.then()
		.statusCode(200);
		
	}
	//@Test
	//Post request body using Org.json
	public void testPostCreationByJsonObject()
	{
	JSONObject hm=new JSONObject();
	hm.put("name","Prajna");
	hm.put("location","Scottsdale");
	hm.put("Phone", "3425116");
	String courses[]= {"science","Math"};
	hm.put("courses", courses);
given()
	.contentType("application/json")
	.body(hm.toString())
.when()
	.post("http://localhost:3000/students")
.then()
	.statusCode(201)
	.body("name",equalTo("Prajna"))
	.body("location",equalTo("Scottsdale"))
	.body("Phone",equalTo("3425116"))
	.body("courses[0]",equalTo("science"))
	.body("courses[1]",equalTo("Math"))
	.header("Content-Type","application/json")
	.log().all();
}
	//Create Post request using POJO class
	//@Test
	public void postRequestUsingPojo() {
		PojoClass pj=new PojoClass();
		pj.setName("Simon");
		pj.setPhone("4536273");
		pj.setLocation("Colorado");
		String courses[]= {"c++","AI"};
		pj.setCourses(courses);
		given()
		.contentType("application/json")
		.body(pj)
	.when()
		.post("http://localhost:3000/students")
	.then()
		.statusCode(201)
		.body("name",equalTo("Simon"))
		.body("location",equalTo("Colorado"))
		.body("courses[0]",equalTo("c++"))
		.body("courses[1]",equalTo("AI"))
		.body("Phone",equalTo("4536273"))
		.header("Content-Type","application/json")
		.log().all();
		
	}
	//Create Post request using External JSON
	@Test
	public void createPostUsingExternalJson() throws FileNotFoundException {
		File f=new File(".\\Body.json");
		FileReader fd=new FileReader(f);
		JSONTokener jt=new JSONTokener(fd);
		JSONObject jd=new JSONObject(jt);
		given()
		.contentType("application/json")
		.body(jd.toString())
	.when()
		.post("http://localhost:3000/students")
	.then()
		.statusCode(201)
		.body("name",equalTo("Dave"))
		.body("location",equalTo("Sweden"))
		.body("courses[0]",equalTo("C++"))
		.body("courses[1]",equalTo("Unix"))
		.body("Phone",equalTo("34526468"))
		.header("Content-Type","application/json")
		.log().all();
	}
}

