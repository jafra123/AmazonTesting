package tests;

/*9                                                                          
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Amazon;
import pages.AmazonAccountandLists;


//public class LoginTest extends BaseTest{
public class AmazonTest {

    private WebDriver driver;
    // private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    Amazon amazon;

    AmazonAccountandLists amazonAccountandLists;
  //  @Test(priority = 1)
    //public void testHomeButton() {
      //  amazon = new Amazon(driver);
      //  amazon.amazonTest();
       
  //  }         
   
    @Test(priority = 0)
    public void testsearchDropDownList() throws InterruptedException {
        amazon = new Amazon(driver);
        amazon.searchDropDownList();
       // amazon.AlexaSkills();
    //}

   // @Test(priority = 1)
   // public void testAmazonDevices() {
     //   amazon.AmazonDevices();

    
  
    
   }
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\b\\Desktop\\Download\\geckodriver-v0.19.1-win64\\geckodriver.exe"); 
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\b\\Desktop\\Download\\geckodriver.exe");
        /* System.setProperty("webdriver.chrome.driver", "c:\\qa\\drivers\\chromedriver.exe");
        driver = new ChromeDriver(); */
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arjan\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        // baseUrl = "http://experteducationtraining.com/enroll/";
           // below code DriverUtil class call;;               0999999 '
           
    }
@BeforeClass // i added these codes because i find ut tht way so that i can run all the tests
    public void setup() {
     //  driver = DriverUtils.getChromeDriver();
      driver = DriverUtils.getChromeRemoteDriver();
       //driver = DriverUtils.getFirefoxRemoteDriver();
     // driver = DriverUtils.getIERemoteDriver();
        driver.get("http://www.amazon.com");
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @AfterClass
    public void teardown() {
       //driver.quit();
    }
}
