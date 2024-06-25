package iframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpopup {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	 Alert alt=driver.switchTo().alert();
	alt.accept();
	String text=alt.getText();
	System.out.println(text);
	Thread.sleep(2000);
	}

}
