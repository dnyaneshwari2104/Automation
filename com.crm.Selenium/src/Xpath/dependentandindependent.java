package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependentandindependent {

	public static void main(String[] args) throws InterruptedException
	 {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	     WebElement laptop14 = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../../div[3]/div/span"));
	     System.out.println(laptop14.getText());  
	     Thread.sleep(3000);
	     driver.close();
	 }
}
