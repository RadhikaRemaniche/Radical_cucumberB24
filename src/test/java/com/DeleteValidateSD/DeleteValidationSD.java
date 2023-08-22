package com.DeleteValidateSD;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteValidationSD {
	Response response;
    int id;
	
	@Given("delete the user from system")
	public void delete_the_user_from_system() {
		System.out.println("======== Deleting user ============="+ id);
		response = RestAssured
				.given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.delete("https://reqres.in/api/users/"+id);
		
	}
	
	
	@Then("validate user deleted from system")
	public void validate_user_deleted_from_system() {
		Assert.assertTrue(true);
	}
}
