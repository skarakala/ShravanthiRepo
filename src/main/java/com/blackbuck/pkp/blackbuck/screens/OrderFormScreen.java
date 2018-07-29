package com.blackbuck.pkp.blackbuck.screens;

import static com.blackbuck.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.blackbuck.pkp.helpers.business.BlackBuckResources;

public class OrderFormScreen {
	
	private String idCustomorAutoCompleteTag = "customer_autocomplete";
	private String idStartLocationTag = "start_location_warehouse";
	private String idEndLocationTag = "end_location_warehouse";
	private String idProduct = "product";
	private String idTruckType = "truck_type";
	private String idShipmentDate = "end_date";
	private String xDatePicker = "//div[@class='xdsoft_datetimepicker xdsoft_ xdsoft_noselect ']";
	private String idOptimizedLoading = "optimized_loading";
	private String idManualPlacement = "manual_placement";
	private String idSourceEmail = "source_email";
	private String idSourceEmailDate = "source_email_date";
	private String idCustomRequirements = "custom_requirements";
	private String txtCreateOrderBtn = "Create Order";
	private String xContinueOrderCreation = "//button[text()='YES']";
    
	
	public void selectCustomer(String customerName) {
		WebElement autoCompleteTag = getDriver().findElement(By.id(idCustomorAutoCompleteTag));
		WebElement customerNameTxt = autoCompleteTag.findElement(By.tagName("input"));
		customerNameTxt.sendKeys(customerName);
		autoCompleteTag = getDriver().findElement(By.id(idCustomorAutoCompleteTag));
		WebElement listItem = autoCompleteTag.findElement(By.tagName("li"));
		listItem.click();
	}
	
	public void enterStartLocation(String warehouseLocation) {
		WebElement startLocationTag = getDriver().findElement(By.id(idStartLocationTag));
		WebElement startLocationTxt = startLocationTag.findElement(By.tagName("input"));
		startLocationTxt.sendKeys(warehouseLocation);
		startLocationTag = getDriver().findElement(By.id(idStartLocationTag));
		WebElement listItem = startLocationTag.findElement(By.tagName("li"));
		listItem.click();
	}
	
	public void enterEndLocation(String warehouseLocation) {
		WebElement endLocationTag = getDriver().findElement(By.id(idEndLocationTag));
		WebElement startLocationTxt = endLocationTag.findElement(By.tagName("input"));
		startLocationTxt.sendKeys(warehouseLocation);
		endLocationTag = getDriver().findElement(By.id(idEndLocationTag));
		WebElement listItem = endLocationTag.findElement(By.tagName("li"));
		listItem.click();
	}
	
	public void selectProduct(String productName) {
		Select productSelect = new Select(getDriver().findElement(By.id(idProduct)));
		productSelect.selectByVisibleText(productName);
	}
	
	public void selectTruckType(String truckType) {
		Select truckTypeSelect = new Select(getDriver().findElement(By.id(idTruckType)));
		truckTypeSelect.selectByVisibleText(truckType); 
	}
	
	public void enterShipmentDate(String date) {
		WebElement shipmentDate = getDriver().findElement(By.id(idShipmentDate));
		shipmentDate.click();
		shipmentDate.sendKeys(date);
		shipmentDate.sendKeys(Keys.TAB);
		/*final String [] dateArray = date.split("-");
		String xpathPatternDate = "//td[@data-date='%s' and @data-month='%s' and @data-year='%s']";
		String xpathDateToSlect = String.format(xpathPatternDate, dateArray[0], dateArray[1], dateArray[2]);
		WebElement dateFromPicker = getDriver().findElement(By.xpath(xDatePicker)).findElement(By.xpath(xpathDateToSlect));
		getDriver().scrollIntoView(dateFromPicker);
		dateFromPicker.click();*/
	}
	
	public void checkOptimizedLoading() {
		WebElement optimizedLoading = getDriver().findElement(By.id(idOptimizedLoading));
		optimizedLoading.click();
	}
	
	public void checkManualPlacement() {
		WebElement manualPlacement = getDriver().findElement(By.id(idManualPlacement));
		manualPlacement.click();
	}
	
	public void enterSourceEmail(String email) {
		WebElement sourceEmail = getDriver().findElement(By.id(idSourceEmail));
		sourceEmail.sendKeys(email);
	}
	
	public void enterSourceEmailDate(String emailDate) {
		WebElement sourceEmailDate = getDriver().findElement(By.id(idSourceEmailDate));
		sourceEmailDate.click();
		sourceEmailDate.sendKeys(emailDate);
		sourceEmailDate.sendKeys(Keys.TAB);
		/*final String [] dateArray = emailDate.split("-");
		String xpathPatternDate = "//td[@data-date='%s' and @data-month='%s' and @data-year='%s']";
		String xpathDateToSlect = String.format(xpathPatternDate, dateArray[0], dateArray[1], dateArray[2]);
		WebElement dateFromPicker = getDriver().findElement(By.xpath(xDatePicker)).findElement(By.xpath(xpathDateToSlect));
		getDriver().scrollIntoView(dateFromPicker);
		dateFromPicker.click();*/
	}
	
	public void enterCustomComments(String comments) {
		WebElement commentTxt = getDriver().findElement(By.id(idCustomRequirements));
		commentTxt.sendKeys(comments); 
	}
	
	public void clickCreateOrder() {
		List<WebElement> buttons = getDriver().findElements(By.tagName("button"));
		for (WebElement button : buttons) {
			String buttonTxt = button.getText();
			if (buttonTxt.equals(txtCreateOrderBtn)) {
				button.click();
			}
		}
		/*buttons = getDriver().findElements(By.xpath(xContinueOrderCreation));
		if (!buttons.isEmpty()) {
			getDriver().findElement(By.xpath(xContinueOrderCreation)).click();
		}*/
	}

}
