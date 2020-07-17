package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class TestGet {
	
	
//	@Test 
//	public void test_1(){
//		
//		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[1]", equalTo(8)).log().all() ;
//				
//		
//	}
//	
//	
//
//	@Test
//	public void test_2() {
//	
//		
//		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).
//		body("data.id[1]", equalTo(8)).body("data.first_name",hasItems("Michael","Lindsay")); 
//		
//	}
//	
	@Test
	public void testusingmethods() {
		
		RestAssured.baseURI="https://reqres.in/api/users?page=";
		RequestSpecification HttpRequest=RestAssured.given();
		HttpRequest.queryParam("Name", "Pink");
		Response response=HttpRequest.request(Method.GET,"2");
		
		
		String responsebody= response.body().asString();
		System.out.println("Response body :" + responsebody);
		int statuscode =response.getStatusCode();
		String statusline = response.getStatusLine();
		ResponseBody body = response.getBody();
		System.out.println("GET  " + body.asString());
		Assert.assertEquals(statuscode, 200);
		
	}
}
