package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Swaglabs_usingxpath {
public static void main(String[] args) {
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	String expT="Swag Labs";
	String actT=driver.getTitle();
	System.out.println(actT);
	if(expT.equals(actT))
	{
		System.out.println("user is navigated to Home page,TC is pass");
	}
		else
		{
			System.out.println("TC is pass and both are not matching");
		}
   
	}	

}
