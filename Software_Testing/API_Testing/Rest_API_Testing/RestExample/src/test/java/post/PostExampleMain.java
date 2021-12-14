package post;
import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostExampleMain {
    private static String requestBody = "[{\"id\":2,\"title\":\"json-server2\",\"author\":\"typicode2\"}]";

    @Test
    public void postRequest() {
    	RestAssured.baseURI = "http://localhost:3000";
        Response response = given().contentType("application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        Assert.assertEquals(201, response.statusCode());
        /*Assert.assertEquals("foo", response.jsonPath().getString("title"));
        Assert.assertEquals("bar", response.jsonPath().getString("body"));
        Assert.assertEquals("1", response.jsonPath().getString("userId"));
        Assert.assertEquals("101", response.jsonPath().getString("id"));*/
    }
}