package com.blackbuck.pkp.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.blackbuck.pkp.helpers.business.BlackBuckHelper;
import com.blackbuck.pkp.helpers.business.BusinessHelperFactory;
import com.blackbuck.pkp.test.ChromeBaseTest;

public class BlackBuckTests extends ChromeBaseTest {
	
	BlackBuckHelper blackBuckHelper;
	
	@BeforeClass
	public void setupBeforeClassClearTrip() {
		blackBuckHelper = BusinessHelperFactory.getBlackBuckHelper();
	}
	
	@Test(groups = {"P0"}, description = "Test order creation and modification")
	public void testOrderCreationAndModification() {
		blackBuckHelper.creatOrderAndModify();
	}
	
	

}
