package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Closes {
public static void main(String[] args)
		throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(5000);
	//driver.close();// it will close single window
	driver.quit();// it will close all window
}
}
