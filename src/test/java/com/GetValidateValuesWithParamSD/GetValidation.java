package com.GetValidateValuesWithParamSD;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetValidation {

	Response response;
	@Given("hit the URI2")
	public void hit_the_uri2() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
		System.out.println("got the response");
	}
	@Then("validate title {string} and pages {string} of application")
	public void validate_title_and_pages_of_application(String title, String int1) {
		
		String dataString = response.getBody().asString();//get the actual content from the uri 
		System.out.println("All Data ==== " +dataString);//printing above data 
		String actualTitleString= response.getBody().jsonPath().getString("books[1].title");// getting the book with index value of it using title
		Assert.assertTrue(actualTitleString.equals(title));//if equal return true
		int pagesInt=response.getBody().jsonPath().getInt("books[1].pages");
		String pagesString =""+pagesInt;//convert int to string 
		Assert.assertEquals(pagesString,int1);
	} 
		@Then("validate value for {string} is {string}")
		public void validate_value_for(String str1, String str2) {
		    String actualTitleString = response.getBody().jsonPath().getString(str1);
		    Assert.assertTrue(actualTitleString.equals(str2));
		}
		@Then("validate value for attribute {string} is {string} present in response")
		public void validate_value_for_attribute_is_present_in_response(String str1, String expValue) {
			List<Object> allItems = response.getBody().jsonPath().getList("books."+str1);
			System.out.println("===" +allItems.toString());
			Assert.assertTrue(allItems.contains(expValue));
		}
}
