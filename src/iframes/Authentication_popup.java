package iframes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentication_popup {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
}	

}
