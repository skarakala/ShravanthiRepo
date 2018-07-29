package com.blackbuck.pkp.builders;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptionsBuilder {
	private ChromeOptions options;
	
	
	public ChromeOptions build() {
		return this.options;
	}
	
	public ChromeOptionsBuilder fromCapabilities(DesiredCapabilities caps) {
		options = new ChromeOptions();
		this.options.setCapability(ChromeOptions.CAPABILITY, caps);
		return this;
	}
	
	public ChromeOptionsBuilder buildDefault() {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		return this;
	}
	
	public ChromeOptionsBuilder withArgument(String argument) {
		options.addArguments(argument);
		return this;
	}
	
	public ChromeOptionsBuilder withBooleanCapability(String name, boolean value) {
		options.setCapability(name, value);
		return this;
	}
	
	public ChromeOptionsBuilder withCapability(String name, String value) {
		options.setCapability(name, value);
		return this;
	}
	
	public ChromeOptionsBuilder withPlatformCapability(String name, Platform value) {
		options.setCapability(name, value);
		return this;
	}
	
	public ChromeOptionsBuilder withObjectCapability(String name, Object value) {
		options.setCapability(name, value);
		return this;
	}
}
