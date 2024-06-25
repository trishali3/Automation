package Testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisableTC_usingsuite {
@Test
public void TC1() {
	Reporter.log("Hello",true);

}
@Test
public void TC2() {
	Reporter.log("Hai",true);

}

}
