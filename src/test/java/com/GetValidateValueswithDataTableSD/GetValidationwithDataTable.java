package com.GetValidateValueswithDataTableSD;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetValidationwithDataTable {

	Response response;
	@Given("hit the URI1")
	public void hit_the_uri1() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
		System.out.println("got the response");
	}
	@Then("validate value for below table")
	public void validate_value_for_below_table(DataTable allData) {
		
		List<List<String>> allDataInList= allData.asLists();//get all the list
		String singleValueString = allDataInList.get(0).get(0);//0th row 0th col
		System.out.println("====="+singleValueString);
		
		String secondValueString = allDataInList.get(0).get(1);//0th row 1th col
		System.out.println("====="+secondValueString);
		
		for(int i=0; i<allDataInList.size();i++) {
			String actualTitleString= response.getBody().jsonPath().getString(allDataInList.get(i).get(0));
			Assert.assertTrue(actualTitleString.equals(allDataInList.get(i).get(1)));//if equal return true
		}
//		String dataString = response.getBody().asString();//get the actual content from the uri 
//		System.out.println("All Data ==== " +dataString);//printing above data 
//		String actualTitleString= response.getBody().jsonPath().getString("books[1].title");// getting the book with index value of it using title
//		Assert.assertTrue(actualTitleString.equals(title));//if equal return true
//		int pagesInt=response.getBody().jsonPath().getInt("books[1].pages");
//		String pagesString =""+pagesInt;//convert int to string 
//		Assert.assertEquals(pagesString,int1);
	} 
		
}
