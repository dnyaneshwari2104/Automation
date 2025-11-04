package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifySelected {

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.navigate().to("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	     WebElement excellent = driver.findElement(By.id("pollanswers-1"));
	     
	     if(excellent.isSelected())
	     {
	    	 System.out.println("Excellent radio button is Selected and testcases fail");
	    	
	     }
	     else {
	    	 driver.close();
	    	 throw new Exception("Excellent radio button is not selected and testScript fail");
	     }
	     driver.close();
	}
}
