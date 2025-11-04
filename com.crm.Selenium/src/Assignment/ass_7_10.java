package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass_7_10 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		String expectedUrl = "https://demowebshop.tricentis.com/";
        String actualUrl = driver.getCurrentUrl();
        Thread.sleep(1000);
        
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url is Verified ");
        } else {
            System.out.println("Url is Mismatch ");
        }
        
        driver.findElement(By.className("ico-register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
	    driver.findElement(By.id("FirstName")).sendKeys("Dnyaneshwari");
	    Thread.sleep(1000);
	    driver.findElement(By.id("LastName")).sendKeys("Gaikwad");
	    Thread.sleep(1000);
	    driver.findElement(By.id("Email")).sendKeys("Dnyaneshwari@123.gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.name("Password")).sendKeys("Dnyanu123");
	    Thread.sleep(1000);
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("Dnyanu123");
	    Thread.sleep(1000);
	    driver.findElement(By.name("register-button")).click();
		
        Thread.sleep(1000);
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Email")).sendKeys("Dnyaneshwari@123.gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("Dnyanu123");
        Thread.sleep(1000); 
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
        Thread.sleep(2000);
	}
}
