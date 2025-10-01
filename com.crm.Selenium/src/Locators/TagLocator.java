package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagLocator {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchfield = driver.findElement(By.tagName("input"));
		searchfield.sendKeys(" PlayStation 5");		
		Thread.sleep(3000);
		driver.close();
	}

}
