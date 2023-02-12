package code4life.tests;

import code4life.pages.LoginPage;
import code4life.test_base.TestBase;
import code4life.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TesCredentialError extends TestBase {



    @Test
    public void verifyLoginErrorText() throws IOException {

        LoginPage l = new LoginPage();
        l.sendUsernameText("usjs");
        l.sendPasswordText("uhdhdjdhhd");
        l.clickLoginBtn();
        BrowserUtils.getScreenshot("Login Test");
        String actualLoginErrorText="Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualLoginErrorText, l.returnLoginTextError());
    }
}
