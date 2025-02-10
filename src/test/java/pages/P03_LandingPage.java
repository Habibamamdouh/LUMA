package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static testSteps.testBase.driver;

public class P03_LandingPage {
    By ProductName = By.className("price");
    By AddToCart = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[5]/div/div/ol/li[4]/div/div/div[3]/div/div[1]/form/button/span");
    By BreatheEasyTank = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[5]/div/div/ol/li[2]/div/div/strong/a");
    By MediumSize = By.id("option-label-size-143-item-168");
    By Color = By.id("option-label-color-93-item-57");
    By AddToCartButton = By.id("product-addtocart-button");
    By CartButton = By.className("counter-number");


    public List<String> GetProductName(){

        List<WebElement> products= driver.findElements(ProductName);
        List<String> NamesOfProducts= new ArrayList<>();
        String script ="arguments[0].scrollIntoView()";
        for(int i =0;i<products.size();i++){
            NamesOfProducts.add(products.get(i).getText());
            ((JavascriptExecutor)driver).executeScript(script, products.get(i));
        }
        return NamesOfProducts;
    }
    public List<String> CheckAddToCart(){

        List<WebElement> products= driver.findElements(AddToCart);
        List<String> NamesOfProducts= new ArrayList<>();
        String script ="arguments[0].scrollIntoView()";
        for(int i =0;i<products.size();i++){
            NamesOfProducts.add(products.get(i).getText());
            ((JavascriptExecutor)driver).executeScript(script, products.get(i));
        }
        return NamesOfProducts;
    }
    public void BreatheEasyTankAddToCart(){
        driver.findElement(BreatheEasyTank).click();
        driver.findElement(MediumSize).click();
        driver.findElement(Color).click();
        driver.findElement(AddToCartButton).click();
    }

}
