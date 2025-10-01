package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript {

	public static void main(String[] args)
	{
		//open the Browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into demo web 
		driver.get("https://demowebshop.tricentis.com/");	
		//close thr browser
		driver.close();
	}
}
