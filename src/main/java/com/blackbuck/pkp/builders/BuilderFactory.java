package com.blackbuck.pkp.builders;

public class BuilderFactory {
	
	private static CapabilitiesBuilder capabilitiesBuilder = new CapabilitiesBuilder();
	private static ChromeOptionsBuilder chromeOptionsBuilder = new ChromeOptionsBuilder();
	
	public static CapabilitiesBuilder getCapabilitiesBuilder() {
		return capabilitiesBuilder;
	}
	
	public static ChromeOptionsBuilder getChromeOptionsBuilder() {
		return chromeOptionsBuilder;
	}

}
