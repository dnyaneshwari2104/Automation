package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ASS_16_10_1 {
	public static void main(String[] args) throws InterruptedException
	{
		     ChromeDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     Thread.sleep(1000);
		     driver.get("https://www.facebook.com/");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dnyaneshwari");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gaikwad");
		     
		     WebElement singleSelect = driver.findElement(By.id("day"));
		     Select sel = new Select(singleSelect);
		     sel.selectByIndex(16);
		     
		     WebElement singleSelect2 = driver.findElement(By.id("month"));
		     Select sel1 = new Select(singleSelect2);
		     sel1.selectByIndex(9);
		     
		     WebElement singleSelect3 = driver.findElement(By.id("year"));
		     Select sel2 = new Select(singleSelect3);
		     sel2.selectByIndex(0);
		     
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//label[text()='Female']")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Dnyanu@2104");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123");
		     Thread.sleep(1000);
		     
		     driver.close();
}

}
