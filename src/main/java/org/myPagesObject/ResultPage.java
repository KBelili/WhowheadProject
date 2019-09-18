package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends GenericPage {

	public ResultPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(how = How.XPATH, using="//table[@class='listview-mode-default']//td[@class='icon-boss-padded']/a[1]") 
	public WebElement clicBoss;
	
	
	public CharacterPage clickCharacter(WebElement link) {
		link.click();
		return PageFactory.initElements(driver, CharacterPage.class);
	}

	
	
	
}
