package com.automatedtest.digital.SetDate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SetDatesteps {
	private SetDatepage setdatepage;

	    public SetDatesteps() {
	        this.setdatepage = new SetDatepage();
	    }
	    @Given("A user navigates to HomePage")
	    public void a_user_navigates_to_home_page() {
	    	this.setdatepage.goToHomePage();
	    	
	       
	    }

	    @When("^Must select a date using date picker from ‘Select Date’ field$")
	    public void must_select_a_date_using_date_picker_from_select_date_field() throws Throwable {
	    	this.setdatepage.selectdatepicker();
	    }
	    @Then("^Date Must be 1 month from today’s date$")
	    public void date_must_be_1_month_from_todays_date() throws Throwable {
	         this.setdatepage.Selectdate_onemonth_from_todaysdate();
	    }
	 
	    
	    }

