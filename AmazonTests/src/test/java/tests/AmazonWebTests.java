package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import pages.Page;
import pages.LoginPage;
import pages.MainPage;
import java.time.Duration;

public class AmazonWebTests {

    private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        driver.get("https://www.amazon.com/");
    }

    @Test
    void amazonLoginTest() throws InterruptedException{
        mainPage.click(mainPage.myAccount);
        loginPage.waitUntilElementAppearsByID(loginPage.emailAdress);
        loginPage.writeInTheFieldByID(loginPage.emailAdress, "alihanozgoc@gmail.com");
        loginPage.click(loginPage.logIn);
    }

    @Test
    void searchTest() throws InterruptedException{
        mainPage.waitUntilElementAppearsByID(mainPage.search);
        mainPage.writeInTheFieldByID(mainPage.search, "Daddario Light Acoustic Guitar Strings");
        mainPage.pressTheKey(mainPage.search, Keys.ENTER);
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
