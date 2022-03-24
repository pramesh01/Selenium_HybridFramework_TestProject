package testcases.rediff;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import driver.DriverScript;
import testbase.BaseTest;
import util.Xls_Reader;

public class PortfolioManagement extends BaseTest {

	@Test
	public void createPortfolio(ITestContext context) {
		ds.log("creating the portfolio test case executed.");
		Xls_Reader xlsReader=new Xls_Reader(System.getProperty("user.dir")+"//src//test//resources//testcases//testcases.xlsx");
	    ds.executeTest(xlsReader, "TestCases", "createPortfolio");
		
		
		
	}
	
	@Test
	public void deletePortfolio(ITestContext context) {
		ds.log("deleting the portfolio from the drop down list.");
		Xls_Reader xlsReader=new Xls_Reader(System.getProperty("user.dir")+"//src//test//resources//testcases//testcases.xlsx");
	    ds.executeTest(xlsReader, "TestCases", "deletePortfolio");
      
	}
	
	@Test
	public void verifyPortfolio() {
        test.log(Status.INFO,"verifying the portfolio");		
		
	}
	@Test
	public void selectPortFolio() {
		
	}
}
