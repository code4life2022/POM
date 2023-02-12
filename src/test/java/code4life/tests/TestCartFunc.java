package code4life.tests;

import code4life.pages.LoginPage;
import code4life.pages.Products;
import code4life.test_base.TestBase;
import code4life.utilities.BrowserUtils;
import code4life.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCartFunc extends TestBase {

    @Test
    public void verifyCartFunctionality() throws IOException {
        LoginPage login = new LoginPage();
        Products products = new Products();
        login.sendUsernameText(ConfigurationReader.getProperties("user"));
        login.sendPasswordText(ConfigurationReader.getProperties("pass"));
        login.clickLoginBtn();
        products.clickBacPack();
        products.clickBike();
        products.clickShirt();
        products.clickCart();
        BrowserUtils.getScreenshot("cart view ");
        int actualSize = 3;
        Assert.assertEquals(actualSize, products.returnCartSize());

        System.out.println("Cart size  = "+products.returnCartSize());


    }
}
