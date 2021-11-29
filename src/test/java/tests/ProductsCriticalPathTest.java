package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsCriticalPathTest extends BaseTest{

    @Test
    public void productShouldAddedIntoCart(){
        loginPage.openLoginPage();
        loginPage.login("standard_user", "secret_sauce");

        inventoryPage.addToCart("Sauce Labs Onesie","add-to-cart-sauce-labs-onesie");
        inventoryPage.removeFromCart("Sauce Labs Onesie","remove-sauce-labs-onesie");
//        Assert.assertEquals();
//        cartPage.
    }
}
