package com.testvagrant.pkp.helpers.business;

public class BusinessHelperFactory {
	
	private static ClearTripHelper clearTripHelper = new ClearTripHelper();
	
	public static ClearTripHelper getClearTripHelper() {
		return clearTripHelper;
	}

}
