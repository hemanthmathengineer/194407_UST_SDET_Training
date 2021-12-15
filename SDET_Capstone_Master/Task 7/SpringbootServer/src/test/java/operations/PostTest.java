package operations;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostTest {

	@Test
	public void test2() {

		JSONObject request = new JSONObject();
		request.put("id", "3");
		request.put("name", "carrot");

		//System.out.println(request);
		System.out.println(request.toString());
	    given().contentType(ContentType.JSON).
		body(request).
		when().
		post("http://localhost:8080/products").
		then().statusCode(201);

	}

}