package com.automatedtest.digital.StudentRegistration;

import java.io.File;
import org.junit.Assert;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.automatedtest.digital.basepage.Basepage;
import com.automatedtest.digital.infrastructure.driver.Wait;
import io.cucumber.datatable.DataTable;

public class StudentRegistrationpage extends Basepage {

	private static final String HOME_PAGE_URL = "https://demoqa.com/automation-practice-form";

	@FindBy(how = How.ID, using = "dateOfBirthInput")
	private WebElement dateOfBirthInput;

	@FindBy(how = How.XPATH, using = "//input[@value=\"Female\"]/parent::div//label ")
	private WebElement Gender;

	@FindBy(how = How.ID, using = "userNumber")
	private WebElement userNumber;

	@FindBy(how = How.ID, using = "uploadPicture")
	private WebElement uploadPicture;

	@FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
	private WebElement submit;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Thanks for submitting the form')]")
	private WebElement Thanksmsg;

	@FindBy(how = How.ID, using = "closeLargeModal")
	private WebElement close;

	@FindBy(how = How.XPATH, using = "//table")
	private WebElement table;

	@FindBy(how = How.XPATH, using = "//div//select[@class=\"react-datepicker__month-select\"]")
	public WebElement Dmonth;

	StudentRegistrationpage() {
		PageFactory.initElements(driver, this);
	}

	void goToHomePage() {
		driver.get(HOME_PAGE_URL);
		// Wait.

		Wait.forLoading(5);
	}

	void EnterDetails() throws InterruptedException {

		// Fill All the manditory Details.
		String[] arr = { "firstName", "lastName", "userNumber" };
		String[] arr1 = { "Radha", "Deshmukh", "123455676789" };
		this.Gender.click();
		for (int i = 0; i < arr.length; i++) {
			driver.findElement(By.xpath("//input[@id=\"" + arr[i] + "\"]")).click();
		}
		for (int i = 0; i < arr.length; i++) {
			driver.findElement(By.xpath("//input[@id=\"" + arr[i] + "\"]")).sendKeys(arr1[i]);
		}

		dateOfBirthInput.click();
		Dmonth.click();
		Select s = new Select(Dmonth);
		String dateString = "5";
		s.selectByValue("5");

		driver.findElement(By.xpath("(//div[contains(@class,'datepicker__day') and (text()='" + dateString + "')])[1]"))
				.click();
	}

	void fileupload() {

		// Upload the file

		File classpathRoot = new File(System.getProperty("user.dir"));
		File picturesDir = new File(classpathRoot, "/src/main/resources");
		File picture = new File(picturesDir, "download.jpeg");
		String picturePath = picture.getAbsolutePath();
		this.uploadPicture.sendKeys(picturePath);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", submit);
		this.submit.click();
	}

	public void verifyHtmlTableData(DataTable dataTable) {
		this.Thanksmsg.isDisplayed();

		List<WebElement> rowElements = table.findElements(By.xpath(".//tr")); // get all of the row WebElements from the
																				// table
		rowElements.remove(0); // remove the "header" row from the list of row WebElements

		List<List<String>> dataTableRows = dataTable.asLists(); // outer List<> is rows, inner List<> is cells
		for (List<String> row : dataTableRows) { // loop through every row in the DataTable input
			int rowIdx = dataTableRows.indexOf(row);
			WebElement rowElem = rowElements.get(rowIdx); // get the row WebElement based on the index of the current
															// row in the DataTable
			List<WebElement> cellElements = rowElem.findElements(By.xpath(".//td")); // get all of the cells from the
																						// row WebElement

			for (String expectedCell : row) { // loop through every cell in the current DataTable row
				int cellIdx = row.indexOf(expectedCell);
				String actualCell = cellElements.get(cellIdx).getText();

				/*
				 * System.out.println for demonstration purposes
				 */
				//System.out.println("DataTable row " + rowIdx + ", cell " + cellIdx + ": " + expectedCell);
				//System.out.println("Actual value on the page: " + actualCell);

				Assert.assertTrue("Expected value of cell should match actual value of cell",
						expectedCell.contains(actualCell));

			}

		}
	}

	void DatanotEnteredCorrectly() {

		this.close.click();
		driver.navigate().refresh();
		this.userNumber.sendKeys("userNumber");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", submit);
		this.submit.click();

		this.Gender.click();
		String Errorcolor = this.userNumber.getCssValue("border-color");
		String Expected = "rgb(220, 53, 69)";
		Assert.assertTrue(Errorcolor.contains(Expected));

	}

}
