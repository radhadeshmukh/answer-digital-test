package com.automatedtest.digital.Closesmallmodal;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Closesmallmodalsteps {
	private Closesmallmodalpage closesmallmodalpage;


	    public Closesmallmodalsteps() {
	        this.closesmallmodalpage = new Closesmallmodalpage();
	    }

	    @Given("^A user navigates to HomePage$")
	    public void a_user_navigates_to_homepage() throws Throwable {
	    	this.closesmallmodalpage.goToHomePage();
	        
	       
	    }

	    @Then("^Must select ‘Small modal’ button$")
	    public void must_select_small_modal_button() throws Throwable {
	    	this.closesmallmodalpage.showSmallModal();
	        }


	    @And("^Must close the modal$")
	    public void must_close_the_modal() throws Throwable {
	    	this.closesmallmodalpage.closeSmallModal();
	    	
	    }
}