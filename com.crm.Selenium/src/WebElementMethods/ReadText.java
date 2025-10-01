package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement cart = driver.findElement(By.className("ico-cart"));
		System.out.println(cart.getText());
		Thread.sleep(1000);
		String book = driver.findElement(By.linkText("Book")).getText();
		System.out.println(book);
		Thread.sleep(1000);
		String text1 =driver.findElement(By.linkText("Community poll")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		driver.close();
		
	}

}
