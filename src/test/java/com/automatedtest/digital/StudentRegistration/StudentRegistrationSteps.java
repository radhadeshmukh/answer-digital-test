package com.automatedtest.digital.StudentRegistration;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StudentRegistrationSteps {
	private StudentRegistrationpage studentregistration;
	

	public StudentRegistrationSteps() {
		this.studentregistration = new StudentRegistrationpage();
	}


    @Given("^A user navigates to Student Registration page$")
    public void a_user_navigates_to_student_registration_page() throws Throwable {
		this.studentregistration.goToHomePage();
	}
	@DataTableType(replaceWithEmptyString = "<empty>")
	public String stringType(String cell) {
	    return "";
	}

	  @When("^All mandatory details must be entered$")
	    public void all_mandatory_details_must_be_entered() throws Throwable {
		this.studentregistration.EnterDetails();
	
	}
	
	 

	    @Then("^A picture must be uploaded$")
	    public void a_picture_must_be_uploaded() throws Throwable {
	    	this.studentregistration.fileupload();
	    }

	 

	    @And("^On success a popup will be displayed detailing all information entered$")
	    public void on_success_a_popup_will_be_displayed_detailing_all_information_entered(DataTable dataTable) throws Throwable {
	    	 this.studentregistration.verifyHtmlTableData(dataTable);
	    }
	    @And("^Validation will be displayed on any mandatory fields that have not been entered correctly$")
	    public void validation_will_be_displayed_on_any_mandatory_fields_that_have_not_been_entered_correctly() throws Throwable {
	       this.studentregistration.DatanotEnteredCorrectly();
	    }

		
	
}
