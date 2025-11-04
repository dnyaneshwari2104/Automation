package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass_6_11 {
	public static void main(String[] args) throws InterruptedException
	 {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.linkText("Digital downloads")).click();
	     Thread.sleep(1000);
	     WebElement album = driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));
	     System.out.println(album.getText()); 
	     Thread.sleep(1000);
	     WebElement music = driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
	     System.out.println(music.getText()); 
	     Thread.sleep(1000);
	     WebElement music1 = driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
	     System.out.println(music1.getText());
	     Thread.sleep(3000);
	     driver.close();
	 }

}
