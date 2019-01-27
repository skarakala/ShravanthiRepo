package com.blackbuck.pkp.helpers.business;

import java.util.List;

import com.blackbuck.pkp.blackbuck.screens.DynamicContentScreen;

public class DynamicContentHelper {
	
	private DynamicContentScreen dynamicContentScreen = new DynamicContentScreen();
	
	public void openSite() {
		this.dynamicContentScreen.openDynamicContentSite();
	}
	
	public boolean is10CharLongWordPresent() {
		return this.dynamicContentScreen.isContentHas10CharWord();
	}
	
	public String getLongestWord() {
		return this.dynamicContentScreen.getLongestWordOnPage();
	}
	
	public boolean isPunisherPresent() {
		return this.dynamicContentScreen.isPunisherPresent();
	}
	
	public List<String> getAvatarNames() {
		return this.dynamicContentScreen.getNamesOfAvatars();
	}

}
