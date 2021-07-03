package Test;

import org.testng.annotations.Test;

import Action.driverClass;
import Pages.homePage;

public class homePageTest extends driverClass{
	
	// HomePage Test
	@Test
	public void login(){
		homePage obj = new homePage(driver);
		obj.getURL();
	}
}
