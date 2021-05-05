package com.automatedtest.digital.Alert;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AlertPagesteps {
	private AlertPage alertpage;


	    public AlertPagesteps() {
	        this.alertpage = new AlertPage();
	    }

	    @Given("^A user navigates to HomePage$")
	    public void a_user_navigates_to_homepage() throws Throwable {
	    	this.alertpage.goToHomePage();
	       
	       
	    }

	    @Then("^Must click on ‘On button click, alert will appear after 5 seconds$")
	    public void must_click_on_on_button_click_alert_will_appear_after_5_seconds() throws Throwable {
	        this.alertpage.clickme();
	    }



	    @And("^Must accept alert$")
	    public void must_accept_alert() throws Throwable {
	    	this.alertpage.AcceptAlert();
	    	
	    }
}