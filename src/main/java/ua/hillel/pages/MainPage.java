package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage (WebDriver driver){super(driver);}

    public LoginPage openLoginPage() {
        clickButton(driver.findElement(By.linkText("Form Authentication")));
        return new LoginPage(driver);
    }
}
