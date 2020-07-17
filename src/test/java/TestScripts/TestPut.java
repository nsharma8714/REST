package TestScripts;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPut {
	
	

	
	@Test
	public void  TestPost_1() {
		
		Map<String,Object> map = new HashMap<String, Object>();
		
//		map.put("name", "Sharma");
//		map.put("name", "Prakash");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject();
		request.put("Priya","Clerk");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		
		given().
		header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
		when().put("https://reqres.in/api/users").
		then().statusCode(200).log().all();
		
		
		
		Assert.assertTrue(true);
		
//		given().get("https://reqres.in/api/users").then().statusCode(200).body("data.name", equalTo(8)).log().all() ;
		

		
		
			
		
		
		
		
		
		
	}

}



