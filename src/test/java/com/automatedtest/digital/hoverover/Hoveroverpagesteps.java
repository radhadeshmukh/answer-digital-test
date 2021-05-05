package com.automatedtest.digital.hoverover;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Hoveroverpagesteps {
	private Hoveroverpage hoveroverpage;

	    public Hoveroverpagesteps() {
	        this.hoveroverpage = new Hoveroverpage();
	    }

	    @Given("^A user navigates to the page$")
	    public void a_user_navigates_to_the_page() throws Throwable {
	    	this.hoveroverpage.goToHomePage();
	    	
	       
	    }

	    @When("Hoverover the button")
	    public void hoverover_the_button() throws Throwable {
	    	this.hoveroverpage.hovermetoseebutton();
	    	
	    }
	    @When("^Hoverover the input field$")
	    public void hoverover_the_input_field() throws Throwable {
	    	this.hoveroverpage.Hoveinputfield();
	    	
	    }

	    @Then("^Must hover over the ‘Hover me to see’ button$")
	    public void must_hover_over_the_hover_me_to_see_button() throws Throwable {
	      this.hoveroverpage.Tooltipbutton();
	    }
	    @Then("^Must hover over the ‘Hover me to see’ field$")
	    public void must_hover_over_the_hover_me_to_see_field() throws Throwable {
	        this.hoveroverpage.tooltipinputfield();
	    }
}