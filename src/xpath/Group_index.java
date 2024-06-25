package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Group_index {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("standard_user");	
	driver.findElement(By.xpath("(//input)[2]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("(//input)[3]")).click();
	Thread.sleep(5000);

	

	
}
}
