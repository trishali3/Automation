package iframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert2 {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	 Alert alt=driver.switchTo().alert();
	 alt.accept();
	 String test=alt.getText();
	 System.out.println(test);
	
}	

}
