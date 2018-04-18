package com.testvagrant.pkp.helpers.business;

import com.testvagrant.pkp.cleartrip.screens.FlightBookingScreen;
import com.testvagrant.pkp.cleartrip.screens.FlightSearchResultsScreen;
import com.testvagrant.pkp.cleartrip.screens.HotelBookingScreen;
import com.testvagrant.pkp.cleartrip.screens.LandingScreen;
import com.testvagrant.pkp.cleartrip.screens.SignInScreen;

public class ClearTripHelper {
	
	
	public void searchFlightsBetweenCities(String origin, String destination) {
		new LandingScreen().openLandingPage();
		new FlightBookingScreen().submitFlightSearch(origin, destination); 
	}
	
	public boolean isFlightSearchResultsDisplayed() {
		return new FlightSearchResultsScreen().isSearchResultsSummaryPresent();
	}
	
	public void searchHotelsForLocality(String locality) {
		LandingScreen landingScreen = new LandingScreen();
		landingScreen.openLandingPage();
		landingScreen.navigateToHotelBooking();
		new HotelBookingScreen().submitSearchOneRoomTwoAdultsFor(locality);
	}
	
	public void doWrongSignIn() {
		LandingScreen landingScreen = new LandingScreen();
		landingScreen.openLandingPage();
		landingScreen.openSignInForYourTrips();
		SignInScreen signInScreen = new SignInScreen();
		signInScreen.switchToLoginFrame();
		signInScreen.submitEmptySignIn();
	}
	
	public boolean isWrongSignInErrorsExists() {
		return new SignInScreen().isSignInErrorsExist();
	}

}
