package Selenium_Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramedemoPrac1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("Frame(2)");
	//	String FrameText = driver.findElement(By.cssSelector("h1#sampleHeading")).getText();
	//	System.out.println(FrameText);
		String FrameText = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(FrameText);
	}

}
