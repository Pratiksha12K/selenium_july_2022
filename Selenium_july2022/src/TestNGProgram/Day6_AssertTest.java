package TestNGProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6_AssertTest {
	public WebDriver driver;
  @Test(priority = 1)
  public void openBrowser() {
	  driver = new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
  }
  @Test(priority = 2)
  public void checkTitle() {
	  String Expected_Title ="Utkarshaa Academy";
	  String Actual_Title =driver.getTitle();
	  Assert.assertEquals(Actual_Title, Expected_Title);
	  System.out.println("Test Pass");
  }
}
