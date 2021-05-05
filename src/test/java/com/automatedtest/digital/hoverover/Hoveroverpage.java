package com.automatedtest.digital.hoverover;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.automatedtest.digital.basepage.Basepage;
import com.automatedtest.digital.infrastructure.driver.Wait;

public class Hoveroverpage extends Basepage {

    private static final String HOME_PAGE_URL = "https://demoqa.com/tool-tips";

    @FindBy(how = How.ID, using = "toolTipButton") 
	  private WebElement Hovermetoseebutton;
	  
    @FindBy(how = How.ID, using = "toolTipTextField")
    private WebElement Hoverinputfield;


    Hoveroverpage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
       
        Wait.forLoading(5);
    }

    void hovermetoseebutton() throws Throwable {
    	Wait.forLoading(5);
    	 Actions action = new Actions(driver);
    	 action.moveToElement(this.Hovermetoseebutton).perform();
    	 
    	
    }
  void Tooltipbutton()
  {
	  String toolTipText= Hovermetoseebutton.getText();
 	 
 	 System.out.println("toolTipText-->"+toolTipText);
 	 Boolean VerifyText = Hovermetoseebutton.getText().equalsIgnoreCase("Hover me to see");
 Assert.assertEquals(true,(VerifyText));

  }
   
    void Hoveinputfield() throws Throwable {
   	 Wait.forElementToBeDisplayed(10,this.Hoverinputfield,"Hoverinputfield");
   	 Actions action = new Actions(driver);
   	 action.moveToElement(this.Hoverinputfield).perform();
	 
   }

    void tooltipinputfield()
    {
    	Boolean VerifyText = Hoverinputfield.getAttribute("placeholder").equalsIgnoreCase("Hover me to see");
   	  Assert.assertEquals(true,(VerifyText));
    }
}

    
