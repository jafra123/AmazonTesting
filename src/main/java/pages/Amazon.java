package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class Amazon extends BasePage {

    //*********Constructor*********
    public Amazon(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        // get the title of the page 
        return driver.getTitle();
    }
    //  String baseURL = "http://newtours.demoaut.com/mercurywelcome.php";
    // public void login(String uname, String pwd) {

    public void searchDropDownList() throws InterruptedException {
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("All Departments");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hello");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();

   // }

  //  public void AlexaSkills() {
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Alexa Skills");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();
    //}

   // public void AmazonDevices() {
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Amazon Devices");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();

        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Amazon Warehouse");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Appliances");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Apps & Games");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();
       /* new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Arts, Crafts & Sewing");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit();
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Cell Phones & Accessories");
        driver.findElement(By.xpath("//input[@class='nav-input'][@type='submit']")).submit(); */
           

    }

    public void amazonTest() {

        driver.manage().window().maximize();
        new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("All Departments");
        driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]")).clear();
        //search box
        driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]")).sendKeys("Learning Selenium Testing Tools with Python");
//search box 
        driver.findElement(By.cssSelector("input[class=nav-input][type=submit]")).submit();
        //
// nxt page clic on the "Learning Selenium Testing Tools with Python"
//h2[class='a-size-medium s-inline  s-access-title  a-text-normal'][data-attribute='Learning Selenium Testing Tools with Python']
        driver.findElement(By.cssSelector("h2[class='a-size-medium s-inline  s-access-title  a-text-normal'][data-attribute='Learning Selenium Testing Tools with Python']")).click();
//driver.findElement(By.cssSelector("h2[class='a-size-medium s-inline  s-access-title  a-text-normal'][data-attribute='Learning Selenium IDE Automation Testing Tool")).click();
//    - select paperback        
        driver.findElement(By.cssSelector("a#a-autoid-7-announce")).click();
        //select#quantity
        // driver.findElement(By.cssSelector("select#quantity"))
        new Select(driver.findElement(By.cssSelector("select#quantity"))).selectByVisibleText("2");
        driver.findElement(By.cssSelector("input#add-to-cart-button")).click();

        driver.findElement(By.cssSelector("a#hlb-view-cart-announce")).click();
        //    - proceed to checkout 

        driver.findElement(By.cssSelector("input[name='proceedToCheckout']")).click();

    
        //    input#ap_email
        driver.findElement(By.cssSelector("input#ap_email")).clear();
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("saini.man.us@gmail.com");
        //   --- input password here 
        driver.findElement(By.cssSelector("input#ap_password")).clear();
        driver.findElement(By.cssSelector("input#ap_password")).sendKeys("canada123");
        //   - signin button
        driver.findElement(By.cssSelector("input#signInSubmit")).submit();
    
      /*  //Shipping']
        driver.findElement(By.cssSelector("input[title='Shipping']")).click();
//Place your order']
        driver.findElement(By.cssSelector("input[title='Place your order']")).click();
*/
    }
}
