
package test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest(enabled=false)
	public void lastexecution()
	{
		System.out.println("i will excute last");
	}
	
	//Running a test method multiple time by using invocationCount parameter
	//Thread pool size is subprocess where it run program in another stream line.
	@Test(threadPoolSize=3, invocationCount=2)
	public void TestMethodsMultipleTimes()	
	{
		System.out.println("Test method multiple times");	
		//AssertJUnit.assertTrue(false);
	}
		
	//@Ignore
	@Test(enabled=false)
	public void Demo()	
	{
		System.out.println("hello");	
		//AssertJUnit.assertTrue(false);
	}
	
	@Test(enabled=false)//(priority=2)
	//@AfterSuite
	public void afsuite()
	{
		System.out.println("I am the no 1 from last");
	}
	
	@Test(enabled=false)//(priority=0)
	public void SecondTest()
	{
		System.out.println("bye");
	}
	

}
