package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class AmazonSignOut extends BasePage {

    //*********Constructor*********
    public AmazonSignOut(WebDriver driver) {
        super(driver);
        
    }
    Actions action;

    public String getTitle() {
        // get the title of the page 
        return driver.getTitle();
    }
    //  String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
    // public void login(String uname, String pwd) {

    public void AmazonSignOut() throws InterruptedException {
         WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));
        //Actions action = new Actions(driver);
        action = new Actions(driver);
        action.moveToElement(element).build().perform();
        //Create a list 
          Thread.sleep(3600);
        driver.findElement(By.xpath("//span[contains(text(),'Sign Out') and @class='nav-text']")).click();
       
    }

}
