package testSteps;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_Register;
import pages.P02_Login;

public class T02_Login extends testBase {

    P02_Login page = new P02_Login();

    @Test
    public void SignInOption(){
        page.ClickOnSignInOption();
        page.AddEmailAddress();
        page.AddPassword();
        page.ClickOnSignInButton();
        Assert.assertEquals(page.getUrl(),"https://magento.softwaretestingboard.com/");
        String text =driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span")).getText();
        boolean TextCheck= text.contains("Welcome, habiba mamdouh!");
        Assert.assertTrue(TextCheck);

    }
}
