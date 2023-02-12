package code4life.test_base;

import code4life.utilities.BrowserUtils;
import code4life.utilities.ConfigurationReader;
import code4life.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class TestBase {

    @BeforeMethod
    public void setup() throws IOException {



        String url = ConfigurationReader.getProperties("site");
        Driver.getDriver().manage().window();
        Driver.getDriver().get(url);
    }

    @AfterMethod
    public void teardown() throws IOException {
        //BrowserUtils.waitHour(2);
        Driver.closeDriver();

    }
}
