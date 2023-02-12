package code4life.pages;

import code4life.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class Products {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);


    By backPack = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By shirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By cart = By.id("shopping_cart_container");
    By cartItems = By.xpath("//div[@class='cart_item']");

    public Products() throws IOException {


    }


    public void clickBacPack() throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable
                (Driver.getDriver().findElement(backPack))).click();
    }

    public void clickBike() throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable
                (Driver.getDriver().findElement(bikeLight))).click();
    }

    public void clickShirt() throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable
                (Driver.getDriver().findElement(shirt))).click();
    }

    public void clickCart() throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable
                (Driver.getDriver().findElement(cart))).click();
    }


    public int returnCartSize () throws IOException {
        List<WebElement> carList = Driver.getDriver().findElements(cartItems);

        int size = carList.size();

        return size;
    }

}
