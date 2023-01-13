package TestNGProgram;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTest1.class)
public class Day8_DPTest1 {
	public WebDriver driver;
	  @Test(dataProvider = "FBLogin",dataProviderClass = Day8_DPTest2.class)
	  
	public void FaceBookLogin( String username , String password ) {
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  
		  UserName.sendKeys(username);
		  PassWord.sendKeys(password);
		  LoginBtn.click();
		  
}
	  private int i = 1;

		@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
		public void AccountTest() {
				if(i < 2)
					Assert.assertEquals(i , i);
			i++;
} 
		@Test  // Skip Test
		public void SkipTest() {
			throw new SkipException("Skipping The Test Method ");
		}
		
}

