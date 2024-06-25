package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ram");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("potheneni");
	Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9876543210");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Ram@10");
	Thread.sleep(5000);
	//xpath for day
	 WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	 Select s=new Select(day);
	 s.selectByVisibleText("10");
		Thread.sleep(5000);
    //xpath for month
	 WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	 Select s1=new Select(month);
	 s1.selectByVisibleText("Oct");
		Thread.sleep(5000);
		//xpath for year
		 WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select s2=new Select(year);
		 s2.selectByVisibleText("2003");
			Thread.sleep(5000);

	}

}
