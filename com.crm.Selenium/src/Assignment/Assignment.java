package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	
	public static void main(String[] args) throws InterruptedException {
	    ChromeDriver driver = new ChromeDriver();
	    Thread.sleep(1000);
	    driver.manage().window().maximize();	
	    Thread.sleep(1000);
	    driver.get("https://demowebshop.tricentis.com/");

	    driver.findElement(By.className("ico-register")).click();
	    Thread.sleep(1000);

	    driver.findElement(By.className("ico-login")).click();
	    Thread.sleep(1000);
	  
	    driver.findElement(By.className("ico-cart")).click();
	    Thread.sleep(1000);

	
	    driver.findElement(By.className("ico-wishlist")).click();
	    Thread.sleep(3000);

	    driver.close();
	}

}
