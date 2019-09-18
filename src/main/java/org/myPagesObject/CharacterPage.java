package org.myPagesObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CharacterPage extends GenericPage{

	public CharacterPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(how = How.XPATH, using="//table[@class='listview-mode-default']//tbody[@class='clickable']/tr[1]/td[3]//a[1]") 
	public WebElement clicFirstObject;
	
	public List<WebElement> objectsCharacter = driver.findElements(By.xpath("//div[@id][contains(@style,'float: left')]//span"));
	
	public void firstObject() {
		clicFirstObject.click();
	}

	public List<String> loadFile(String filePath) throws FileNotFoundException {
		   
	    URI uri = null;
	    Scanner s = new Scanner(new File(filePath), "UTF-8");
	    ArrayList<String> list = new ArrayList<String>();
	    while (s.hasNextLine()){
	        list.add(s.nextLine());
	    }
	    s.close();
	   
	    return list;
	}

}
