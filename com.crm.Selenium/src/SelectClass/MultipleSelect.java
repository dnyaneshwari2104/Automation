package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/DELL/Downloads/demo.html");
		Thread.sleep(2000);
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
        Select sel = new Select(singleSelect);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        
        if(sel.isMultiple())
        {
        	System.out.println(" it is mutiple select dropdown menu..");
        	sel.deselectByIndex(2);
       
        }
        else
        {
        	System.out.println("it is single dropdown menu..");
        	System.out.println(" deselect cant be paerformed");
        }
        Thread.sleep(1000);
        driver.close();
	}
}
