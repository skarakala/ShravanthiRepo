package com.blackbuck.pkp.blackbuck.screens;

import static com.blackbuck.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;

import com.blackbuck.pkp.helpers.business.BlackBuckResources;

public class LandingScreen {
	
	private String idOrdersMenu = "menu_orders";
	private String idPlaceOrdersSubMenu = "submenu_place_orders";
	
	public void hoverOrders() {
		getDriver().mouseHover(By.id(idOrdersMenu));
	}
	
	public void clickPlaceOrders() {
		getDriver().click(By.id(idPlaceOrdersSubMenu)); 
	}

}
