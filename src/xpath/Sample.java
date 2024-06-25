package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("college bags");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//img[@class='_53J4C-']")).click();
    Thread.sleep(2000);

}
}
