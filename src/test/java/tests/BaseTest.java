/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/**
 *
 * @author b
 */
public class BaseTest {
    public WebDriver driver;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "c:\\qa\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
      //  driver.manage().window().maximize();
    }
  //  @AfterClass
  // public void teardown() {
       // driver.quit();
   // }
    
}
