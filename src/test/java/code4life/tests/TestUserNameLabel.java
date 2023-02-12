package code4life.tests;

import code4life.pages.LoginPage;
import code4life.test_base.TestBase;
import code4life.utilities.ConfigurationReader;
import code4life.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestUserNameLabel extends TestBase {




    @Test
    public void verifyUserNameLabel() throws IOException {
        LoginPage login = new LoginPage();

        String actualUserNameText = "Accepted usernames are:";
        Assert.assertEquals(actualUserNameText, login.returnUserNameLabel());

    }
}
