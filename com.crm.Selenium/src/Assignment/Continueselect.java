package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Continueselect {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")).click();
		Thread.sleep(2000);
		WebElement singleSelect = driver.findElement(By.id("products-orderby"));
		
		WebElement singleSelect1 = driver.findElement(By.id("products-pagesize"));
	
	//	WebElement singleSelect2 = driver.findElement(By.id("products-viewmode"));
		
         Select sel = new Select(singleSelect);
         int i=0;
         List<WebElement> Select = sel.getOptions();
         for(WebElement web : Select)
         {
        	WebElement sortby = driver.findElement(By.id("products-orderby"));
        	sel = new Select(sortby);
        	sel.selectByIndex(i++);
         	Thread.sleep(1000);     	
         }
       	   Thread.sleep(1000);
           driver.close();
	}
	
//	 Select sel = new Select(singleSelect1);
//     int i=0;
//     List<WebElement> Select = sel.getOptions();
//     for(WebElement web : Select)
//     {
//    	WebElement sortby = driver.findElement(By.id("products-orderby"));
//    	sel = new Select(sortby);
//    	sel.selectByIndex(i++);
//     	Thread.sleep(1000);     	
//     }
//   	   Thread.sleep(1000);
//       driver.close();
}

//		 
//}
