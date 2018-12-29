/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TryPrime extends BasePage {

    //*********Constructor*********
    public TryPrime(WebDriver driver) {
        super(driver);

    }
    Actions action;

    public String getTitle() {
        // get the title of the page 
        return driver.getTitle();
    }
    //  String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
    // public void login(String uname, String pwd) {

    public void TryPrimeHoverOver() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Try Prime') and @class='nav-line-2']"));
        //Actions action = new Actions(driver);
        action = new Actions(driver);
        action.moveToElement(element).build().perform();
        //Create a list 
        driver.findElement(By.xpath("//span[contains(text(),'Try Prime') and @class='nav-line-2']")).click();
        Thread.sleep(3600);
        driver.findElement(By.xpath("//input[@value='Get started' and @aria-labelledby='prime-header-CTA-announce']")).submit();
        driver.findElement(By.cssSelector("a#prime-no-thanks")).click();

//Actions action = new Actions(driver);
        /*  action = new Actions(driver);
        action.moveToElement(element).build().perform();
        //Create a list 
        driver.findElement(By.xpath("//span[contains (text(),'Sign in') and @class ='nav-action-inner']")).click();
        //span[contains (text(),'Sign in') and @class ='nav-action-inner']
        //driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).click();
       // driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).click();
        driver.findElement(By.cssSelector("input#ap_email")).clear();
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("saini.man.us@gmail.com");
        driver.findElement(By.cssSelector("input#ap_password")).clear();
        driver.findElement(By.cssSelector("input#ap_password")).sendKeys("canada123");
        driver.findElement(By.cssSelector("input#signInSubmit")).submit();

       

            }
/*
    public void AmazonSignOut() {
         WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));
        //Actions action = new Actions(driver);
        action = new Actions(driver);
        action.moveToElement(element).build().perform();
        //Create a list 
        driver.findElement(By.xpath("//span[contains(text(),'Sign Out') and @class='nav-text']")).click();
       
    } */
    }
}
