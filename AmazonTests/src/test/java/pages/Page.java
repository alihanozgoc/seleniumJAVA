package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Page {

    WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
    }

    public void waitUntilElementAppearsByID(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void click(String tusID){
        driver.findElement(By.id(tusID)).click();
    }

    public void writeInTheFieldByID(String elementId, String emailAdress){
        driver.findElement(By.id(elementId)).sendKeys(emailAdress);
    }

    public void pressTheKey(String elementId, Keys keyboardButton){
        driver.findElement(By.id(elementId)).sendKeys(keyboardButton);
    }
}
