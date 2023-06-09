package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseLogSpecification;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RestAPIDemo {
	public static void main(String[] args) throws FileNotFoundException {
		String body = readDataFromFile("src/test/resources/data/create_user_body.json");
		RestAssured.
				given().baseUri("https://restful-booker.herokuapp.com").body(body)
				.header("Content-Type","application/json").
				when().log().all().post("/booking").
				then().log().all().statusCode(200);

	}
	public static String readDataFromFile(String filePath)throws FileNotFoundException{
		File file=new File(filePath);
		Scanner sc=new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}

}
