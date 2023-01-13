package TestNGProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day5_DependentTest {
	public WebDriver driver;
  @Test(dependsOnMethods = "openBrowser")
  public void SignIn() {
	  System.out.println("This will execute second (signIn)");
  }
  
  @Test
  public void openBrowser() {
	  driver = new ChromeDriver();
	  System.out.println("This will execute first (open Browser)");
  }
  @Test(dependsOnMethods = "Signin")
  public void viewACC() {
	  System.out.println("This will execute third (view Account) ");
  }
}
