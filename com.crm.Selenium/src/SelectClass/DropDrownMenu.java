package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDrownMenu {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/DELL/Downloads/demo.html");
		Thread.sleep(2000);
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
        Select sel = new Select(singleSelect);
        sel.selectByIndex(2);
        Thread.sleep(1000);
        sel.selectByVisibleText("Ford");
        Thread.sleep(1000);
        sel.selectByValue("vol");
        driver.close();
		
	}

}
