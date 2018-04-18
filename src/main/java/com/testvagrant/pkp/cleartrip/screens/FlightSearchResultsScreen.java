package com.testvagrant.pkp.cleartrip.screens;

import static com.testvagrant.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import org.openqa.selenium.By;

public class FlightSearchResultsScreen {
	
	private String classFlightResultSummary = "searchSummary";
	
	public boolean isSearchResultsSummaryPresent() {
		return getDriver().isElementPresent(By.className(classFlightResultSummary));
	}

}
