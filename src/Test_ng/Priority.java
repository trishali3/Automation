package Test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 2)
public void Tc1() {
	Reporter.log("Good Afternoon",true);	
}
@Test(priority = 3)
public void Tc2() {
	Reporter.log("Good Evening",true);	
}
@Test(priority = 1)
public void Tc3() {
	Reporter.log("Good Morning",true);	
}

}
