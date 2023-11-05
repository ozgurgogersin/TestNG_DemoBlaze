package TestCases;

import Pages.ButtonContent;
import Pages.TextContent;
import Utilities.ParameterDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_GoToCartAndPlaceOrder extends ParameterDriver {

    ButtonContent bc;
    TextContent tc;

    @Test(dataProvider = "formList",invocationCount = 2)
    public void clickOnCartAndPlaceOrder(String name, String country, String city, String creditCard, String month, String year) throws InterruptedException {

        bc = new ButtonContent();
        tc = new TextContent();

        bc.navigateBackToTheHomepage();

        bc.clickMethod(bc.cartButton);

        bc.clickMethod(bc.placeHolderButton);

        tc.sendKeysMethod(tc.firstName, name);

        tc.sendKeysMethod(tc.country, country);

        tc.sendKeysMethod(tc.city, city);

        tc.sendKeysMethod(tc.card, creditCard);

        tc.sendKeysMethod(tc.month, month);

        tc.sendKeysMethod(tc.year, year);

        bc.clickMethod(bc.purchaseButton);

        bc.clickMethod(bc.okeyButton);

    }

    @DataProvider
    public Object[][] formList() {
        Object[][] list = {
                {"Özgür", "Turkey", "Istanbul", "1231231231231", "08", "2028"},
                {"John", "USA", "New York", "333333333333333", "12", "2027"}
                // Add more test data sets here if needed
        };
        return list;
    }

}
