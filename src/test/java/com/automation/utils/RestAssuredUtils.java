package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUtils {
	 static RequestSpecification reqSpec = RestAssured.given();
	 static String endpoint;
	 static Response response;

	public static void setEndpoint(String endpoint){
		RestAssuredUtils.endpoint = endpoint;
	}
	public static void setBody(String body){
		reqSpec = reqSpec.body(body);
	}

	public static void setHeader(String key, String value){
		reqSpec = reqSpec.header(key, value);
	}
	public static void get(){
		response = reqSpec.get(endpoint);
	}
	public static int getStatusCode(){
		return response.getStatusCode();
	}
}
