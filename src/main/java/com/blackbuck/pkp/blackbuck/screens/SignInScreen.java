package com.blackbuck.pkp.blackbuck.screens;

import static com.blackbuck.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.blackbuck.pkp.helpers.business.BlackBuckResources;

public class SignInScreen {

	private String idUsername = "username";
	private String idPassword = "password";
	private String idLoginBtn = "login-btn";
	
	public void openBlackBuckSite() {
		getDriver().openUrl(BlackBuckResources.BLACK_BUCK_URL); 
	}
	
	public void enterUserName() {
		WebElement loginTxt = getDriver().findElement(By.id(idUsername));
		loginTxt.click();
		loginTxt.sendKeys(BlackBuckResources.USERNAME);
	}
	
	public void enterPassword() {
		WebElement passwordTxt = getDriver().findElement(By.id(idPassword));
		passwordTxt.click();
		passwordTxt.sendKeys(BlackBuckResources.PASSWORD);
	}
	
	public void clickSignIn() {
		WebElement signInBtn = getDriver().findElement(By.id(idLoginBtn));
		signInBtn.click();
	}
	
}
