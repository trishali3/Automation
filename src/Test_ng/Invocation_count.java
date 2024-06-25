package Test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count {
@Test(invocationCount = 5)
public void Tc() {
	Reporter.log("Hello",true);
}

}
