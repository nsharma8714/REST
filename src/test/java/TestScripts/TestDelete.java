package TestScripts;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDelete {
	
	@Test
	public void TestDelete_1() {
	
		when().delete("https://reqres.in/api/users?page=2").then().statusCode(204).log().all();
		Assert.assertTrue(true);

}
}