import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import utilities.JsonPath;
import utilities.JsonReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CreateUserTest {


	@Test
	public void testCreateUser() throws IOException, ParseException {
		RestAssured.baseURI = "http://localhost:3000";
		String endPointCID = "/users";

		given()
				.contentType(ContentType.JSON)
				.body(ApiBody.addUserBody())
				.when()
				.post(endPointCID)
				.then()
				.statusCode(201)
				.log().all()
				.body("name", equalTo(JsonReader.getJsonValueByKey(JsonPath.jsonData, "name")))
				.body("email", equalTo(JsonReader.getJsonValueByKey(JsonPath.jsonData, "email")));
	}
}
