package driver;
import org.json.simple.JSONObject;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentTest;

import keywords.ApplicationKeywords;
import util.Xls_Reader;

public class DriverScript {
	ApplicationKeywords app;
	JSONObject testData;
	ITestContext context;
	
	public DriverScript() {
		              app=new ApplicationKeywords();
		
		
	}

	public void executeTest(Xls_Reader xls,String sheetName,String testName) {
		
		
		int rows=xls.getRowCount(sheetName);
		for(int rNum=2;rNum<=rows;rNum++) {
			String tcid=xls.getCellData(sheetName, "TCID", rNum);
			if(tcid.equalsIgnoreCase(testName)) {
			String keyword=xls.getCellData(sheetName, "Keyword", rNum);
			String object=xls.getCellData(sheetName, "Object", rNum);
			String dataKey=xls.getCellData(sheetName, "Data", rNum);
			String data=(String)testData.get(dataKey);
			System.out.println(tcid+"-"+keyword+"-"+object+"-"+dataKey+"- "+data);
			
			if(keyword.equals("click"))
				app.click(object);
			else if(keyword.equals("clear"))
				app.clear(object);
			else if(keyword.equals("type"))
				app.type(object, data);
			else if(keyword.equals("waitForPageToLoad"))
				app.waitForPageToLoad();
			else if(keyword.equals("wait"))
				app.Wait(5);
			else if(keyword.equals("selectByVisibleText"))
				app.selectByVisibleText(object, data);
			else if(keyword.equals("acceptAlert"))
				app.acceptAlert();
			else if(keyword.equals("Wait"))
				app.Wait(Integer.parseInt(data));
			else if(keyword.equals("pressEnterButton"))
				app.pressEnterButton(object);
			else if(keyword.equals("selectDateFromCalendar"))
				app.selectDateFromCalendar(data);
			
				
			
			
		}
		}	
	}
	
	public void setReport(ExtentTest test) {
		app.setReport(test);
	}

	public void defaultLogin() {
		app.openBrowser("chrome");
        app.defaultLogin();
		
	}

	public void quit() {
		if(app !=null)
			app.quit();
	}

	public void setTestData(JSONObject data) {
		testData=data;
		
	}

	public void log(String logMessage) {
		app.log(logMessage);
		
		
	}

	public void setTestContext(ITestContext context2) {
		this.context=context;
		app.setTestContext(context);
		
	}
}
