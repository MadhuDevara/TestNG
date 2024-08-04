package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	
	  @Test public void WebLoginHomeLoan(String urlame) { //Selenium
	  System.out.println("WebLogincar"); System.out.println(urlame); }
	  
	  
	  @Test(groups= {"smoke"}) public void MobileLoginHomeLoan() { //Appium
	  System.out.println("MobileLoginHome"); }
	  
	  @Test public void LoginAPIHomeloan() { //Rest API automation
	  System.out.println("APIloginHome"); }
	 
	
	 // System.out.println("APIloginHome"); 
}
