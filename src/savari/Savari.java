package savari;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Savari {
	public WebDriver driver;
	
  @Test
  public void trip() {
	  
	  // isDisplayed // isEnabled() // isSelected() //
	  
	  
	  boolean oneway = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]")).isDisplayed();
	  System.out.println(oneway);
	  
	  /*
	  WebElement roundtrip = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]"));
	  if (roundtrip.isDisplayed()) {
		  System.out.println("\n it is displayed");
	}else {
		System.out.println("\n not displayed");
	}*/
	 
	  
  }
  
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.savaari.com/");
	  //driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
