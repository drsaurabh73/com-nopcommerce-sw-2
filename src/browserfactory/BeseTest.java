package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeseTest {

    public static WebDriver driver;

    public void openBrowser(String baseUrl) {


        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        //Launch the URl
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        // Implicit time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));




    }
    public  void closeBrowser () {
        driver.close();
    }


}
