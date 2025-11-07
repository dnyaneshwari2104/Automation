package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class MultipleChildPages extends BaseClass {

	public static void main(String[] args) throws InterruptedException
	{
		String expected_url="https://x.com/nopCommerce";
		preConditions();
		
		String parenthandle = driver.getWindowHandle();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		List<WebElement> ecommerce_links = driver.findElements(By.xpath("//a[@target='_blank']"));
		for(WebElement web : ecommerce_links)
		{
			web.click();
			Thread.sleep(1000);
		}
		
		Thread.sleep(1000);
		Set<String> childHandles = driver.getWindowHandles();
		System.out.println(childHandles);
		
		for(String str : childHandles)
		{
			driver.switchTo().window(str);
			String actual_url = driver.getCurrentUrl();
			if(expected_url.equals(actual_url))
			{
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/a/span")).click();
			}
			
		}
		
	}	
}
