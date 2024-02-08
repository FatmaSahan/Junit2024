import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButton {
    WebDriver driver;
    @Before
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");
    }
    @Test
    public void radioButton(){
        /*
        Radio buttons

Select your favorite color:

 Blue
 Red*
 Yellow
 Black
 Green

Select your favorite sport:

 Basketball
 Football*
 Hockey
 Water Polo
         */
        //to color
        WebElement redOption=driver.findElement(By.id("red"));
        redOption.click();
        Assert.assertTrue(redOption.isSelected());
        //to activities
        WebElement footballOption=driver.findElement(By.id("football"));
        footballOption.click();
        Assert.assertTrue(footballOption.isSelected());

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
