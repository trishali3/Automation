package webdriver_methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolldown_using_jse {
public static void main(String[] args) throws Throwable {
    WebDriver driver=new EdgeDriver();
    driver.get("https://www.meesho.com");
    //typecasting
    JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,2000)");
    Thread.sleep(8000);
    jse.executeScript("window.scrollBy(0,-1000)");
}	

}
