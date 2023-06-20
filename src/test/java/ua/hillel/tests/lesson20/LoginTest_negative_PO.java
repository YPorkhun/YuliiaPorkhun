package ua.hillel.tests.lesson20;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.LoginPage;
import ua.hillel.pages.MainPage;

/*
Провести рефакторинг власного коду, розділити логіку тестів і логіку роботи зі сторінками,
винести її в класи PageObject (можна також додати використання фабрики)
Рефакторити потрібно тільки сторінки тестового сайту https://the-internet.herokuapp.com/
 */

public class LoginTest_negative_PO extends BaseTest {
    @Test
    public void loginTest() {
        driver.get("https://the-internet.herokuapp.com/");

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.openLoginPage()
                .setUserName("tom")
                .setPassword("SuperNonSecretPassword!")
                .loginWithWrongCredentials();

        Assert.assertTrue(loginPage.getErrorText().contains("Your username is invalid!"));
    }
}
