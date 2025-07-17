package com.qa.selenium;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Gorest extends BaseTest {

    public int createUser() {
        Map<String, Object> body = new HashMap<>();
        body.put("name", "Nara Tama");
        body.put("gender", "male");
        body.put("email", "nara" + System.currentTimeMillis() + "@gmail.com");
        body.put("status", "active");

        Response response = given()
                .header("Authorization", TOKEN)
                .contentType("application/json")
                .body(body)
                .post("/users");

        response.prettyPrint();

        int statusCode = response.getStatusCode();
        if (statusCode == 201) {
            int userId = response.jsonPath().getInt("id");
            System.out.println("✅ User created with ID: " + userId);
            return userId;
        } else {
            throw new RuntimeException("❌ Failed to create user: " + statusCode);
        }
    }

    public void getUserById(int userId) {
        Response response = given()
                .header("Authorization", TOKEN)
                .get("/users/" + userId);

        response.prettyPrint();

        if (response.getStatusCode() == 200) {
            System.out.println("✅ User retrieved successfully with ID: " + userId);
        } else {
            System.out.println("❌ Failed to get user: " + response.getStatusCode());
        }
    }

    public void updateUser(int userId) {
        Map<String, Object> updateBody = new HashMap<>();
        updateBody.put("name", "Nara Shikamaru");
        updateBody.put("status", "inactive");

        Response response = given()
                .header("Authorization", TOKEN)
                .contentType("application/json")
                .body(updateBody)
                .put("/users/" + userId);

        response.prettyPrint();

        if (response.getStatusCode() == 200) {
            System.out.println("✅ User updated successfully.");
        } else {
            System.out.println("❌ Failed to update user: " + response.getStatusCode());
        }
    }

    public void deleteUser(int userId) {
        Response response = given()
                .header("Authorization", TOKEN)
                .delete("/users/" + userId);

        if (response.getStatusCode() == 204) {
            System.out.println("✅ User deleted successfully.");
        } else {
            System.out.println("❌ Failed to delete user: " + response.getStatusCode());
        }
    }

    public static void main(String[] args) {
        Gorest gorest = new Gorest();
//        int userId = 8012320;
        int userId = gorest.createUser();
//        gorest.getUserById(userId);
//        gorest.updateUser(userId);
//        gorest.deleteUser(userId);
    }
}
