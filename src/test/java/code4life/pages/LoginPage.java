package code4life.pages;

import code4life.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Date;

public class LoginPage {


    By userName = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    By productLabel = By.xpath("//span[text()='Products']");

    By loginErrorText = By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
    By usernameLabel = By.xpath("//h4[text()='Accepted usernames are:']");

    public void sendUsernameText(String userText) throws IOException {
        Driver.getDriver().findElement(userName).sendKeys(userText);
    }

    public void sendPasswordText(String pass) throws IOException {
        Driver.getDriver().findElement(password).sendKeys(pass);
    }

    public void clickLoginBtn () throws IOException {
        Driver.getDriver().findElement(loginBtn).click();
    }

    public String returnText() throws IOException {

      String txt =  Driver.getDriver().findElement(productLabel).getText();

      return txt;
    }

    public String returnLoginTextError() throws IOException {

      String loginError =    Driver.getDriver().findElement(loginErrorText).getText();

      return loginError;
    }

    public String returnUserNameLabel() throws IOException {


        String userName = Driver.getDriver().findElement(usernameLabel).getText();

        return userName;
    }

}
