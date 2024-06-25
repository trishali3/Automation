package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iframes3 {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	//switch main to particualr webpage
	driver.switchTo().frame("iframeResult");
	  Thread.sleep(2000);
	  WebElement fn=driver.findElement(By.xpath("//input[@id='fname']"));
	  Thread.sleep(2000);
	  fn.clear();
	  Thread.sleep(2000);
	  fn.sendKeys("Trishali");
	  Thread.sleep(2000);
	
}	

}
