package com.blackbuck.pkp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.blackbuck.pkp.helpers.business.BusinessHelperFactory;
import com.blackbuck.pkp.helpers.business.DynamicContentHelper;
import com.blackbuck.pkp.test.ChromeBaseTest;

public class DynamicContetTests extends ChromeBaseTest {
	
	private DynamicContentHelper dcHelper;
	
	@BeforeClass
	public void setupBeforeClassDynamicContent() {
		dcHelper = BusinessHelperFactory.getDynamicContentHelper();
		this.dcHelper.openSite();
	}
	
	@Test(groups = {"P0"}, description = "Print longest word and assert that a word with at least 10 length present")
	public void testWords() {
		System.out.println(this.dcHelper.getLongestWord());
		Assert.assertTrue(this.dcHelper.is10CharLongWordPresent(), "A word with at least 10 length not present");
	}
	
	@Test(groups = {"P0"}, description = "Print all avatars and check for the punisher")
	public void testAvatars() {
		System.out.println(this.dcHelper.getAvatarNames());
		Assert.assertTrue(this.dcHelper.isPunisherPresent(), "Punisher not present on the screen"); 
	}

}
