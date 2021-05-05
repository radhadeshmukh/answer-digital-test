package com.automatedtest.digital.draganddropelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.automatedtest.digital.basepage.Basepage;


public class DragandDropElementpage extends Basepage{

	    private static final String HOME_PAGE_URL = "https://demoqa.com/droppable";

	    @FindBy(id = "draggable")
	    private WebElement draggable;

	    @FindBy(id = "droppable")
	    private WebElement droppable;

	    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Dropped!')]") 
		  private WebElement Dropped;
	    DragandDropElementpage() {
	        PageFactory.initElements(driver, this);
	    }

	    void goToHomePage(){
	        driver.get(HOME_PAGE_URL);
	  
	    }

	    void Draganddrop() throws Throwable {
	      
	        Actions act=new Actions(driver);					

	    	//Dragged and dropped.		
	             act.dragAndDrop(draggable, droppable).build().perform();	
	       Thread.sleep(8000);
	       Dropped.isDisplayed();
	    }
	 
	}

