package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Maximize {
public static void main(String[] args)
		throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
	//maximize window
	Thread.sleep(5000);
	driver.manage().window().maximize();
}	

}
