package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HCTest1 {
	public WebDriver driver;
      @Test(dataProvider = "HCSignup",dataProviderClass = HCTest2.class )
  
  public void HobbyCenterSignIn(String email,String firstname, String lastname) {
    	  driver = new ChromeDriver();
    	  driver.get("http://123.252.129.5:8080/hob");
    	  WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
    	  WebElement FirstName = driver.findElement(By.xpath("//input[@name='name']"));
    	  WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
    	  
    	  Email.sendKeys(email);
    	  FirstName.sendKeys(firstname);
    	  LastName.sendKeys(lastname);
    	  
  }
}
