package webdriver_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_3 {
public static void main(String[] args) throws Throwable  {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.Ajio.com");
	//robot class
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	
}	

}
