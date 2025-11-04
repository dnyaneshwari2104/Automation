package UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {

	public static WebDriver driver=null;
	public static void diffrentEnvrronment()
	{
		String browser = "internetexplorer";
		if(browser.equals("chrome"))
		{
			ChromeDriver driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
			EdgeDriver driver= new EdgeDriver();
		}else if(browser.equals("firefox")) {
			FirefoxDriver driver= new FirefoxDriver();
		}else if(browser.equals("safari")) {
			SafariDriver driver= new SafariDriver();
		}else if(browser.equals("internetexplorer")) {
			InternetExplorerDriver driver= new InternetExplorerDriver();
		}
	}
	
	public static void main(String[] args)
	{
		diffrentEnvrronment();
	}
}
