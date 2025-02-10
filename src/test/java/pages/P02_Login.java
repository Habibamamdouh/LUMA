package pages;

import org.openqa.selenium.By;

import static testSteps.testBase.driver;

public class P02_Login {
    By signInOption = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
    By EmailAddress = By.id("email");
    By Password = By.id("pass");
    By signInButton = By.xpath("//*[@id=\"send2\"]/span");


    public void ClickOnSignInOption(){
        driver.findElement(signInOption).click();
    }
    public void AddEmailAddress(){
        driver.findElement(EmailAddress).sendKeys("habibamamdouh1@gmail.com");
    }
    public void AddPassword(){
        driver.findElement(Password).sendKeys("dX-VM3/K");
    }
    public void ClickOnSignInButton(){
        driver.findElement(signInButton).click();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }

}
