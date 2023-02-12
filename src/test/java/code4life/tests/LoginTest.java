package code4life.tests;

import code4life.pages.LoginPage;
import code4life.test_base.TestBase;
import code4life.utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {




    @Test
    public void testLoginFunc() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage();
        loginPage.sendUsernameText(ConfigurationReader.getProperties("user"));
        loginPage.sendPasswordText(ConfigurationReader.getProperties("pass"));
        loginPage.clickLoginBtn();

        Thread.sleep(2000);
        String actualText = "PRODUCTS";

        Assert.assertEquals(actualText, loginPage.returnText());


    }
}
