package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iframeDemo {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	//switch from main webpage to particular webpage
	driver.switchTo().frame("iframeResult");
	  WebElement fn = driver.findElement(By.xpath("//input[@ id='fname']"));
	  fn.clear();
	  fn.sendKeys("Trishali");
}

}
