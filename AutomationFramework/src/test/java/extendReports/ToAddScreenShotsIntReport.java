package extendReports;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToAddScreenShotsIntReport {
@Test

	public void addScreenShots()
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://demowebshop.tricentis.com/");
     TakesScreenshot   ts=(TakesScreenshot)driver;
     String screenshot = ts.getScreenshotAs(OutputType.BASE64);
     
     ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentScreenshotReport.html");
     ExtentReports extReport=new ExtentReports();
     extReport.attachReporter(spark);
    
     ExtentTest test= extReport.createTest("addScreenShots");
     test.log(Status.PASS," Adding Screenshot");
     test.addScreenCaptureFromBase64String(screenshot);
     extReport.flush();
     
     
     
     
     


}
}
