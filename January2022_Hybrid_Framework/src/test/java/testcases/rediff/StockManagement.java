package testcases.rediff;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testbase.BaseTest;
import util.Xls_Reader;

public class StockManagement extends BaseTest{

	@Test
	public void addFreshStock(ITestContext context) {
		 ds.log("Adding stock name into the portfolio name.");
		 Xls_Reader xlsReader=new Xls_Reader(System.getProperty("user.dir")+"//src//test//resources//testcases//testcases.xlsx");
	     ds.executeTest(xlsReader, "TestCases", "addFreshStock");
		
		
	}
	@Parameters({"action"})
	@Test
	public void modifyStock(String action,ITestContext context) {
	
		
	  }
	
	@Test
	public void verifyStockInList(ITestContext context) {
		
	    }
	
	
	@Test
	public void deleteStock() {
	    
   		
	      }
       }
