package com.StepDef;

import java.util.List;

import io.cucumber.java.en.*;

public class S06MultipleRows {
	@Given("Test page should open")
	public void test_page_should_open() {
	    System.out.println("Loading home page");
	}

	@When("I pass the data as follows")
	public void i_pass_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(dataTable);
	    
	    List<List<String>>data = dataTable.asLists();
	    System.out.println(data);
	    
	    for(List<String>d : data)
	    {
	    	System.out.println(d);
	    }
	}

	@Then("Registration should successful")
	public void registration_should_successful() {
	    System.out.println("Thanks for registration");
	}
}
