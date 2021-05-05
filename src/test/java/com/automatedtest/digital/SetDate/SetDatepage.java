package com.automatedtest.digital.SetDate;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.How;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import com.automatedtest.digital.basepage.Basepage;
import com.automatedtest.digital.infrastructure.driver.Wait;





public class SetDatepage extends Basepage {

    private static final String HOME_PAGE_URL = "https://demoqa.com/date-picker";

    @FindBy(how = How.ID, using = "datePickerMonthYearInput") 
	  private WebElement datepicker;
    
    @FindBy(how = How.XPATH, using = "//div//select[@class=\"react-datepicker__year-select\"]") 
	  public WebElement DYear;
    
    @FindBy(how = How.XPATH, using = "//div//select[@class=\"react-datepicker__month-select\"]") 
	  public WebElement Dmonth;
    
   
  

    
    SetDatepage() {
        PageFactory.initElements(driver, this);
    }

    void goToHomePage(){
        driver.get(HOME_PAGE_URL);
       
        Wait.forLoading(5);
    }

    void selectdatepicker() throws Throwable {
    	  Wait.forElementToBeDisplayed(5, this.datepicker, "datepicker");
          this.datepicker.click();
       
    	
    }
  void Selectdate_onemonth_from_todaysdate() throws InterruptedException
  { 
	  
	  LocalDate futureDate = LocalDate.now().plusMonths(1);  
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	  String formattedString = futureDate.format(formatter);
	 
	  
	  DateTimeFormatter date = DateTimeFormatter.ofPattern("d");
	  String dateString = futureDate.format(date);
    
      
      
      DateTimeFormatter month = DateTimeFormatter.ofPattern("MMMM");
	  String monthString = futureDate.format(month);
    
      
      DateTimeFormatter Year = DateTimeFormatter.ofPattern("yyyy");
	  String YearString = futureDate.format(Year);
	  
   
    	      Select Y = new Select(DYear);
    	      Y.selectByVisibleText(YearString);
    	      
				
    	     Select s = new Select(Dmonth); 
    	      s.selectByVisibleText(monthString);
    	      
    	     driver.findElement(By.xpath("//div[text()='"+dateString+"']")).click();    	      
    	    String setdate= datepicker.getAttribute("value");
    	   
    	    Assert.assertTrue(formattedString.contains(setdate));
    	 
}
 
}