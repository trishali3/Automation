package iframes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Childbrowser_popup {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(" mobiles phones under 30000");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//get title of main webpage
	 String mainwinT=driver.getTitle();
	 System.out.println(mainwinT);
	 driver.findElement(By.xpath("//div[text()='POCO F6 5G (Black, 256 GB)']")).click();
	 //syntax for window handling
  Set<String>allwin= driver.getWindowHandles();
  for(String win1:allwin) {
	  driver.switchTo().window(win1);
  }
  String titwin1 =driver.getTitle();
  System.out.println(titwin1);
	 
}

}
