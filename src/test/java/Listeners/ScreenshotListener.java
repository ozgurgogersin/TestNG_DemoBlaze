package Listeners;

import Pages.ButtonContent;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener  implements ITestListener{
    public void onTestFailure(ITestResult result) {
        Object currentClass = result.getInstance();
        if (currentClass instanceof ParameterDriver) {
            WebDriver driver = ((ParameterDriver) currentClass).getDriver();

            if (driver != null) {
                ButtonContent bc = new ButtonContent();
                bc.takeScreenShots(driver, result);
            }
        }
    }
}
