package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/DELL/Downloads/demo.html");
		Thread.sleep(2000);
		WebElement multiselect = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multiselect);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		sel.selectByValue("for");
		Thread.sleep(1000);
//		sel.deselectByIndex(1);
//		Thread.sleep(1000);
//		sel.deselectByVisibleText("BMW");
//		Thread.sleep(2000);
//		sel.deselectByValue("for");
		
		
		sel.deselectAll();
		driver.close();

	}
}
