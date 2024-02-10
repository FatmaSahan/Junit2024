import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Exam {
    // 1) Bir class oluşturun: YoutubeAssertions
    //2) https://www.youtube.com adresine gidin
    WebDriver driver;
    @Before
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void test01(){
        driver.get("https://www.youtube.com");



    }
    @After
    public void tearDown(){
        driver.quit();
    }

    //            3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
    //○ titleTest
    //○ imageTest
    //=> Sayfa başlığının “YouTube” oldugunu test edin
    //=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //            ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
}
