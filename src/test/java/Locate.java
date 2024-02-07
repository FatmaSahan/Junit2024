import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locate {
    WebDriver driver;


    @Before
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();


    }
    @Test
    public void test(){
        driver.get("https://en.wikipedia.org › wiki");

    }
    /*
    @Test
    public void dynamicXpath(){
        WebElement usernameInput=driver.findElement(By.cssSelector("//input[@class='oxd-input oxd-input--active'][1]"));
        WebElement passwordInput= driver.findElement(By.cssSelector("//input[@class='oxd-input oxd-input--active'][2]"));
        WebElement loginButton=driver.findElement(By.cssSelector("//button[@type='submit']"));

        usernameInput.sendKeys("Admin");
        passwordInput.sendKeys("admin123");
        loginButton.click();



    }
   /*
   @Test
    public void assertion(){
        Assert.assertTrue((image.isDisplayed()));
         WebElement image=driver.findElement(By.cssSelector("//span[@class='oxd-userdropdown-tab']"));

    */



    }













