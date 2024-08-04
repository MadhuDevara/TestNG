//ChatGPT provided code

package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
    
    @BeforeClass
    public void befoclas() {
        System.out.println("before executing any methods in the class");
    }

    // To use the certain parameters in certain test cases via XML
    // To pull certain value in test cases use parameters and printLn
    // Just add value to parameters to pull the data
    
    @Test
    @Parameters({"URL", "APIKey/username"})
    public void Weblogincarloan(String urlname, String key) {
        System.out.println("weblogincar");
        System.out.println(urlname);
        System.out.println(key);
    }
    
    @BeforeMethod
    public void beforeevery() {
        System.out.println("I will execute before every test method in day 3 class");
    }
    
    @AfterMethod
    public void afterevery() {
        System.out.println("I will execute after every test method in day 3 class");
    }
    
    @AfterClass
    public void aftecls() {
        System.out.println("After executing all methods in the class");
    }
    
    @Test(groups = {"smoke"})
    public void MobileLoginLoan() {
        // Appium
        System.out.println("MobileLoginCar");
    }
    
    @BeforeSuite
    public void Bfsuite() {
        System.out.println("I am no 1");
    }
    
    @Test(enabled = false)
    public void Mobilesigncarloan() {
        // Appium
        System.out.println("Mobile SIGNIN");
    }
    
    // If a flow has a bug I don't want to show by this method it will skip the test from execution
    
    @Test(dataProvider = "getData")
    public void Mobilesignoutcarloan(String username, String password) {
        // Appium
        System.out.println("Mobile SIGNOUT");
        System.out.println(username);
        System.out.println(password);
    }
    
    // It depends on mentioned method it will execute first 
    @Test(dependsOnMethods = {"MobileLoginLoan", "Mobilesignoutcarloan"})
    public void APIcarloan() {
        System.out.println("APILogincar");
    }
    
    // DataProvider is a method which gives data for your test cases to run.
    @DataProvider
    public Object[][] getData() {
        // 1st combination - userName, password - good credit history = row 
        // 2nd combination - userName, password - no credit history
        // 3rd combination - fraudulent credit history
        // 3 combinations 2 values
        // [0] stands for first row [0] index
        
        Object[][] data = new Object[3][2];
        
        // 1st set
        data[0][0] = "firstsetusername";
        data[0][1] = "firstpassword";
        // columns in the row are nothing but values for that particular combination (row)
        
        // 2nd set
        data[1][0] = "secondsetusername";
        data[1][1] = "secondpassword";
                
        // 3rd set
        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdpassword";
        
        return data;
    }
}






/*
 * // find syntax errors and correct the below java code package test; import
 * org.testng.annotations.AfterClass; import org.testng.annotations.Test; import
 * org.testng.annotations.BeforeClass; import org.testng.annotations.AfterClass;
 * import org.testng.annotations.Test; import
 * org.testng.annotations.BeforeClass; import org.testng.annotations.AfterClass;
 * import org.testng.annotations.AfterMethod; import
 * org.testng.annotations.BeforeClass; import
 * org.testng.annotations.BeforeMethod; import
 * org.testng.annotations.BeforeSuite; import
 * org.testng.annotations.DataProvider; import
 * org.testng.annotations.Parameters; import org.testng.annotations.Test;
 * 
 * public class day3 {
 * 
 * @BeforeClass public void befoclas() {
 * System.out.println("before executing any methods in the class"); }
 * 
 * //To use the certain parameters in certain test cases via XML //To pull
 * certain value in test cases use parameters and printLn //Just add value to
 * parameters to pull the data
 * 
 * 
 * @Test
 * 
 * @Parameters({"URL", "APIKey/username"}) public void Weblogincarloan(String
 * urlname, String key) { System.out.println("weblogincar");
 * System.out.println(urlname); System.out.println(key); }
 * 
 * 
 * @BeforeMethod public void beforeevery() {
 * System.out.println("I will execute before every test method in day 3 class");
 * }
 * 
 * @AfterMethod public void afterevery() {
 * System.out.println("I will execute after every test method in day 3 class");
 * }
 * 
 * @AfterClass public void aftecls() {
 * System.out.println("After executing all methods in the class"); }
 * 
 * @Test(groups= {"smoke"}) public void MobileLoginLoan() { //Appium
 * System.out.println("MobileLoginCar"); }
 * 
 * @BeforeSuite public void Bfsuite() { System.out.println("I am no 1"); }
 * 
 * @Test(enabled=false) public void Mobilesigncarloan() { //Appium
 * System.out.println("Mobile SIGIN"); }
 * 
 * //If a flow has a bug i don't want to show by this method it will skip the
 * test from execution
 * 
 * @Test(dataProvider="getData") public void Mobilesignoutcarloan(String
 * username,String password) { //Appium System.out.println("Mobile SIGNOUT");
 * System.out.println(username); System.out.println(password);
 * 
 * }
 * 
 * //It depends on mentioned method it will execute first
 * 
 * @Test(dependsOnMethods={"MobileLoginLoan","Mobilesignoutcarloan"}) public
 * void APIcarloan() { System.out.println("APILogincar"); }
 * 
 * // DataProvider is methods which gives data for your test cases to run.
 * 
 * @DataProvider public Object[][] getData() { //1st -combination-userName
 * password - good credit history = row //2nd -userName password-no credit
 * history //3rd -fradelent credit history //3 combinations 2 values //[0] stand
 * for first row[0]index
 * 
 * Object[][] data = new Object[3][2];
 * 
 * //1st set data[0][0]="firstsetusername"; data[0][1]="firstpassword";
 * //coloums in the row are nothing but values for that particular
 * combination(row)
 * 
 * //2nd Set data[1][0]="secondsetusername"; data[1][1]="secondpassword";
 * 
 * //3rd Set data[2][0]="thirdsetusername"; data[2][1]="thirdpassword"; return
 * data;
 * 
 * 
 * 
 * }
 * 
 * }
 */