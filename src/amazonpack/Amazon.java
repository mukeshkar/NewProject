package amazonpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;


public class Amazon {
	public WebDriver driver;
	
  @Test
  public void redmi() throws Exception {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 8");
	  driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[4]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
	  Thread.sleep(3000);
	  String ama = driver.getWindowHandle();
	  for(String red : driver.getWindowHandles()) {
		  driver.switchTo().window(red);
	  }
	  driver.findElement(By.id("add-to-cart-button")).click();
	  Thread.sleep(3000);
	  for(String checkout : driver.getWindowHandles()) {
		  driver.switchTo().window(checkout);
	  }
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")).click();
	  driver.findElement(By.id("ap_email")).sendKeys("8019183282");
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/input[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("ap_password")).sendKeys("Kmukesh@123");
	  driver.findElement(By.id("signInSubmit")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"address-book-entry-0\"]/div[2]/span/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input")).click();
	  Thread.sleep(5000);
	  driver.switchTo().window(ama);
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
