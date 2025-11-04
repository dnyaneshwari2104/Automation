package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass_6_11_2 {

	public static void main(String[] args) throws InterruptedException
	 {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dnyaneshwari");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gaikwad");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//select[@id='day']/option[@value='21']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//select[@id='month']/option[@value='11']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//select[@id='year']/option[@value='2025']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//label[text()='Female']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Dnyanu@2104");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123");
	     Thread.sleep(1000);
	    
	     
	     driver.close();	 }
}
