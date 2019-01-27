package com.blackbuck.pkp.blackbuck.screens;

import static com.blackbuck.pkp.helpers.drivers.DriverHelperFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.blackbuck.pkp.helpers.business.DynamicContentResources;

public class DynamicContentScreen {
	
	private static final String WORD_PATTERN = "\\s+";
	private static final int EXPECTED_WORD_LENGTH = 10;
	
	private String idContentTable = "content";
	
	public void openDynamicContentSite() {
		getDriver().openUrl(DynamicContentResources.SITE_URL);
	}
	
	public boolean isContentHas10CharWord() {
		
		final WebElement content = getDriver().findElement(By.id(idContentTable));
		final List<WebElement> rows = content.findElements(By.className("row"));
		
		for (WebElement row : rows) {
			WebElement textContent = row.findElements(By.tagName("div")).get(1);
			final String text = textContent.getText();
			for (String word : text.split(WORD_PATTERN)) {
				if (word.length() >= EXPECTED_WORD_LENGTH) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String getLongestWordOnPage() {
		final WebElement content = getDriver().findElement(By.id(idContentTable));
		final List<WebElement> rows = content.findElements(By.className("row"));
		
		int maxWordLength = 0;
		String maxLengthWord = null;
		
		for (WebElement row : rows) {
			WebElement textContent = row.findElements(By.tagName("div")).get(1);
			final String text = textContent.getText();
			for (String word : text.split(WORD_PATTERN)) {
				if (word.length() > maxWordLength) {
					maxWordLength = word.length();
					maxLengthWord = word;
				}
			}
		}
		return maxLengthWord;
	}
	
	public boolean isPunisherPresent() {
		final WebElement content = getDriver().findElement(By.id(idContentTable));
		final List<WebElement> rows = content.findElements(By.className("row"));
		
		for (WebElement row : rows) {
			WebElement img = row.findElements(By.tagName("img")).get(0);
			final String srcText = img.getAttribute("src");
			final String punisherSrc = "Original-Facebook-Geek-Profile-Avatar-" + Avatars.PUNISHER.getCardinality() + ".jpg";
			if (srcText.contains(punisherSrc)) {
				return true;
			}
		}
		return false;
	}
	
	public List<String> getNamesOfAvatars() {
		final WebElement content = getDriver().findElement(By.id(idContentTable));
		final List<WebElement> rows = content.findElements(By.className("row"));
		List<String> avatarNames = new ArrayList<String>();
		
		for (WebElement row : rows) {
			WebElement img = row.findElements(By.tagName("img")).get(0);
			final String srcText = img.getAttribute("src");
			
			for (Avatars avatar : Avatars.values()) {
				final String punisherSrc = "Original-Facebook-Geek-Profile-Avatar-" + avatar.getCardinality() + ".jpg";
				if (srcText.contains(punisherSrc)) {
					avatarNames.add(avatar.name());
				}
			}
		}
		return avatarNames;
	}

}

enum Avatars {
	BABY_M(1), SPACE_HELMET(2), PUNISHER(3), WOLVERINE(5), DARTH_VADER(6), JOKER(7);
	
	private int cardinalNumber;
	Avatars(final int cardinalNumber) {
		this.cardinalNumber = cardinalNumber;
	}
	
	public int getCardinality() {
		return this.cardinalNumber;
	}
}
