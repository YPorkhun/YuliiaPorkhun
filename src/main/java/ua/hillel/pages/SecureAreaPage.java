package ua.hillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {
    public SecureAreaPage (WebDriver driver){super(driver);}

    public LoginPage logout () {
        clickButton(driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")));
        return new LoginPage(driver);
    }
    public String getTitle() {
        return driver.findElement(By.tagName("h2")).getText();
    }
}
