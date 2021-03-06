/* Reusable test to make copy 
 */
package tests;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AmazonSignIn;
import pages.AmazonSignOut;
import pages.GiftCards;
import pages.YearEndDeals;

public class GiftCardsTest {

    private WebDriver driver;
    // private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Test(priority =0)
    public void giftCardsTest () throws InterruptedException{
        GiftCards giftCards = new GiftCards(driver);
        giftCards.GiftCardsclick();
     
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
        // below code DriverUtil class call
        //driver = DriverUtils.getChromeDriver();
        //driver.get("http://newtours.demoaut.com/mercurywelcome.php");
    }

    @BeforeClass // i added these codes because i find ut tht way so that i can run all the tests
    public void setup() {
     //  driver = DriverUtils.getChromeDriver();
      driver = DriverUtils.getChromeRemoteDriver();
       //driver = DriverUtils.getFirefoxRemoteDriver();
     // driver = DriverUtils.getIERemoteDriver();
        driver.get("https://www.amazon.com");
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @AfterClass
    public void teardown() {
       // driver.quit();
    }
}
