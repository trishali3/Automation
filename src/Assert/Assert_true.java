package Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_true {
@Test
public void sample() {
	Reporter.log("running",true);
	boolean actr=true;
	Assert.assertTrue(actr);
}
}
