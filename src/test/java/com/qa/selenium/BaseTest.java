package com.qa.selenium;

import io.restassured.RestAssured;

public class BaseTest {
    protected static final String TOKEN = "Bearer ae5edbc28c23176597ec86a9925e6b4fd4d2d5dbcb283ef5ac80bc9603c7de4d";

    static {
        RestAssured.baseURI = "https://gorest.co.in/public/v2";
    }
}
