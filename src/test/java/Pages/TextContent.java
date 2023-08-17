package Pages;

import Utilities.ParameterDriver;
import Utilities.customMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TextContent extends customMethods {

    public TextContent() {
        PageFactory.initElements(ParameterDriver.driver,this);
    }


    @FindBy(xpath = "//input[@id='sign-username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='sign-password']")
    public WebElement password;
    @FindBy(id = "loginusername")
    public WebElement loginUserName;

    @FindBy(id = "loginpassword")
    public WebElement loginPassword;

    @FindBy(xpath = "//h3[text()='1550']")
    public WebElement expectedResult;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='card']")
    public WebElement card;

    @FindBy(xpath = "//input[@id='month']")
    public WebElement month;

    @FindBy(xpath = "//input[@id='year']")
    public WebElement year;

    @FindBy(xpath = "(//p[@class='lead text-muted '])[1]")
    public List<WebElement> text;

}
