package ua.hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy (xpath = "//input[@name='username']")
    private WebElement usernameLocator;
    @FindBy (xpath = "//input[@name='password']")
    private WebElement passwordLocator;
    @FindBy (xpath = "//i[@class='fa fa-2x fa-sign-in']")
    private WebElement buttonLocator;
    @FindBy (css = ".flash")
    private WebElement errorMessage;

    public LoginPage (WebDriver driver){super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage setUserName (String username) {
        usernameLocator.clear();
        usernameLocator.sendKeys(username);
        return this;
    }

    public LoginPage setPassword (String password ){
        passwordLocator.clear();
        passwordLocator.sendKeys(password);
        return this;
    }

    public SecureAreaPage clickLoginButton () {
        clickButton(buttonLocator);
        return new SecureAreaPage(driver);
    }

    public LoginPage loginWithWrongCredentials() {
        clickButton(buttonLocator);
        return this;
    }
    public String getErrorText () {
        return errorMessage.getText();
    }
    public SecureAreaPage login (String username, String password) {
        setUserName(username);
        setPassword(password);
        clickLoginButton();
        return new SecureAreaPage(driver);
    }
}
