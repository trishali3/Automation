package Test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test
public void Tc1() {
			Reporter.log("Good Afternoon",true);	
		}
@Test(enabled = false)
public void Tc2() {
			Reporter.log("Good Evening",true);	
		}
@Test
public void Tc3() {
			Reporter.log("Good Morning",true);	
		}

}
