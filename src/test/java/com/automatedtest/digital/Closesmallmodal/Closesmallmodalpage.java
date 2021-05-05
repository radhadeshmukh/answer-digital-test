package com.automatedtest.digital.Closesmallmodal;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automatedtest.digital.basepage.Basepage;
import com.automatedtest.digital.infrastructure.driver.Wait;

public class Closesmallmodalpage extends Basepage {

    private static final String HOME_PAGE_URL = "https://demoqa.com/modal-dialogs";
	 @FindBy(id = "showSmallModal")
	    private WebElement showSmallModal;

	 @FindBy(id = "closeSmallModal")
	    private WebElement closeSmallModal;
	 Closesmallmodalpage() {
	        PageFactory.initElements(driver, this);
	    }

	    void goToHomePage(){
	        driver.get(HOME_PAGE_URL);
	   
	        
	        Wait.forLoading(5);
	        Wait.forElementToBeDisplayed(100, this.showSmallModal, "clickme");
	    }

	    void showSmallModal() throws Throwable {
	        Wait.forElementToBeDisplayed(5, this.showSmallModal, "clickme");
	        this.showSmallModal.click();
	     
	      
	    }
	   
	    void closeSmallModal() throws Throwable
	    {
	       Wait.forElementToBeDisplayed(5, this.closeSmallModal, "clickme");
	        this.closeSmallModal.click();
			
	    }	
	    }
	

