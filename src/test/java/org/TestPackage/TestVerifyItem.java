package org.TestPackage;



import org.junit.Test;
import org.myPagesObject.BeforeResultPage;
import org.myPagesObject.CharacterPage;
import org.myPagesObject.HomePage;
import org.myPagesObject.ResultPage;



public class TestVerifyItem extends GenericTest {
	
	public  TestVerifyItem() {
		super();
	}
	

	@Test
	public void test() throws Exception{
		//Access to application
	
		HomePage home = new HomePage(driver);
		
		//To accept cookies
		Thread.sleep(5000);
		home.cookiesActiviy();
		
		home.clickInputResearch();
		home.fileInputResearch(home.researchInput, "Lardeur");
		
		//to make a research
		BeforeResultPage beforeResult = home.clickResearch(home.researchClick);
		
		Thread.sleep(1000);
		
		//to go to PNJ
		ResultPage result = beforeResult.clickPNJ(beforeResult.clicPNJ);
		
		//to got to characters 
		CharacterPage charactere = result.clickCharacter(result.clicBoss);
		
		charactere.firstObject();
	//	charactere.loadFile(/src/test/resources/sources/firstObject)
		
		
		

	}
}
	