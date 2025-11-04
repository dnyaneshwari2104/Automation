package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass_13_10_2 {

	public static void main(String[] args) throws InterruptedException
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.navigate().to("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	     
	     //click on digital download
	     driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")).click();
	      Thread.sleep(2000);
	    // add to cart
	      List<WebElement> addButton = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	        for (WebElement button : addButton) 
	        {
	            button.click();           
	            Thread.sleep(1500);       
	        }
	        
	        // shopping cart
	        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	        Thread.sleep(2000);
	        // remove the shopping cart

	        //(//table[@class='cart']/tbody/tr/td[6]/span[2])[2]

	        driver.quit();
	}
}
//  