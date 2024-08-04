package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//I Test Listener interface which implements testNG listeners 
public class Listeners implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult results) 
	{
		System.out.println("I succesfully executed Listeners pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	//screen shot code
	//response if API is failed
	
	{
		System.out.println("I failed executed Listeners Passcode"+result.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
