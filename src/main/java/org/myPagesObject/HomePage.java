package org.myPagesObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends GenericPage {
	
	public HomePage(WebDriver driver) {
	
		super(driver);
		PageFactory.initElements(driver, this);
		}
	
	
		@FindBy(how = How.XPATH, using="//form[@action='/search']//input[@name ='q']") 
		public WebElement researchInput;
		
		@FindBy(how = How.XPATH, using="//a[@class='header-search-button fa fa-search']")
		public WebElement researchClick;
		

		public void cookiesActiviy() {
			acceptCookie.click();
		}
		
		public void clickInputResearch () {
			researchInput.click();
		}
		
		public void fileInputResearch(WebElement link, String arg) {
			link.sendKeys(arg);
		}
		
		public BeforeResultPage clickResearch(WebElement link) {
			researchClick.click();
			return PageFactory.initElements(driver, BeforeResultPage.class);
		}
}
