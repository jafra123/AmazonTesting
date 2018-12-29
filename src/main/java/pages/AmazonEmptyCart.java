package pages;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.BasePage;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

public class AmazonEmptyCart extends BasePage {

    //*********Constructor*********
    public AmazonEmptyCart(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        // get the title of the page 
        return driver.getTitle();
    }
    //  String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
    // public void login(String uname, String pwd) {

    public void amazonTestDeleteCart() {

        driver.manage().window().maximize();
        //search box
        driver.findElement(By.cssSelector("span#nav-cart-count")).click();
//search box 
       // driver.findElement(By.name("submit.delete.Cc259ef11-cfea-46b9-a3fe-c411a1c5076b")).click();
        //
        Assert.assertEquals("Your Shopping Cart is empty.","Your Shopping Cart is empty.");
        
            driver.findElement(By.name("submit.delete.Cc259ef11-cfea-46b9-a3fe-c411a1c5076b")).click();
            System.out.println("Expected text is not obtained");
                      
        
            System.out.println("Expected text is not obtained");
        }
    }
        




    
