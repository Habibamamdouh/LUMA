package testSteps;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_Register;

public class T01_Register extends testBase {
    P01_Register page = new P01_Register();

    @Test
    public void EmptyConfirmPasswordField(){
        page.ClickOnAddAccountButton();
        Assert.assertEquals(page.getUrl(),"https://magento.softwaretestingboard.com/customer/account/create/");
        page.AddFirstName();
        page.AddLastName();
        page.AddEmailAddress();
        page.AddPassword();
        page.AddPasswordConfirmation();
        page.ClickOnCreateAnAccount();
        String text =driver.findElement(By.id("password-confirmation-error")).getText();
        boolean TextCheck= text.contains("This is a required field.");
        Assert.assertTrue(TextCheck);
    }

    @Test
    public void PasswordAndConfirmPasswordDoesNotMatch(){
        page.ClickOnAddAccountButton();
        Assert.assertEquals(page.getUrl(),"https://magento.softwaretestingboard.com/customer/account/create/");
        page.AddFirstName();
        page.AddLastName();
        page.AddEmailAddress();
        page.AddPassword();
        page.AddPasswordConfirmation2();
        page.ClickOnCreateAnAccount();
        String text =driver.findElement(By.id("password-confirmation-error")).getText();
        boolean TextCheck= text.contains("Please enter the same value again.");
        Assert.assertTrue(TextCheck);
    }

    @Test
    public void ValidInputs(){
        page.ClickOnAddAccountButton();
        page.AddFirstName();
        page.AddLastName();
        page.AddEmailAddress();
        page.AddPassword();
        page.AddPasswordConfirmation3();
        page.ClickOnCreateAnAccount();
        Assert.assertEquals(page.getUrl(),"https://magento.softwaretestingboard.com/customer/account/");
        String text =driver.findElement(By.className("box-content")).getText();
        boolean TextCheck= text.contains("habibamamdouh5@gmail.com");
        Assert.assertTrue(TextCheck);
        boolean TextCheck2= text.contains("habiba");
        Assert.assertTrue(TextCheck2);
        boolean TextCheck3= text.contains("mamdouh");
        Assert.assertTrue(TextCheck3);

    }


}
