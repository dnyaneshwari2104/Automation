package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("07/11/2025")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(1000);
		
		for (;;) {	
		try {
			driver.findElement(By.id("snd_3_08/07/2026")).click();
			break;
		} catch (Exception e) {
			driver.findElement(By.id("img2Nex")).click();
		}
		Thread.sleep(1000);
		}		
	}
}
