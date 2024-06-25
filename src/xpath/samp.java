package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class samp {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("standard_user");
	driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath(" //button[@name='login']")).click();
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(5000);


}	

}
