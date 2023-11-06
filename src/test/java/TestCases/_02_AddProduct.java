package TestCases;
import Pages.ButtonContent;
import Utilities.ParameterDriver;
import org.testng.annotations.Test;

public class _02_AddProduct extends ParameterDriver {
    ButtonContent bc;
    @Test
    public void addSamsungPhone(){
        bc=new ButtonContent();
        bc.clickMethod(bc.phonesButton);
        bc.clickMethod(bc.samsungS6);
        bc.clickMethod(bc.addToCard);
        bc.assertSuccessMessage();

    }
}
