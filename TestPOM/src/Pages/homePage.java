package Pages;

import org.openqa.selenium.WebDriver;

import Action.actionsClass;
import Data.dataFetch;

public class homePage extends actionsClass {
	
	public homePage(WebDriver driver){
		this.driver=driver;
	}
	
	public void getURL(){
		//System.out.println(dataFetch.getdataValue("url"));
		hitURL(dataFetch.getdataValue("url"));
	}
	
}
