package TestCases;

import Pages.ButtonContent;
import Pages.TextContent;
import Utilities.ParameterDriver;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.rmi.UnexpectedException;


public class _01_Login extends ParameterDriver {
    ButtonContent bc;
    TextContent tc;

    @Test//(expectedExceptions = UnhandledAlertException.class)
    @Parameters({"username", "password"})
    void Login(String username, String password) throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        bc = new ButtonContent();
        tc = new TextContent();

        Thread.sleep(3000);
        bc.clickMethod(bc.loginButton1);
        tc.loginUserName.sendKeys(username);
        tc.loginPassword.sendKeys(password);
        bc.clickMethod(bc.loginButton2);

        bc.assertText(bc.successfullyLogin, "Welcome");


    }

}
