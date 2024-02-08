import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam {
    // 1) Bir class oluşturun: YoutubeAssertions
    //2) https://www.youtube.com adresine gidin
    WebDriver driver;
    @Before
    public void setUp(){
        driver=new ChromeDriver();

    }
    //            3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
    //○ titleTest
    //○ imageTest
    //=> Sayfa başlığının “YouTube” oldugunu test edin
    //=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //            ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
}
