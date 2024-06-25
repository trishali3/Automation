package Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
@Test
public void Tc1() {
	Reporter.log("Tc1",true);
	Assert.fail();
}

}
