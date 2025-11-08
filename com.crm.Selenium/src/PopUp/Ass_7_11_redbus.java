package PopUp;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_7_11_redbus {

	
	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/search/div/div/div/div[1]/div[1]/div/div/div/div[1]")).sendKeys("Pune");

	}
}
