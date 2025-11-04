package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		for (int i = 1; i <= 24; i++) {
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(100);
		}
		
		act.keyDown(Keys.TAB).keyDown(Keys.RIGHT).keyDown(Keys.SPACE).keyUp(Keys.SPACE).perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Dnyanu").perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Gaikwad").perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Dnyanu@gmail.com").perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Dnyanu@04").perform();
		Thread.sleep(500);
		act.keyDown(Keys.TAB).sendKeys("Dnyanu@04").perform();
		Thread.sleep(2000);
		
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
