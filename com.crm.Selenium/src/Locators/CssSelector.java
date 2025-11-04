package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
//		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
		//                                 Syntax=[AN='AV']
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Jweller");
		driver.close();
		
	}
}