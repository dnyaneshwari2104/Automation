package VerifyUrl;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUrl {
	
	public static void main(String []args)
	{
		String expected_url="https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		System.out.println("Current url"+actual_url);
		if(expected_url.equals(actual_url))
		{
			System.out.println("I am in my targed page");
			System.out.println(" ready to to actions");
		}else
		{
			System.out.println("I am not in my targed page");
			System.out.println("i am finding defect");
		}
		driver.close();
	}

}
