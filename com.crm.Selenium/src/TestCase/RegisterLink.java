package TestCase;

import org.openqa.selenium.By;


import UtilityClass.BaseClass;

public class RegisterLink extends BaseClass {

	public static void main(String[] args) throws Exception {
      
		preConditions();
        login();

        driver.findElement(By.linkText("Books")).click();
        Thread.sleep(2000);

        String pageTitle = driver.getTitle();

        if (pageTitle.contains("Books")) {
            System.out.println(" TestCase2 Passed");
        } else {
            postCondition1();
            throw new Exception(" TestCase2 Failed");
        }

        logout();
        Thread.sleep(2000);
        postCondition2();
    }
}
