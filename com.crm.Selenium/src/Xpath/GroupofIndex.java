package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupofIndex {

	public static void main(String[] args) throws InterruptedException
	 {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	     // xpath by Group of index
	     //Syntax  (xpath)[index] ...(//a[@id='value'])[3])
	     driver.findElement(By.xpath("(//input[@name='pollanswers-1'])[4]")).click();
	     Thread.sleep(3000);
	     driver.close();
	 }
}
