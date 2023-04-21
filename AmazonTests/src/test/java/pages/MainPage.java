package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends Page{

    public final String myAccount = "nav-link-accountList";  // ID

    public final String search = "twotabsearchtextbox";  // ID


    public MainPage(WebDriver driver) {
        super(driver);
    }
}
