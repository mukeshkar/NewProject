package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TestNG {
	public WebDriver driver;
	
  @Test(priority = 1)
  public void login() throws Exception {
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(1000);
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  
	  /*
	   // DropDown Validation // 
	  driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/a")).click();
	  WebElement ide = new Select(driver.findElement(By.name("PAT_IDENTITY"))).getFirstSelectedOption();
	  //System.out.println(ide.getText());
	  if(ide.getText().equalsIgnoreCase("PAN Card")) {
		  System.out.println("Expected is equal to actual");
	  }else {
		  System.out.println("Expected is not equal to actual");
	  }
	  */
  
	  
	 /*
	  // Alerts //
	  driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(1000);
	  driver.findElement(By.name("password")).sendKeys("adm");
	  driver.findElement(By.name("submit")).click();
	  
	  String ale = driver.switchTo().alert().getText();   // getText() it prints the validation message //
	  System.out.println(ale);
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();      // accept() it accepts alert validation message //
	  //driver.switchTo().alert().dismiss();    // dismiss() it cancel alert validation message //
	 */
}
  
 
  @Test(priority = 2)
  public void registration() throws Exception {
	  
	  driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/a")).click();
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority = 3)
  public void PermanentRegistration() throws Exception {
	  
	  driver.findElement(By.linkText("Registration")).click();
	  
	  /*
	   // Information_Options //
	  List<WebElement> List = new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();  
	 // System.out.println(List.get(0).getText());
	  for (int i = 0; i < List.size(); i++) {
	      System.out.println(List.get(i).getText());
	  }
	  */
		
	  
	  
	  new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
	  new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
	  new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
	  driver.findElement(By.name("MOTHER_NAME")).sendKeys("kane");
	  driver.findElement(By.name("PNT_NAME")).sendKeys("rahul");
	  driver.findElement(By.name("LAST_NAME")).sendKeys("fine");
	  driver.findElement(By.name("DOB")).sendKeys("11-08-1923");
	  driver.findElement(By.name("AGE")).sendKeys("100");
	  new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
	  new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Married");
	  new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
	  new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
	  new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
	  driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("EK8555224D");
      new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
	  new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
	  new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
	  new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Self Employeed");
	  new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("O+");
	  new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
	  new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
	  //PermanentAddress
	  driver.findElement(By.name("ADDRESS1")).sendKeys("Hyderabad ");
	  driver.findElement(By.name("MOBILE_NO")).sendKeys("1234567890");
	  driver.findElement(By.name("EMAIL_ID")).sendKeys("mike@gmail.com");
	  new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
	  //CurrentAddress
	  driver.findElement(By.name("ADDRESS2")).sendKeys("Hyderabad");
	  driver.findElement(By.name("ZIP")).sendKeys("500090");
	  
	  
	  
	  /*
	  driver.findElement(By.name("image")).click();
	  Thread.sleep(3000);
	  Runtime.getRuntime().exec("E:\\HMSIMG.exe");
	  */
	  
	  
	  
	  
	  
	  /*
	  //ImageUplaod
	  Thread.sleep(3000);
	  WebElement img = driver.findElement(By.name("image"));
	  img.click();
	  Runtime.getRuntime().exec("E:\\imageupload.exe");
	  Thread.sleep(3000);
	  driver.close();
	  */
	  
	  //Save
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().dismiss();
	 
  }
	  
  
 
 /*
  @Test(priority = 4)
  public void feedback() throws Exception {
  
       // POP-UP'S //
  
	  driver.findElement(By.linkText("Feedback")).click();       
	  
	  String parent = driver.getWindowHandle();
	  for(String child : driver.getWindowHandles()) {
		  driver.switchTo().window(child);
	  }
	  Thread.sleep(3000);
	  driver.findElement(By.id("name")).sendKeys("Mukesh");
	  driver.findElement(By.id("email")).sendKeys("mukesh@gmail.com");
	  new Select(driver.findElement(By.id("car"))).selectByVisibleText("Volvo");
	  driver.findElement(By.name("radio")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("E:\\inscri.jpg");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("close")).click();
	  //driver.close();
	  
	  driver.switchTo().window(parent);
	  
	  driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/a")).click(); 
	  
  }*/
  
  /*
  // ValidationWithContains //
  @Test(priority = 2)
  public void validationWithContains() {
	  
	  driver.findElement(By.linkText("Registration")).click();
	  List<WebElement>values = new Select(driver.findElement(By.name("RELATION"))).getOptions();
	  if (values.get(4).getText().contains("Mother")) {
		System.out.println("yes");
	}else {
		System.out.println("No");
		}
	  
	  
  }
  */
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe\\");
	  driver = new FirefoxDriver();
	  driver.get("http://www.computechis.com/DemoSite/");
	  driver.manage().window().maximize();
	  
	  // To Capture Screenshot
	  File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String pick = "muk";
	FileHandler.copy(image, new File("E:\\SW Testing\\Reference\\"+pick+" .png"));
	
  }

  @AfterTest
  public void TerminateBrowser() {
	  //driver.quit();
  }

}
