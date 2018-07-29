package com.blackbuck.pkp.helpers.business;

public class BusinessHelperFactory {
	
	private static BlackBuckHelper blackBuckHelper = new BlackBuckHelper();
	
	public static BlackBuckHelper getBlackBuckHelper() {
		return blackBuckHelper;
	}

}
