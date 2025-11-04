package TestCase;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class AddProduct extends BaseClass {

	public static void main(String[] args) throws Exception {
        preConditions();
        login();

        driver.findElement(By.linkText("Books")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
        Thread.sleep(2000);

        String cartQty = driver.findElement(By.className("");

        if (cartQty.equals("")) {
            System.out.println(" TestCase3 Passed");
        } else {
            postCondition1();
            throw new Exception("TestCase3 Failed");
        }

        logout();
        Thread.sleep(2000);
        postCondition2();
    }
}
