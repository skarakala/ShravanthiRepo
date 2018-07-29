package com.blackbuck.pkp.blackbuck.screens;

import static com.blackbuck.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderModificationScreen {
	
	private String idSelectAction = "opsAction";
	private String idCommentTxt = "free_ops_text_message";
	private String idSubmit = "submit_action";
	
	public void selectAction(String action) {
		Select selectAction = new Select(getDriver().findElement(By.id(idSelectAction)));
		selectAction.selectByVisibleText(action); 
	}
	
	public void enterComment(String comment) {
		WebElement commentTxt =  getDriver().findElement(By.id(idCommentTxt));
		commentTxt.sendKeys(comment); 
	}
	
	public void clickSubmit() {
		WebElement submitBtn = getDriver().findElement(By.id(idSubmit));
		submitBtn.click();
	}


}
