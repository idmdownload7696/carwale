package library;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentTestNGITestListener implements ITestListener {
	//Utility utility_obj;
	
    public static ExtentReports extentReports = new ExtentReports();
    //public static ExtentTest extentTest = new ExtentTest();
    public static ExtentSparkReporter extentSparkReporter;
    public static ExtentTest extentTest;
    

//    public void utility() {
//    	utility_obj = new Utility();
//		
//	}
//    
//    
    
    
    @Override
    public void onStart(ITestContext iTestContext) {
    	extentSparkReporter = new ExtentSparkReporter("D://workspace//Carwale//landingpage.html");
    	extentReports = new ExtentReports();
    	extentReports.attachReporter(extentSparkReporter);
    	
    	
    	
    	//Device Information//
    	extentReports.setSystemInfo("Machine Name ", "Noor Machine" );
    	extentReports.setSystemInfo("OS", "Windows 10" );
    	extentReports.setSystemInfo("Browser", "Chrome Version = 10.0.25" );
//    		reports.setSystemInfo("Machine Name ", "Noor Machine" );
//    		reports.setSystemInfo("Machine Name ", "Noor Machine" );
    		
    		// Some addons to make report more fancy
    		
    	extentSparkReporter.config().setDocumentTitle("Carwale");	
    	extentSparkReporter.config().setReportName("Carwale Landing Page");
    	extentSparkReporter.config().setTheme(Theme.DARK);
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        extentTest = extentReports.createTest(iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
    	System.out.println("Name of Test Method Successfully Executed = " + iTestResult.getName());
    	extentTest=extentReports.createTest(iTestResult.getName());
    	extentTest.log(Status.PASS, MarkupHelper.createLabel("Name of the PASS test case is = " + iTestResult.getName(), ExtentColor.GREEN));
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
    	System.out.println("Name of Test Method Skipped = " + iTestResult.getName());
    	extentTest=extentReports.createTest(iTestResult.getName());
    	extentTest.log(Status.SKIP, MarkupHelper.createLabel("Name of the Skipped test case is = " + iTestResult.getName(), ExtentColor.YELLOW));
    }
    @Override
    public void onTestFailure(ITestResult iTestResult) {
    	try {
			Utility.CaptureScreenShot("D:\\workspace\\Carwale\\" + iTestResult.getName() + ".png");
	    	
//	    	extentTest.log(Status.FAIL, MarkupHelper.createLabel("Name of the Failed test case is = " + iTestResult.getName(), ExtentColor.RED));
//	    	extentTest=extentReports.createTest(iTestResult.getName()).addScreenCaptureFromPath("D:\\workspace\\Carwale\\" + iTestResult.getName() + ".png");
	    	extentTest.log(Status.FAIL, iTestResult.getName()).addScreenCaptureFromPath("D:\\workspace\\Carwale\\" + iTestResult.getName() + ".png");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	//System.out.println("Name of Test Method Failed = " + iTestResult.getName());

//    	try {
//			Utility.CaptureScreenShot("D:\\workspace\\Carwale\\" + iTestResult.getName() + ".png");
//			extentReports.createTest("Failtest").addScreenCaptureFromPath("D:\\workspace\\Carwale\\" + iTestResult.getName() + ".png");
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        extentReports.flush();
    }
}