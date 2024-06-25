package Test_ng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class Annotation_flow {
@Test
public void Tc() {
	Reporter.log("====Actual TC====",true);}
@BeforeClass
public void bc() {
	Reporter.log("====Launch the Browser====",true);
}
@AfterClass
public void ac() {
	Reporter.log("====close the Browser====",true);
}
@BeforeSuite
public void bs() {
	Reporter.log("====DB Connection====",true);

}
@AfterSuite
public void as() {
	Reporter.log("====DB disconnection====",true);
}
@BeforeMethod
public void bm() {
	Reporter.log("====open Application====",true);
}
@AfterMethod
public void am() {
	Reporter.log("====close Application====",true);
}
}
