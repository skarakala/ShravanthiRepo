package com.blackbuck.pkp.helpers.business;

public class BusinessHelperFactory {
	
	private static BlackBuckHelper blackBuckHelper = new BlackBuckHelper();
	private static DynamicContentHelper dynamicContentHelper = new DynamicContentHelper();
	
	public static BlackBuckHelper getBlackBuckHelper() {
		return blackBuckHelper;
	}
	
	public static DynamicContentHelper getDynamicContentHelper() {
		return dynamicContentHelper;
	}

}
