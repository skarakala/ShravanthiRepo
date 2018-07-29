package com.blackbuck.pkp.helpers.drivers;

public class DriverHelperFactory {
	
	private static Driver driver;
	
	public static void initWithBrowser(String browserName) throws Exception {
		
		switch(SupportedBrowsers.valueOf(browserName.toUpperCase())) {
		
		case CHROME : driver =  new ChromeDriverHelper();
		              break;
		
		default: throw new Exception("Unsupported Browser " + browserName);
		
		}
	}
	
	public static Driver getDriver() {
		return driver;
	}

}
