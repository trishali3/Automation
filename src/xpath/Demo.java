package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.instagram.com");
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("charitha_ramisetti");
	driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("setti 1234");
	driver.findElement(By.xpath("//button[@type='submit']")).click();


}	

}
