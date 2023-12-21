package qa.Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



import qa.TestBase.TestBase;



public class TestNGListeners extends TestBase implements ITestListener {

	
	

	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started: "+result.getName());
		
		 
		
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed: "+result.getName());
		
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed: "+result.getName());
		
		
		ScreenShot.screenShot(result.getName()+System.currentTimeMillis());
		System.out.println("ScreenShot Capture ");

	
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped: "+result.getName());
		
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test tag started : "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag finished : "+context.getName());
		
		
		
	}
	
	
	
	
	

}
