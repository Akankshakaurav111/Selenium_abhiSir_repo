package com.qsp.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerUtility extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();
		javaLib = new JavaUtility();
		String timeStamp = javaLib.getSystemTime();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshorts/" + methodName + timeStamp + ".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
