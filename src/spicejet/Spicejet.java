package spicejet;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Spicejet {
	public WebDriver driver;
	
  @Test
  public void book() throws Exception {
	  
	  //Actions MouseOver //
	  Actions action = new Actions(driver);
	  WebElement sign = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	  action.moveToElement(sign).build().perform();
	  Thread.sleep(2000);
	  WebElement members = driver.findElement(By.linkText("SpiceClub Members"));
	  action.moveToElement(members).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Sign up")).click();
	 // WebElement signup = driver.findElement(By.linkText("Sign up"));
	 // action.moveToElement(signup).build().perform();
	  
	  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	  /*
	  // DropDown Validation //
	  WebElement str = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
		System.out.println(str.getText());
		if(str.getText().equalsIgnoreCase("AED"))
		{
			
			System.out.println("dropdown validation passed = INR");
			
			
		}else{
		
			System.out.println("dropdown validation failed");
		}
		*/
	  
  }
  
  @BeforeTest
  public void openurlt() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
