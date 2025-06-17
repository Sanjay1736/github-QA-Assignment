package API;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class apiTest {
    String token = "ghp_your_github_token_here"; // Use test token

    @Test
    public void testCreateRepository() {
        RestAssured.baseURI = "https://api.github.com";

        String repoName = "qa-test-repo";

        Response response = RestAssured.given()
                .header("Authorization", "token " + token)
                .header("Content-Type", "application/json")
                .body("{ \"name\": \"" + repoName + "\", \"private\": false }")
                .when()
                .post("/user/repos")
                .then()
                .extract().response();

        Assert.assertEquals(response.getStatusCode(), 201, "Repository creation failed!");
        System.out.println("Repository Created: " + response.jsonPath().getString("full_name"));
    }

}

