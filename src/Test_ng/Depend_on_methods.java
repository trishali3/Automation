package Test_ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depend_on_methods {
@Test
public void login() {
	Reporter.log("login successful",true);
	//intentionally login fail
	Assert.fail();
}
@Test(dependsOnMethods ="login()")
public void logout() {
	Reporter.log("logout successful",true);
}
}
