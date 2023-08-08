package com.ApplicationUP;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApplicationUPStepDef {
	Response response;

	@Given("hit the URI")
	public void hit_the_uri() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
		System.out.println("got the response");
	}

//	@Then("validate response of the application")
//	public void validate_response_of_the_application() {
//	   response.then().log().all();
//	   int ActualStatusCode = response.getStatusCode();
//	   int ExpectedStatusCode = 200;
//	   Assert.assertEquals(ExpectedStatusCode, ActualStatusCode);
//	   
//	}
	@Then("validate the response {string} of the application")
	public void validate_the_response_of_the_application(String statusCode) {
		response.then().log().all();//gets all the logs from the specified uri(uniform resource identifier)
		String ActualStatusCode = "" + response.getStatusCode();
		Assert.assertEquals(statusCode, ActualStatusCode);
	}

}
