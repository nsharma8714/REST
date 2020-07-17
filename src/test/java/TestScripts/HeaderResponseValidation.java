package TestScripts;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;
	public class HeaderResponseValidation {

		
		@Test
		public void GetWeatherHeadersValidate()
		{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/Hyderabad");
		
		// Reader header of a give name. In this line we will get
		// Header named Content-Type
		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType /* actual value */, "application/json" /* expected value */);
		System.out.println("Assert 1");
		
		// Reader header of a give name. In this line we will get
		// Header named Server
		String serverType =  response.header("Server");
		Assert.assertEquals(serverType /* actual value */, "nginx" /* expected value */);
		System.out.println("Assert 2");
		
		// Reader header of a give name. In this line we will get
		// Header named Content-Encoding
		String contentEncoding = response.header("Content-Encoding");
		Assert.assertEquals(contentEncoding /* actual value */, "gzip" /* expected value */);
		Headers contentEncoding2 = response.headers();
		for (Header header :contentEncoding2)
			System.out.println("key :" + header.getName() + "Value  :" + header.getValue());
				
		}
	}


