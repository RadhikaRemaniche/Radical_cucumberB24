package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMSStepDefination {
	@Given("Login with admin user")
	public void login_with_admin_user() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		//ChromeDriver driver = new ChromeDriver();
		//_____
		//_____  so on 
		System.out.println("Step: Login with admin user");
}

	@When("Go to PIM Tab")
	public void go_to_pim_tab() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println("Step: Go to PIM Tab");
}

	@When("hit Add Employee section")
	public void hit_add_employee_section() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("hit Add Employee section");
}

	@When("enter user details")
	public void enter_user_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("enter user details");
}

	@When("hit save button")
	public void hit_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("hit save button");
}

	@When("search the user")
	public void search_the_user() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("search the user");
}

	@Then("validate user gettting searched")
	public void validate_user_gettting_searched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("validate user gettting searched");
	}

	
	@When("don’t enter all mandatory user details")
	public void don_t_enter_all_mandatory_user_details() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("don’t enter all mandatory user details");

	}

	@Given("validate the user not getting searched")
	public void validate_the_user_not_getting_searched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("validate the user not getting searched");
	}

}
