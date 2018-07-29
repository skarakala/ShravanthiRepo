package com.blackbuck.pkp.blackbuck.screens;

import static com.blackbuck.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CreatedOrdersScreen {
	
	private String xToastMessage = "//div[contains(text(), 'Created Successfully')]";
	private String idSearchTxt = "order_search";
	private String idOrdersTable = "orders-table";
	private String xLatestOrderCol = "//tbody//tr[1]//td[1]//span[4]";
	
	public String getOrderFromOrderTable() {
		WebElement orderTable = getDriver().findElement(By.id(idOrdersTable));
		String orderText = orderTable.findElement(By.xpath(xLatestOrderCol)).getText();
		System.out.println("Latest Order: " + orderText);
		return orderText.trim().substring(2, 8);
	}
	
	public void searchOrder(String orderId) {
		WebElement searchOrderTxt = getDriver().findElement(By.id(idSearchTxt));
		System.out.println("OrderId is: " + orderId);
		searchOrderTxt.sendKeys(orderId);
		searchOrderTxt.sendKeys(Keys.ENTER);
	}

}
