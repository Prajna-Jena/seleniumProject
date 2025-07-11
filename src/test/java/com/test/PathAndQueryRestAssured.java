package com.test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class PathAndQueryRestAssured {
	//https://reqres.in/api/users?page=2&id=5
	@Test
	public void pathAndQueryParameter() {
		given()
		 .pathParam("myPath", "users")
		 .queryParam("page", 2)
		 .queryParam("id",5)
		.when()
		.get("https://reqres.in/api/{myPath}")
		.then()
		.statusCode(200)
		.log().all();
	}

}
