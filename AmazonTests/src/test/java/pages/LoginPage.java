package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{

    public final String emailAdress = "ap_email";   // ID
    public final String logIn = "continue";  // ID

    public LoginPage(WebDriver driver){
        super(driver);
    }
}
