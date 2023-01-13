package TestNGProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTest {
	public WebDriver driver;
  @Test
  public void pratiksha() {
	  System.out.println("hei i am pratiksha");
	  driver = new ChromeDriver();
	  driver.get("https:www.google.com/");
	  
  }
}
