package testSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class testBase {

        public static WebDriver driver;
        @BeforeTest
        public void openBrowser(){
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        }
        @BeforeMethod
        public void navigateMethod(){
            driver.get("https://magento.softwaretestingboard.com/");

        }
        @AfterTest
        public void close() throws InterruptedException {
            //driver.close();
            Thread.sleep(3000);
        }




    }

