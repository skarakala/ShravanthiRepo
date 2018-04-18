package com.testvagrant.pkp.cleartrip.screens;

import static com.testvagrant.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testvagrant.pkp.helpers.business.ClearTripResources;

public class HotelBookingScreen {
	
	private String idLocalityTextBox = "Tags";
    private String idSearchHotelsButton = "SearchHotelsButton";
    private String idTravellerSelection = "travellersOnhome";
    
    public void submitSearchOneRoomTwoAdultsFor(String locality) {
    	getDriver().sendKeys(By.id(idLocalityTextBox), locality);
    	WebElement travellerSelection = getDriver().findElement(By.id(idTravellerSelection));
    	getDriver().getSelectFromElement(travellerSelection).selectByVisibleText(ClearTripResources.RoomCapacity.ONE_ROOM_TWO_ADULTS);
    	getDriver().click(By.id(idSearchHotelsButton));
    }

}
