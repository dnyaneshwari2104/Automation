package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass_4_10 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".email")).sendKeys("Gaikwad2104@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".password")).sendKeys("Dnaynu@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(1000);
		driver.close();
	}
}
