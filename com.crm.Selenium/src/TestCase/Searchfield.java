package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class Searchfield extends BaseClass {

	public static void main(String[] args) throws Exception
	{
		String passed_data ="Mobile";
		preConditions();
		login();
		
		WebElement field = driver.findElement(By.id("small-searchterms"));
		field.sendKeys("passed_data");
		String current_data = field.getAttribute("value");
		if(passed_data.equals(current_data))
		{
			System.out.println("testcase pass");
		}else {
			postCondition1();
			throw new Exception("Data is not found and TestCase fail");
		}
		logout();
		Thread.sleep(3000);
		postCondition2();
	}
}
