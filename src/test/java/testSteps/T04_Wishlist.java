package testSteps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P04_Wishlist;

public class T04_Wishlist extends testBase {
    P04_Wishlist page = new P04_Wishlist();

    @Test
    public void validateUserCanAddToCart() {
        SoftAssert soft= new SoftAssert();

        page.CheckWishList();
        String text =driver.findElement(By.className("page-title-wrapper")).getText();
        boolean TextCheck= text.contains("Customer Login");
        soft.assertTrue(TextCheck);
        page.AddEmailAddress();
        page.AddPassword();
        page.ClickOnSignInButton();
        String text2 =driver.findElement(By.className("product-item-link")).getText();
        boolean TextCheck2= text2.contains("Radiant Tee");
        soft.assertTrue(TextCheck2);
    }
}
