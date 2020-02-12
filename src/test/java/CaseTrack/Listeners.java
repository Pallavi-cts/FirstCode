package CaseTrack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class Listeners implements ITestListener{
	Base b= new Base();
	
	  public void onStart(ITestContext iTestContext) {
	       
	    }
	 
	    public void onFinish(ITestContext iTestContext) {
	        
	    }
	 
	    public void onTestStart(ITestResult iTestResult) {
	        
	    }
	 
	    public void onTestSuccess(ITestResult iTestResult) {
	       
	    }
	 
	    public void onTestFailure(ITestResult result) {
	    	try {
				b.getScreenshot(result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	 
	    public void onTestSkipped(ITestResult iTestResult) {
	       
	    }
	 
	    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
	      
	    }
	}


