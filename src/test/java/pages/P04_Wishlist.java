package pages;
import org.openqa.selenium.By;

import static testSteps.testBase.driver;

public class P04_Wishlist {
    By wishListIcon = By.className("towishlist");
    By item = By.className("product-item-link");
    By EmailAddress = By.id("email");
    By Password = By.id("pass");
    By signInButton = By.id("send2");

    public void CheckWishList() {
        driver.findElement(item).click();
        driver.findElement(wishListIcon).click();
    }

    public void AddEmailAddress() {
        driver.findElement(EmailAddress).sendKeys("habibamamdouh1@gmail.com");
    }

    public void AddPassword() {
        driver.findElement(Password).sendKeys("dX-VM3/K");
    }

    public void ClickOnSignInButton() {
        driver.findElement(signInButton).click();
    }
}
