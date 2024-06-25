package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {
public static void main(String[] args) 
throws Throwable {

	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(5000);//wait for 5 sec
	driver.navigate().to("https://www.google.com");
	Thread.sleep(5000);
	//go forward
	driver.navigate().forward();
	//refresh the page
	driver.navigate().refresh();

}	

}
