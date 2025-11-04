package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException
	 {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	 	 Thread.sleep(1000);
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(1000);
	     // xpath by attribute
	     driver.findElement(By.xpath("//label[@for='pollanswers-1']")).click();
	     Thread.sleep(1000); 
	     // xpath by text function
	     WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
	     System.out.println(poll.getText());
	     Thread.sleep(1000); 
	     // xpath by Contain function
	     driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
	     Thread.sleep(1000);
	     
	     // xpath by 
	     
	     Thread.sleep(3000);
	     driver.close();
	 }

}
