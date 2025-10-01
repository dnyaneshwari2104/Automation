package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	//********************** Tagname locator**************************
//	public static void main(String[] args) throws InterruptedException
//	{
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		WebElement searchfield = driver.findElement(By.tagName("input"));
//		searchfield.sendKeys(" PlayStation 5");
//		Thread.sleep(3000);
//		driver.close();
//	}
	
	//********************** Classname locator **************************
//	public static void main(String[] args) throws InterruptedException
//	{
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(1000);
//		driver.findElement(By.className("ico-register")).click();
//		//searchfield.sendKeys(" PlayStation 5");
//		Thread.sleep(3000);
//		driver.close();
//	}

	
//	public static void main(String[] args) throws InterruptedException
//	{
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(1000);
//     	WebElement searchfield = driver.findElement(By.tagName("input"));
//		searchfield.sendKeys(" PlayStation 5");
//		Thread.sleep(1000);
//		driver.findElement(By.className("button-1 search-box-button")).click();
//		Thread.sleep(1000);
//		driver.close();
//	}
	
	//**********************nameLocator **************************
	
// public static void main(String[] args) throws InterruptedException
// {
//	 ChromeDriver driver = new ChromeDriver();
//	 driver.manage().window().maximize();
// 	 Thread.sleep(1000);
//     driver.get("https://demowebshop.tricentis.com/");
//     driver.findElement(By.name("q")).sendKeys("Mobile");
//	 Thread.sleep(3000);
//	 driver.close();
// }
	
 
//**********************id Locator **************************
 
// public static void main(String[] args) throws InterruptedException
// {
//	 ChromeDriver driver = new ChromeDriver();
//	 driver.manage().window().maximize();
// 	 Thread.sleep(1000);
//     driver.get("https://demowebshop.tricentis.com/");
//     
//     Thread.sleep(2000);
//     driver.findElement(By.className("ico-register")).click();
//     driver.findElement(By.id("gender-male")).click();
//	 Thread.sleep(3000);
//	 driver.close();
// }
 
 public static void main(String[] args) throws InterruptedException
 {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
 	 Thread.sleep(1000);
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     driver.findElement(By.id("u_0_0_8x")).click();
     Thread.sleep(2000);
     driver.findElement(By.className("large_form")).click();
	 Thread.sleep(3000);
	 driver.close();
 }

}
