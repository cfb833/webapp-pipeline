package webapp;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

/**
 * Unit test for simple App.
 */
public class EmptyTestUI 
{
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("https://www.google.com/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Google")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}
}
