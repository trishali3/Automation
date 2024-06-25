package Assert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_notequals {
@Test
public void test() {
 Reporter.log("test running",true);
		String s1="Hello";
		String s2="bye";
		Assert.assertNotEquals(s1, s2);	
		Reporter.log("Hello, Good Evening",true);
	}

	}



