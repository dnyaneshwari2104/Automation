import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
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
	    driver.findElement(By.name("Password")).sendKeys("123");
	    Thread.sleep(1000);
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("123");
	    Thread.sleep(1000);
	    driver.findElement(By.name("register-button")).click();
	    Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
}
