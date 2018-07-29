package com.blackbuck.pkp.helpers.drivers;

public enum SupportedBrowsers {
	
	CHROME("Chrome");
	
	private String browserName;
	
	SupportedBrowsers(String browserName) {
		this.browserName = browserName;
	}
	
	public String getCommonName() {
		return this.browserName;
	}

}
