package RestAssuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Demo1_GET_Request {
	
	@Test
	public void getOrderDetails() {
		
		given()
		.when()
		.get("https://petstore.swagger.io/v2/store/order/1")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
//		.assertThat().body("ORDER.ID", equalTo("1"))
		.header("Content-Type", equalTo("application/json"))
		.log().all();
		
		
	}

}
