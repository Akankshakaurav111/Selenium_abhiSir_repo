package extendReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TOLearn_ExtentReport {
@Test
public void createReport() {
	String time = LocalDateTime.now().toString().replace(":", "-");
	//step1: create object for extentReports
	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReport" +time+".html");
	
	//step 2: create object for ExtentReports
	ExtentReports extReport = new ExtentReports();
	
	//step 3: Attech ExtentReporter to ExtentReports
	extReport.attachReporter(spark);
	
	Object ext;
	//step 4:create ExtentTest object 
	ExtentTest test=extReport.createTest("createReport");
	
	//step 5: call log() and provide status and message
	test.log(Status.INFO,"Open browser and Navigate to url");
	test.log(Status.PASS,"Enter Valid credential");
	test.log(Status.PASS," Successfully create extent report");
	
	//step 6: call flush()
    extReport.flush();	
}
}
