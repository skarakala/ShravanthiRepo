package com.blackbuck.pkp.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.blackbuck.pkp.helpers.drivers.DriverHelperFactory;
import com.blackbuck.pkp.utils.CommonUtils;

public class ChromeBaseTest {
	
	@BeforeSuite
	public void setupBeforeSuite() {
		CommonUtils.setDriverPath();
	}
	
	@BeforeClass
	public void setupBeforeClass() throws Exception {
		DriverHelperFactory.initWithBrowser("Chrome");
	}
	
	@AfterClass
	public void setupAfterClass() {
		DriverHelperFactory.getDriver().quit();
	}

}
