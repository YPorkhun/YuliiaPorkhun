package ua.hillel.tests.lesson23;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.DynamicallyLoadedPage;
import static com.codeborne.selenide.Selenide.open;

/*
Написати PageObject і тест для https://the-internet.herokuapp.com/dynamic_loading (обидва варіанти).
Після кліка по кнопці дочекатися появи тексту на сторінці і перевірити його в асерті
 */

public class DynamicallyLoadedTest extends BaseTest {
    @Test
    public void DynamicallyLoadedTest_1 () {
        open("https://the-internet.herokuapp.com/dynamic_loading");

        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        dynamicallyLoadedPage.clickOnLink_1();
        dynamicallyLoadedPage.clickOnStartButton();
        dynamicallyLoadedPage.waitTextToAppear();

        Assert.assertEquals(dynamicallyLoadedPage.getMessageText(),"Hello World!");
    }
    @Test
    public void DynamicallyLoadedTest_2 () {
        open("https://the-internet.herokuapp.com/dynamic_loading");

        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        dynamicallyLoadedPage.clickOnLink_2();
        dynamicallyLoadedPage.clickOnStartButton();
        dynamicallyLoadedPage.waitTextToAppear();

        Assert.assertEquals(dynamicallyLoadedPage.getMessageText(),"Hello World!");

    }
}
