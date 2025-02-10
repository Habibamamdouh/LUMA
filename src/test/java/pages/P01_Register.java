package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static testSteps.testBase.driver;

public class P01_Register {
    By AddAccountButton = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a");
    By FirstName = By.id("firstname");
    By LastName = By.id("lastname");
    By EmailAddress = By.id("email_address");
    By Password = By.id("password");
    By PasswordConfirmation = By.id("password-confirmation");
    By CreateAnAccount = By.cssSelector("#form-validate > div > div.primary > button > span");


    public void ClickOnAddAccountButton(){
        driver.findElement(AddAccountButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void AddFirstName(){
        driver.findElement(FirstName).sendKeys("habiba");
    }
    public void AddLastName(){
        driver.findElement(LastName).sendKeys("mamdouh");
    }
    public void AddEmailAddress(){
        driver.findElement(EmailAddress).sendKeys("habibamamdouh5@gmail.com");
    }
    public void AddPassword(){
        driver.findElement(Password).sendKeys("dX-VM3/K");
    }
    public void AddPasswordConfirmation(){
        driver.findElement(PasswordConfirmation).sendKeys("");
    }
    public void AddPasswordConfirmation2(){
        driver.findElement(PasswordConfirmation).sendKeys("HX-VM3/K");
    }
    public void AddPasswordConfirmation3(){
        driver.findElement(PasswordConfirmation).sendKeys("dX-VM3/K");
    }
    public void ClickOnCreateAnAccount(){
        driver.findElement(CreateAnAccount).click();
    }


}
