package com.testvagrant.pkp.cleartrip.screens;

import static com.testvagrant.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import org.openqa.selenium.By;

import com.testvagrant.pkp.helpers.business.ClearTripResources;

public class LandingScreen {
	
	private String linkTextHotelLink = "Hotels";
	private String linkTextYourTrips = "Your trips";
	private String idSignIn = "SignIn";
	
	public void openLandingPage() {
		getDriver().openUrl(ClearTripResources.CLEAR_TRIP_URL);
	}
	
	public void navigateToHotelBooking() {
		getDriver().click(By.linkText(linkTextHotelLink));
	}
	
	public void openSignInForYourTrips() {
		getDriver().click(By.linkText(linkTextYourTrips));
		getDriver().click(By.id(idSignIn)); 
	}

}
