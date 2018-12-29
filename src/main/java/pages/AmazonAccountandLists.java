package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
public class AmazonAccountandLists extends BasePage {
    Amazon amazon;
    Actions action;// = new Actions(driver);
    //*********Constructor*********
    public AmazonAccountandLists(WebDriver driver) {
        super(driver);
    }
    public String getTitle() {
        // get the title of the page 
        return driver.getTitle();
    }
    //  String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
    // public void login(String uname, String pwd) {
    
    public void AmazonAccountandLists() throws InterruptedException {
      
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));
        //Actions action = new Actions(driver);
        action = new Actions(driver);
        action.moveToElement(element).build().perform();
        //Create a list 
        driver.findElement(By.xpath("//span[contains(text(),'Create a List') and @class='nav-text']")).click();
        Thread.sleep(3600);
        // here pop window will open 
         driver.findElement(By.cssSelector("input#WLNEW_list_name")).click();
         driver.findElement(By.cssSelector("input#WLNEW_list_name")).clear();
        driver.findElement(By.cssSelector("input#WLNEW_list_name")).sendKeys("manmohan");
         Thread.sleep(3600);
         // driver.findElement(By.xpath("//div[contains(text(),'Your Lists') and @role='heading']")).click();
       // Thread.sleep(3600);
         // click submit button
        driver.findElement(By.xpath("//span[@class='a-button-text' and contains (text(),'Create List')]")).submit();
       // driver.findElement(By.xpath("//div[contains(text(),'Your Lists') and @role='heading']")).click();
       // Thread.sleep(3600);
        //driver.findElement(By.xpath("//a[contains(text(),'Your Idea Lists')]")).click();
        // sign in click
       // driver.findElement(By.cssSelector("a#a-autoid-0-announce")).click();
       
    }
}
                // explicit wait - to wait for the compose button to be click-able
      /*  WebDriverWait wait = new WebDriverWait(driver, 30);
// click on the compose button as soon as the "compose" button is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#ap_email")));
        // click on the compose button as soon as the "compose" button is visible
         driver.findElement(By.cssSelector("input#ap_email")).sendKeys("saini.man.us@gmail.com");;
       
       // WebDriverWait wait = new WebDriverWait(driver, 10);
      //  WebElement elementWait = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#ap_email")));
        //    input#ap_email on next window ap_email
        // elementWait.click();
        // elementWait.clear();

       // elementWait.sendKeys("saini.man.us@gmail.com");
        // driver.findElement(By.cssSelector("input#ap_email")).clear();
        //   driver.findElement(By.cssSelector("input#ap_email")).sendKeys("saini.man.us@gmail.com");
        //   --- input password here 
        driver.findElement(By.cssSelector("input#ap_password")).clear();
        driver.findElement(By.cssSelector("input#ap_password")).sendKeys("canada123");
        //   - signin button
        driver.findElement(By.cssSelector("input#signInSubmit")).submit();
        // Create a List
        driver.findElement(By.xpath("//a[contains(text(),'Create a List')]")).click();
        // click radio button 
        driver.findElement(By.xpath("//input[@id='WLNEW_list_type_IL' ]")).click();
        driver.findElement(By.cssSelector("textarea#create-name-il ")).clear();
        driver.findElement(By.cssSelector("textarea#create-name-il ")).sendKeys("this is my list ");
    } */ 
      /*
}
/* will start form here    
        driver.findElement(By.xpath("//a[contains(text(),'Your Friends')]")).click();
        
        driver.navigate().back();
   // }
 //public void AmazonAccountandCreateAListClick() {
       // AmazonAccountandLists.AmazonAccountandLists();
      // AmazonAccountandLists.this.AmazonAccountandLists();
    // public void accountList (){
      WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));
       action = new Actions(driver);
      action.moveToElement(element1).build().perform();
       driver.findElement(By.xpath("//span[contains(text(),'Find a List or Registry') and @class='nav-text']"));
       //span[contains(text(),'Find a List or Registry') and @class='nav-text']
       driver.navigate().back();
//}
     //public void findGifts (){
     WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));  
        action.moveToElement(element2).build().perform();
       driver.findElement(By.xpath("//span[contains(text(),'Find a Gift') and @class='nav-text']"));
       driver.navigate().back();
    // }
      //  public void yourAccount (){
        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));  
        action.moveToElement(element3).build().perform();
       driver.findElement(By.xpath("//span[contains(text(),'Your Account') and @class='nav-text']"));
       driver.navigate().back();
       // }
       // public void findAGift(){
WebElement element4 = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));  
        action.moveToElement(element4).build().perform();
       driver.findElement(By.xpath("//span[contains(text(),'Find a Gift') and @class='nav-text']"));
       driver.navigate().back();
       // }
      //  public void yourAccount1(){
       WebElement element5 = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']"));  
        action.moveToElement(element5).build().perform();
       driver.findElement(By.xpath("//span[contains(text(),'Your Account') and @class='nav-text']"));
       driver.navigate().back();
    }
}
/*
driver.findElement(By.xpath("//span[contains(text(),'Account & Lists') and @class='nav-line-2']")).click();
        //driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();
       //amazon.AmazonSignIn();
       driver.findElement(By.cssSelector("input#ap_email")).clear();
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("saini.man.us@gmail.com");
        //   --- input password here 
        driver.findElement(By.cssSelector("input#ap_password")).clear();
        driver.findElement(By.cssSelector("input#ap_password")).sendKeys("canada123");
        //   - signin button
        driver.findElement(By.cssSelector("input#signInSubmit")).submit();
    }
} */
