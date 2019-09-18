package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BeforeResultPage extends GenericPage{

	public BeforeResultPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using="//div[@id='search-tabs']//div[contains(text(),'PNJ')]") 
	public WebElement clicPNJ;
	
	
	public ResultPage clickPNJ(WebElement link) {
		link.click();
		return PageFactory.initElements(driver, ResultPage.class);
	}
	

}
