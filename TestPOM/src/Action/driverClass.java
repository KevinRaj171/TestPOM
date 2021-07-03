package Action;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Data.dataFetch;

public class driverClass {
	
	protected WebDriver driver;
	
	
	public void openBrowser(String browserName){
		if (browserName.equals("firefox")){
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/Users/Ajith/Selenium/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	@BeforeTest
	public void loadData(){
		dataFetch.prop();
	}
	
	@BeforeClass
	public void chooseBrowser(){
		//dataFetch.prop();
		openBrowser(dataFetch.getdataValue("browser"));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}
}
