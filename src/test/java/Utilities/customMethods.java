package Utilities;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class customMethods  {

    public WebDriverWait wait = new WebDriverWait(ParameterDriver.driver, Duration.ofSeconds(30));

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


    public void waitUntilAlertIsPresent() {
        wait.until(ExpectedConditions.alertIsPresent());
    }


    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) ParameterDriver.driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickMethod(WebElement element) {
        waitUntilVisible(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text) {
        waitUntilVisible(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void assertText(WebElement element, String text) {
        waitUntilClickable(element);
        Assert.assertTrue(element.getText().contains(text));
    }
    public void navigateBackToTheHomepage() {
        ParameterDriver.getDriver().navigate().to("https://www.demoblaze.com/index.html");
    }

    public void assertSuccessMessage() {
        waitUntilAlertIsPresent();
        ParameterDriver.driver.switchTo().alert().accept();
    }


    public void takeScreenShots(WebDriver driver, ITestResult testResult) {
        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
        File screenShotsFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

        String testName = testResult.getMethod().getMethodName();
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        String destinationPath = "src/test/java/ScreenShots/" + testName + "_" + timestamp + ".png";

        try {
            FileHandler.copy(screenShotsFile, new File(destinationPath));
            System.out.println("Screenshot saved: " + destinationPath);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
