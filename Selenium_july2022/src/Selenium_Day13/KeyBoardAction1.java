package Selenium_Day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAction1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}

}
