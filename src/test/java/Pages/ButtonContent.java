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

    @FindBy(xpath = "//a[@id='signin2']")
    public WebElement signUpButton1;

    @FindBy(xpath = "//button[text()='Sign up']")
    public WebElement signUpButton2;
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
    @FindBy(xpath = "//a[text()='Laptops']")
    public WebElement laptopsButton;
    @FindBy(xpath = "//a[text()='Sony vaio i5']")
    public WebElement sonyVaioI5;

    @FindBy(xpath = "//a[text()='Monitors']")
    public WebElement monitorButton;

    @FindBy(xpath = "//a[text()='Apple monitor 24']")
    public WebElement appleMonitor24;

    @FindBy(xpath = "//a[@id='cartur']")
    public WebElement cartButton;

    @FindBy(xpath = "(//td[text()='Apple monitor 24'])[1]/../td[4]//a[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//table[@class='table table-bordered table-hover table-striped']//td[2])[1]")
    public WebElement appleMonitor24isDisplayed;

    @FindBy(xpath = "//button[@id='next2']")
    public WebElement nextButton;
    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement placeHolderButton;

    @FindBy(xpath = "//button[text()='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okeyButton;
}
