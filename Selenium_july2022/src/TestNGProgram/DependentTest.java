package TestNGProgram;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DependentTest {
	
		public WebDriver driver;
		@Test(dependsOnMethods = "openBrowser")
		  public void SignIn() {
			  System.out.println("This will execute second (SignIn)");
		  }

		  @Test
		  public void openBrowser() {
			  driver = new ChromeDriver();
			  System.out.println("This will execute first (Open Browser)");
		  }
		  @Test(dependsOnMethods = "SignIn")
		  public void viewAcc()
		  	{
			  System.out.println("This will execute Third (View Account)");
			  }}


