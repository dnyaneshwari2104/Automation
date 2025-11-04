package VerifyUrl;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifytheTitle {

	public static void main(String []args) throws Exception
	{
		String expected_title="Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title = driver.getTitle();
		System.out.println("Title of my page : "+actual_title);
		if(expected_title.equals(actual_title))
		{
			System.out.println("I am in my targed page");
			System.out.println(" ready to to actions");
		}else
		{
			System.out.println("I am not in my targed page");
			driver.close();
			throw new Exception("InCorrectTitlePageException");
		}
		driver.close();
	}
}
