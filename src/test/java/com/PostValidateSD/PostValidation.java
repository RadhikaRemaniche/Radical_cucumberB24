package com.PostValidateSD;

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

public class PostValidation {
	Response response;
//	@Given("post the data to create user")
//	public void post_the_data_to_create_user() {
//	    response= RestAssured
//	    		.given()
//	    		.relaxedHTTPSValidation()//tells its secured
//	    		.accept(ContentType.JSON)//sends the format of the code i.e.written in json format
//	    		.body("{\r\n"
//	    				+ "    \"name\": \"user1\",\r\n"
//	    				+ "    \"job\": \"QA-Engineer\",\r\n"
//	    				+ "    \"mob\": \"1234567891\",\r\n"
//	    				+ "    \"dept\": \"QA-Automation\",\r\n"
//	    				+ "    \"location\" : \"Pune\"\r\n"
//	    				+ "}")
//	    		.post("https://reqres.in/api/users");
//	}

	@Given("post the data to create user from file")
	public void post_the_data_to_create_user_from_file() {
		File file = new File("src/test/java/com/PostValidateSD/CreateUser.json");
		response = RestAssured.given().relaxedHTTPSValidation()// tells its secured
				.accept(ContentType.JSON)// sends the format of the code i.e.written in json format
				.body(file).post("https://reqres.in/api/users");
	}

	@Then("validate status code is {int}")
	public void validate_status_code_is(int statuscode) {
		Assert.assertEquals(statuscode, response.getStatusCode());
	}

	@Then("validate id created for user with non null value")
	public void validate_id_created_for_user_with_non_null_value() {
		String id = response.jsonPath().getString("id");
		System.out.println("=====" + id);

		Assert.assertTrue(!id.equals(null));
	}

	@Then("validate id created for user with non zero value")
	public void validate_id_created_for_user_with_non_zero_value() {
		int id = response.jsonPath().getInt("id");
		System.out.println("=====" + id);
		Assert.assertTrue(id > 0);
	}

	
	@Given("post the data to create user from file with updated name")
	public void post_the_data_to_create_user_from_file_with_updated_name() throws IOException {
	    String dataString = new String(Files.readAllBytes(Paths.get("src/test/java/com/PostValidateSD/CreateUser.json")));
	    
	    JSONObject jsonObject= new JSONObject(dataString);
	    
	    double randomNum= Math.random();
	    jsonObject.put("name","userName"+randomNum);//creating random usrname
	    jsonObject.put("job","555555"+randomNum);
	    String finaldataString = jsonObject.toString();//converting into string
	    
	    response = RestAssured
	    		.given()
	    		.relaxedHTTPSValidation()// tells its secured
				.accept(ContentType.JSON)// sends the format of the code i.e.written in json format
				.body(finaldataString)
				.post("https://reqres.in/api/users");
	    
	    		response.then().log().all();//print all the logs    
	}
	@Given("post the data to create user from file with updated name fields")
	public void post_the_data_to_create_user_from_file_with_updated_name_fields(DataTable table) throws IOException {
	    String dataString = new String(Files.readAllBytes(Paths.get("src/test/java/com/PostValidateSD/CreateUser.json")));
	    
	    JSONObject jsonObject= new JSONObject(dataString);
	    
	    double randomNum= Math.random();
	    List<List<String>> allDataList= table.asLists();
	    for(int i=0 ; i<allDataList.size();i++) {
	    	
	    	String field = allDataList.get(i).get(0);
	    	if(field.equals("name")) {
	    		 jsonObject.put("name","userName"+randomNum);
	    	}else if(field.equals("mob")) {
	    	    jsonObject.put("mob","1234567891"+randomNum);
	    	}
	    }
	    String finaldataString = jsonObject.toString();//converting into string
	    
	    response = RestAssured
	    		.given()
	    		.relaxedHTTPSValidation()// tells its secured
				.accept(ContentType.JSON)// sends the format of the code i.e.written in json format
				.body(finaldataString)
				.post("https://reqres.in/api/users");
	    
	    		response.then().log().all();//print all the logs    
	}
}
