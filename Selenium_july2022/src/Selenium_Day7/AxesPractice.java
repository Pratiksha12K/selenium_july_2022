package Selenium_Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesPractice {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//preceding and following//
		driver.findElement(By.xpath("//input[@id='pass']//preceding::input[1]")).sendKeys("pratukada30@gmail.com");
		//index help//
		driver.findElement(By.xpath("//input[contains(@id,'email')]//following::input[1]")).sendKeys("pratu@123");
	           //or// otherwise Attribute help// 
		//driver.findElement(By.xpath("//input[contains(@id,'email')]//following::input[@id='pass']")).sendKeys("pratu@123");
	//	driver.findElement(By.xpath("//input[contains(@id,'email')]//following::button")).click();
		
	
		//ancestor//
		List< WebElement> ancestorsDiv =  driver.findElements(By.xpath("//a[text()='Sign Up']//ancestor::div"));
		System.out.println(ancestorsDiv.size());
		

		//preceding//
		List< WebElement> precedingDiv =  driver.findElements(By.xpath("//a[text()='Sign Up']//preceding::div"));
		System.out.println(precedingDiv.size());
		
		//descendant//
	//	driver.findElement(By.xpath("//div[@id='pageFooterChildren']//descendant::a[7] ")).click();
		
		//child//
	//	driver.findElement(By.xpath("//div[@id='pageFooterChildren']//child::li[3]")).click();
		
		//preceding-sibling//
		//driver.findElement(By.xpath("//a[text()='Facebook Lite']//parent::li//preceding-sibling::li[4]")).click();
		
		//following-sibling//
		driver.findElement(By.xpath("//a[text()='Facebook Lite']//parent::li//following-sibling::li[2] ")).click();
		
		
	}

}


//Ancestor= (Grandparent,parent)
//Ddescendant= //div[@id='pageFooterChildren']//descendant::a[2] (Grand,child)
//Self= //a[text()='Facebook Lite']//self::a


////span[contains(text(),'UPI Transactions ')]//following-sibling::div[@class='Bv11UC _1qNw3R']//span[@class='fGhUR2'] 