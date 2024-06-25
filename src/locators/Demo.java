package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    String expectedTitle="Swag Labs";
    String actTitle= driver.getTitle();
    System.out.println(actTitle);
    if (expectedTitle.equals(actTitle)) {
    	System.out.println("user is navigate to HP,TC is pass");
    }
    else
    {
    	System.out.println("TC is fail both are not matching");
    }
}


}
