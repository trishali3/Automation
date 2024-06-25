package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Swaglabs {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[contains(@name,'user-name')]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	driver.findElement(By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")).click();
	Thread.sleep(3000);
     String expT="Swag Labs";
     String actT=driver.getTitle();
     if(expT.equals(actT))
     {
    	 System.out.println("User is navigated to Home page,Tc is pass");
     }
     else
     {
    	 System.out.println("TC is fail both are not matching");
     }
     
     
    
     
}	

}
