/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author itexps
 */
public class DriverUtils {
    
     public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "c:\\qa\\drivers\\chromedriver.exe");
        WebDriver driver=null;
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        driver=new ChromeDriver();
        return driver;
    }

    public static WebDriver getFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver", "c:\\qa\\drivers\\geckodriver.exe");
        WebDriver driver=null;
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        driver=new FirefoxDriver();
        return driver;
    }
    
      public static WebDriver getIEDriver(){
        System.setProperty("webdriver.ie.driver", "c:\\qa\\drivers\\iedriverserver.exe");
        WebDriver driver=null;
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        driver=new InternetExplorerDriver();
        return driver;
    }
/*

    public static WebDriver getChromeRemoteDriver(){
        WebDriver driver=null;
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        try {
            driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
        } catch (MalformedURLException ex) {
            //Logger.getLogger(GridTest.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        //baseUrl="http://newtours.demoaut.com";
        return driver;
    }

    public static WebDriver getFirefoxRemoteDriver(){
        WebDriver driver=null;
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        try {
            driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
        } catch (MalformedURLException ex) {
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        //baseUrl="http://newtours.demoaut.com";
        return driver;
    }
    public static WebDriver getIERemoteDriver(){
        WebDriver driver=null;
        DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
        try {
            driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
        } catch (MalformedURLException ex) {
            Logger.getLogger(LoginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        //baseUrl="http://newtours.demoaut.com";
        return driver;
    }  */
      
}
