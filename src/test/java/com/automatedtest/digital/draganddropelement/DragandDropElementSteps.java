package com.automatedtest.digital.draganddropelement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DragandDropElementSteps {
	private DragandDropElementpage draganddropelementpage;


    public DragandDropElementSteps() {
        this.draganddropelementpage = new DragandDropElementpage();
    }

    @Given("^A user navigates to HomePage$")
    public void a_user_navigates_to_homepage() throws Throwable {
    	this.draganddropelementpage.goToHomePage();
     
       
    }
    @Then("^Must drag and drop the ‘Drag me’ element into the specified area$")
    public void must_drag_and_drop_the_drag_me_element_into_the_specified_area() throws Throwable {
        this.draganddropelementpage.Draganddrop();
    }

}
