package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParameterDriver {
    public static WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void createParameteredDriver(String browserName) {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        if (driver == null) {
            if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();

            } else if (browserName.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();

            } else if (browserName.equalsIgnoreCase("chrome")) {
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");//// To solve the error with Chrome
                driver=new ChromeDriver(options);

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        }
    }

    @AfterTest
    public void quitDriver() throws InterruptedException {
       if (driver != null) {
           Thread.sleep(2000);
            driver.quit();
            driver = null;
        }

    }

    public static WebDriver getDriver() {
        return driver;
    }
}
