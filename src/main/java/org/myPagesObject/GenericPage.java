package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public abstract class GenericPage {
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),\"Continuer\")]") 
	WebElement acceptCookie;
	
	
	protected final WebDriver driver;
	
	public GenericPage(WebDriver driver) {
		super();
		this.driver = driver;
	
	}
	


}
