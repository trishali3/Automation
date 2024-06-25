package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Keyss {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
}	

}
