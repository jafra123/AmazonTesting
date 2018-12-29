package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EN extends BasePage {

    //*********Constructor*********
    public EN(WebDriver driver) {
        super(driver);

    }
    Actions action;

    public String getTitle() {
        // get the title of the page 
        return driver.getTitle();
    }
    //  String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
    // public void login(String uname, String pwd) {

    public void ENandSPclick() throws InterruptedException {

//driver.findElements(By.linkText("Add"));
        WebElement element = driver.findElement(By.cssSelector("a#icp-nav-flyout"));
        //Actions action = new Actions(driver);
        action = new Actions(driver);
        action.moveToElement(element).build().perform();
        //Create a list 
        Thread.sleep(3600);
        driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//i[@class='icp-radio']")).click();
        Thread.sleep(3600);

        // select english again- in the html dom by lookinf i find out that i only need to click on nav-flyout-icp because other is  icp-radio icp-radio-active
        WebElement element1 = driver.findElement(By.cssSelector("a#icp-nav-flyout"));
        //Actions action = new Actions(driver);
        action = new Actions(driver);
        action.moveToElement(element1).build().perform();
        //Create a list 
        Thread.sleep(3600);
        driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//i[@class='icp-radio']")).click();

        /*
       //Start list here 
       List <WebElement> radios=driver.findElements(By.xpath("//div[@id='nav-flyout-icp']//i[@class='icp-radio']"));
       
      radios.get(2).click(); // this will click on the second radio button    
      // End of List program here 
         */
    }
}
