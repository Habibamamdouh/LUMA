package testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P03_LandingPage;

import java.util.List;

import static testSteps.testBase.driver;

public class T03_LandingPage extends testBase {

    P03_LandingPage page = new P03_LandingPage();

    @Test
    public void validatePriceAndHotSeller() {
        SoftAssert soft= new SoftAssert();
        String text = driver.findElement(By.className("content-heading")).getText();
        boolean TextCheck = text.contains("Hot Sellers");
        soft.assertTrue(TextCheck);

        String ExitSearch = "$";
        List<String> productNames = page.GetProductName();
        for (int i = 0; i < productNames.size(); i++) {
            soft.assertTrue(productNames.get(i).contains(ExitSearch));
        }

    }

    @Test
    public void validateAddToCart() {
        SoftAssert soft= new SoftAssert();

        String ExitSearch = "Add to Cart";
        List<String> productNames = page.CheckAddToCart();
        for (int i = 0; i < productNames.size(); i++) {
            soft.assertTrue(productNames.get(i).contains(ExitSearch));
        }
        boolean BtnCheck= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[5]/div/div/ol/li[4]/div/div/div[3]/div/div[1]/form/button/span")).isEnabled();
        soft.assertTrue(BtnCheck);
    }

    @Test
    public void validateUserCanAddToCart() {
        SoftAssert soft= new SoftAssert();

        page.BreatheEasyTankAddToCart();
        String text =driver.findElement(By.className("counter-number")).getText();
        boolean TextCheck= text.contains("1");
        soft.assertTrue(TextCheck);

    }

}

