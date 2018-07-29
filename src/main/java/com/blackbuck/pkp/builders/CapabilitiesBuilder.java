package com.blackbuck.pkp.builders;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesBuilder {
	
	private DesiredCapabilities capabilities;
	
	public DesiredCapabilities build() {
		return this.capabilities;
	}

	public CapabilitiesBuilder buildDefaultChromeCapabiliteis() {
		this.capabilities = DesiredCapabilities.chrome();
		return this;
	}
	
}
