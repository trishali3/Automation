package Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_issue {
@Test
public void sample() {
	String s1="Hello";
	String s2="world";
	SoftAssert s=new SoftAssert();
	s.assertEquals(s1, s2);
	Reporter.log("Hi i am after failing 1st verificatiin",true);
	s.assertAll();
}

}
