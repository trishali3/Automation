package webdriver_methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Screenshot_individual {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	//typecasting
	TakesScreenshot ts=(TakesScreenshot)driver;
	 WebElement ele=driver.findElement(By.xpath("//img[@alt='Facebook']"));
	 File src= ele.getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\Reliance\\Desktop\\Screenshot\\.fb.jpg");
	 Files.copy(src, dest);
			 
	 
}
}
