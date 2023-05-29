package library;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.CarwaleBaseFile;



public class Utility extends CarwaleBaseFile{
	
	static ExtentTestNGITestListener extent_test_listener;
	public static void CaptureScreenShot(String path) throws IOException {
		extent_test_listener = new ExtentTestNGITestListener();
		TakesScreenshot takescreenshot= (TakesScreenshot) driver;
		FileUtils.copyFile(takescreenshot.getScreenshotAs(OutputType.FILE), new File(path));
		//extent_test_listener.extentTest.log(Status.FAIL, extent_test_listener.extentTest.addScreenCaptureFromPath(path));
		//extent_test_listener.extentTest.log(Status.FAIL,extent_test_listener.extentTest.addScreenCaptureFromPath(path));
		//extent_test.log(LogStatus.FAIL, "Test Fail", extent_test.addScreenCapture(path));
//		extent_test_listener.extentTest.log(Status.FAIL,MarkupHelper.createLabel(path, ExtentColor.RED));
//		extent_test_listener.extentTest.log(Status.FAIL,MarkupHelper.createLabel(path, ExtentColor.RED));
//		extent_test_listener.extentTest.log(Status.FAIL,MarkupHelper.createLabel(path, ExtentColor.RED));
		
	
		
		
	}
	
}
