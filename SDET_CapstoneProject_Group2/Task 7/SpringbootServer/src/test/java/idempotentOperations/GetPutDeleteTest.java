package idempotentOperations;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetPutDeleteTest {
	
	@Test
	public void Get() {

		given().get("http://localhost:8080/products/").then().
		statusCode(200).
		log().all();
	}
	
	@Test
	public void Put() {

		JSONObject request = new JSONObject();
		request.put("id", "2");
		request.put("name", "mine");

	    given().contentType(ContentType.JSON).
		body(request).
		when().
		put("http://localhost:8080/products/2").
		then().statusCode(200);

	}
	
	@Test
	public void Delete() {

		JSONObject request = new JSONObject();
		given().
		body(request.toJSONString()).
		when().
		delete("http://localhost:8080/products/1").
		then().statusCode(200).
		log().all();
	}
	
	

}
