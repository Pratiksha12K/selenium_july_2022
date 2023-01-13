package TestNGProgram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Day8_DPTest {
	public WebDriver driver;
  @Test(dataProvider = "FBLogin")
  public void FaceBookLogin(String username , String password ) {
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  
	  UserName.sendKeys(username);
	  PassWord.sendKeys(password);
	  LoginBtn.click();
	  
	  
  }

  @DataProvider
  public Object[][] FBLogin() {
    return new Object[][] {
      new Object[] { "kadampratu30@gmail.com", "123456" },
      new Object[] { "pratikshakadam1203@gmail.com", "pratu123" },
      new Object[] { "kadampratu40@gmail.com", "123458" },
      new Object[] { "pratikshakadam1998@gmail.com", "pratu1234" },
      new Object[] { "kadampratu35@gmail.com", "1234556" },
      new Object[] { "pratikshakadam1997@gmail.com", "pratu1235" },
      new Object[] { "kadampratu40@gmail.com", "1234567" },
      new Object[] { "pratikshakadam1212@gmail.com", "pratu1234" },
      
    };
  }
}
