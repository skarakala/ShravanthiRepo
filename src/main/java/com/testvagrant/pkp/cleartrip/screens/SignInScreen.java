package com.testvagrant.pkp.cleartrip.screens;

import static com.testvagrant.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import org.openqa.selenium.By;

import com.testvagrant.pkp.helpers.business.ClearTripResources;

public class SignInScreen {

	private String idSignInButton = "signInButton";
	private String idErrorsHead = "errors1";
	private String idLoginForm = "modal_window";
	
	public void submitEmptySignIn() {
		getDriver().click(By.id(idSignInButton));
	}
	
	public boolean isSignInErrorsExist() {
		String errors = getDriver().getText(By.id(idErrorsHead));
		return errors.contains(ClearTripResources.Errors.SIGN_IN_ERRORS);
	}
	
	public void switchToLoginFrame() {
		getDriver().switchToFrame(By.id(idLoginForm)); 
	}
	
}
