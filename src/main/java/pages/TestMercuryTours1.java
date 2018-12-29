//
//
//
//  THESE BELOW CODES I COPY FROMNTHE IDE USING THE FIRFOX IDE TO GENERATE THE CODES TO CHECK IT WORK OR NOT WITH cHROME DRIVER



package pages;
//package com.example.tests;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class TestMercuryTours1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
     // C:\QA\Drivers\chromedriver_win32
      //C:\QA\Drivers\geckodriver-master\geckodriver-master\\geckodriver.exe);
      //System.setProperty("webdriver.gecko.driver", "C:\\Users\\b\\Desktop\\Download\\geckodriver-v0.19.1-win64\\geckodriver.exe");
    //  System.setProperty("webdriver.gecko.driver", "C:\\QA\\Drivers\\geckodriver-master\\geckodriver-master\\geckodriver.exe");
     System.setProperty("webdriver.chrome.driver", "C:\\qa\\drivers\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://newtours.demoaut.com/mercurywelcome.php";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  
  @Test
  public void testHomwepage(){
      driver.get(baseUrl);
     List<WebElement> links= driver.findElements(By.tagName("a"));
      int size = links.size();
     for( int i=0; i<=size;i++) {
             WebElement e = links.get(i);
             String href = e.getAttribute("href");
             System.out.println(href);
             driver.get(href);
              
 // }
 
 /* 
  
  @Test
  public void TestMercuryTours1() throws Exception {
    driver.get(baseUrl); //+ "/mercurywelcome.php");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("mercury");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("mercury");
    driver.findElement(By.name("login")).click();
    
  // driver.findElement(By.name("//input[@name='tripType'])[2]")).click();
	

    driver.findElement(By.name("tripType")).click();
  //   driver.findElement(By.name("passCount")).selectByVisibleText("2");
     
     Select dropdown = new Select(driver.findElement(By.name("passCount")));
     dropdown.selectByVisibleText("2");
    
    //new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("2");
    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Frankfurt");
    new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("November");
    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Sydney");
    new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("December");
    driver.findElement(By.name("servClass")).click();
    driver.findElement(By.name("findFlights")).click();
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    driver.findElement(By.name("reserveFlights")).click();
    driver.findElement(By.name("passFirst0")).clear();
    driver.findElement(By.name("passFirst0")).sendKeys("manmohan");
    driver.findElement(By.name("passLast0")).clear();
    driver.findElement(By.name("passLast0")).sendKeys("singh");
    driver.findElement(By.name("passFirst1")).clear();
    driver.findElement(By.name("passFirst1")).sendKeys("divender");
    driver.findElement(By.name("passLast1")).clear();
    driver.findElement(By.name("passLast1")).sendKeys("singh");
    new Select(driver.findElement(By.name("pass.1.meal"))).selectByVisibleText("Bland");
    driver.findElement(By.name("creditnumber")).clear();
    driver.findElement(By.name("creditnumber")).sendKeys("2323232323423");
    driver.findElement(By.name("buyFlights")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
    
    */
  }
  }
}




