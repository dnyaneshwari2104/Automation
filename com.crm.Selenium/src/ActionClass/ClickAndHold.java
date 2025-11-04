package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	
	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.automationtesting.in/Static.html");
		  Thread.sleep(2000);
		  Actions act = new Actions(driver);
		  WebElement source = driver.findElement(By.id("angular"));
		  WebElement target = driver.findElement(By.id("droparea"));
		  act.clickAndHold(source).release(target).perform();
		  Thread.sleep(2000);																						
		  driver.close();
	}
}
