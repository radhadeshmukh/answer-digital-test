package com.automatedtest.digital.Alert;

import org.openqa.selenium.support.FindBy;



//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import com.automatedtest.digital.basepage.Basepage;
import com.automatedtest.digital.infrastructure.driver.Wait;

public class AlertPage extends Basepage {

    private static final String HOME_PAGE_URL = "https://demoqa.com/alerts";

    @FindBy(id = "timerAlertButton")
    private WebElement clickme;


    AlertPage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
   
        
        Wait.forLoading(5);
        Wait.forElementToBeDisplayed(100, this.clickme, "clickme");
    }

    void clickme() throws Throwable {
        Wait.forElementToBeDisplayed(5, this.clickme, "clickme");
        this.clickme.click();
     
       Thread.sleep(8000);
    }
   
    void AcceptAlert() throws Throwable
    {
    	
    	driver.switchTo().alert().accept();
    }
}
    
