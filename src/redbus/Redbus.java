package redbus;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Redbus {
	public WebDriver driver;
	
  @Test
  public void login() throws Exception {
	  /*
	  driver.findElement(By.id("signin-block")).click();
	  driver.findElement(By.id("signInLink")).click();
	  String win = driver.getWindowHandle();
	  for(String win2 : driver.getWindowHandles()) {
		  driver.switchTo().window(win2);
	  }
	  //Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/div[3]/input")).sendKeys("9874561236");
	  //Thread.sleep(3000);
	  driver.switchTo().window(win);
	  */
	  
	  
	  String str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);
	  
	  String str2 = driver.findElement(By.name("btnK")).getAttribute("value");
	  System.out.println(str2);
	  
	  String str3 = driver.findElement(By.id("hplogo")).getAttribute("title");
	  System.out.println(str3);
	  
  }
  
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe\\");
	  driver = new FirefoxDriver();
	  //driver.get("https://www.redbus.in/");
	  driver.get("http://google.com");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
