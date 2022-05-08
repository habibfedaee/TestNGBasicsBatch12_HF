package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    WebDriver driver;
//go to syntax login
//    enter wrong crdentails
//    verify the message is "invalid Credentials

    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }

    @Test
    public void VerifyCredentials(){
        // SoftAssert will let us run the rest of the testcases or methods
        SoftAssert soft = new SoftAssert();

        String expectedText = "Invalid credentials";
        WebElement Username=driver.findElement(By.id("txtUsername"));
        boolean displayed = Username.isDisplayed();
        Username.sendKeys("123456");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
        //    first assertion compare the two strings
        soft.assertEquals(text, expectedText);

        WebElement username=driver.findElement(By.id("txtUsername"));
        //boolean displayed = username.isDisplayed();
        // assert if true or not
        System.out.println("hello world");
        soft.assertTrue(displayed);

        // check all assertions, if one fails then result failed
        soft.assertAll();
    }


    @AfterMethod
    public  void  CloseBrowser(){
        driver.quit();
    }
}
