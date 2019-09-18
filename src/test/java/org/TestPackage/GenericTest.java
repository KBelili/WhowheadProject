package org.TestPackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class GenericTest {
	
	WebDriver driver;

	public GenericTest() {
		super();
		System.setProperty("webdriver.gecko.driver", "C:\\Installation\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().to("https://fr.wowhead.com/");
	}
	
	@After
	public void teardown() {
		driver.close();
	}
	

}
