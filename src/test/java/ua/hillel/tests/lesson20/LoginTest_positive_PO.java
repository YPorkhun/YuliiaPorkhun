package ua.hillel.tests.lesson20;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.MainPage;
import ua.hillel.pages.SecureAreaPage;

/*
Провести рефакторинг власного коду, розділити логіку тестів і логіку роботи зі сторінками,
винести її в класи PageObject (можна також додати використання фабрики)
Рефакторити потрібно тільки сторінки тестового сайту https://the-internet.herokuapp.com/
 */

public class LoginTest_positive_PO extends BaseTest {
    @Test
    public void loginTest() {
        driver.get("https://the-internet.herokuapp.com/");

        MainPage mainPage = new MainPage(driver);
        SecureAreaPage secureAreaPage = mainPage.openLoginPage()
                .setUserName("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();

        Assert.assertEquals(secureAreaPage.getTitle(),"Secure Area", "Incorrect page title");
        secureAreaPage.logout();
    }
}
