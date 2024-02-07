import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day1 {
    public static void main(String[] args) {
        //ilk proje actigimizda depenciesleri pom a atmamiz yeterli.asagidaki kodu
        // kullanmazsak eger jarlari ve drivere gerek yok
       // WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        driver.get("https://buckheadengland.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}

