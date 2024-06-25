package Testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class GroupExe {
@Test(priority =1,groups = "smoke")
public void verifyURL() {
	Reporter.log("Hii i am url verification",true);
}
@Test(priority =2,groups = "smoke")
public void verifyLnk() {
	Reporter.log("Hii i am Link verification",true);
}
@Test(priority =3,groups = "functional")
public void verifylogin() {
	Reporter.log("Hii i am login verification",true);
}
@Test(priority =4,groups = "functional")
public void verifylogout() {
	Reporter.log("Hii i am logout verification",true);
	
}
}
