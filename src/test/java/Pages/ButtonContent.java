package Pages;

import Utilities.ParameterDriver;
import Utilities.customMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonContent extends customMethods {

    public ButtonContent() {

        PageFactory.initElements(ParameterDriver.driver,this);
    }

    @FindBy(id = "login2")
    public WebElement loginButton1;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton2;

    @FindBy(xpath = "//a[text()='Welcome Group 4 Ozgur']")
    public WebElement successfullyLogin;

    @FindBy(xpath = "//a[text()='Phones']")
    public WebElement phonesButton;

    @FindBy(xpath = "//a[text()='Samsung galaxy s6']")
    public WebElement samsungS6;

    @FindBy(xpath = "//a[text()='Add to cart']")
    public WebElement addToCard;

    @FindBy(xpath = "//a[@id='cartur']")
    public WebElement cartButton;

    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement placeHolderButton;

    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okeyButton;
}
