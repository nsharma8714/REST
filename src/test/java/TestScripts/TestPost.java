package TestScripts;


import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;





public class TestPost {
	
//	@Test
//	public void  TestPut_1() {
////		
////		Map<String,Object> map = new HashMap<String, Object>();
////		
//////		map.put("name", "Sharma");
//////		map.put("name", "Prakash");
////		
////		System.out.println(map);
////		
////		JSONObject request = new JSONObject();
////		request.put("Priya","Clerk");
////		
////		System.out.println(request);
////		System.out.println(request.toJSONString());
////		
////		
////		given().
////		header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
////		body(request.toJSONString()).
////		when().put("https://reqres.in/api/users").
////		then().statusCode(200).log().all();
////		
////		
////		
////		Assert.assertTrue(true);
////		
//////		given().get("https://reqres.in/api/users").then().statusCode(200).body("data.name", equalTo(8)).log().all() ;
////		
////
////		
////		
////			
//		
//		
		
	@Test
	public void testpost() {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification https = RestAssured.given();
		RestAssured.authentication=RestAssured.basic("userName", "password");
		JSONObject requestParams =new JSONObject();
		
		requestParams.put("email", "eve.holt@reqres.in");
		requestParams.put("password","cityslicka");
		https.header("Content-Type","application/JSON");
		https.body(requestParams.toJSONString());
		Response response =https.request(Method.POST,"//api/login");
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode, "201");
		String successcode = response.jsonPath().get("token");
		Assert.assertEquals(successcode, "QpwL5tke4Pnpja7X4");
		
		
		
				
	}
		
		
	

}
