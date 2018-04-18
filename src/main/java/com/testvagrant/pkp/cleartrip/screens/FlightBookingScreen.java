package com.testvagrant.pkp.cleartrip.screens;

import static com.testvagrant.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightBookingScreen {
	
	private String idOneWayRadioButton = "OneWay";
	private String idFromText = "FromTag";
	private String idToText = "ToTag";
	private String idSearchButton = "SearchBtn";
	private String idOriginOptions = "ui-id-1";
	private String idDestinationOptions = "ui-id-2";
	private String xpathDatePickerTable = "//*[@id='ui-datepicker-div']/div[1]/table/tbody";
	
	public void submitFlightSearch(String origin, String destination) {
		getDriver().click(By.id(idOneWayRadioButton));
		getDriver().click(By.id(idFromText));
		getDriver().sendKeys(By.id(idFromText), origin);
		List<WebElement> originOptions = getDriver().findElement(By.id(idOriginOptions)).findElements(By.tagName("li"));
		originOptions.get(0).click();
		getDriver().click(By.id(idToText));
		getDriver().sendKeys(By.id(idToText), destination);
		List<WebElement> destinationOptions = getDriver().findElement(By.id(idDestinationOptions)).findElements(By.tagName("li"));
		destinationOptions.get(0).click();
		WebElement element = getDriver().findElement(By.xpath(xpathDatePickerTable));
		List<WebElement> allCells = element.findElements(By.tagName("td"));
		for (WebElement cell : allCells) {
			String dataHanlderAttribute = cell.getAttribute("data-handler");
			if (null != dataHanlderAttribute && dataHanlderAttribute.equals("selectDate")) {
				cell.click();
				break;
			}
		}
		getDriver().click(By.xpath(xpathDatePickerTable)); 
		getDriver().click(By.id(idSearchButton)); 
	}


}
