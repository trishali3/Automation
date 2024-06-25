package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Contains {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	

}	

}
