package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ass_6_11 {

	public static void main(String[] args) throws InterruptedException {
    
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demo.automationtesting.in/Alerts.html");
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
//        Thread.sleep(1000);
//        
//        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
//        Thread.sleep(1000);
//        
//        Alert alert1 = driver.switchTo().alert();
//        alert1.accept();
//       
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(1000);

        for (int i = 1; i <= 3; i++) {   
            if (i == 1) {
                driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
                Thread.sleep(1000);
                Alert alert = driver.switchTo().alert();
           
                alert.accept();
            }

            else if (i == 2) { 
                driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
                Thread.sleep(1000);

                Alert alert = driver.switchTo().alert();    
                alert.accept();
               
            }

            else if (i == 3) {
                driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
                Thread.sleep(1000);

                Alert alert = driver.switchTo().alert();
                alert.sendKeys("Dnyanshwari!");
                Thread.sleep(1000);
                alert.accept();    
            }

            Thread.sleep(1000);
        }    
        driver.close();
    }
}
