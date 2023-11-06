package TestCases;
import Pages.ButtonContent;
import Pages.TextContent;
import Utilities.ParameterDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_Login extends ParameterDriver {
    ButtonContent bc;
    TextContent tc;

    @Test
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
