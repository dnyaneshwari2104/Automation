package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.automationtesting.in/Static.html");
		  Actions act = new Actions(driver);
		  WebElement source = driver.findElement(By.id("angular"));
		  WebElement target = driver.findElement(By.id("droparea"));
		  
		 // act.scrollByAmount(0, 500).perform();
		  act.scrollToElement(target).perform();
		  Thread.sleep(2000);
		  
		  act.clickAndHold(source).release(target).perform();
		  Thread.sleep(2000);
		  driver.close();
		  
	}
	
}	
