package Selenium_Day14;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		public class ScreenShotDemo
		{

		public static void main(String[] args) throws IOException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			TakesScreenshot ts = (TakesScreenshot)driver;
		    File srcfile =	ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(srcfile, new File("D:\\Selenium_july22\\site.jpeg"));

		}

	}



