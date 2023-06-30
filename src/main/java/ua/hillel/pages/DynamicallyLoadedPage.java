package ua.hillel.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class DynamicallyLoadedPage {
    private static final SelenideElement dynamicLoading_1 = $(By.xpath("//div[@id='content']/div/a[1]"));
    private static final SelenideElement dynamicLoading_2 = $(By.xpath("//div[@id='content']/div/a[2]"));
    public final SelenideElement startButton = $("#start button");
    public final SelenideElement loading = $("#loading");
    private static final SelenideElement message = $("#finish");

    public void clickOnLink_1 () {
        dynamicLoading_1.shouldBe(Condition.enabled).click();
    }
    public void clickOnStartButton () {
        startButton.click();
    }
    public void waitTextToAppear() {
        loading.should(Condition.disappear);
        message.should(Condition.appear);
    }
    public void clickOnLink_2 () {
        dynamicLoading_2.shouldBe(Condition.enabled).click();
    }
    public String getMessageText() {
        return message.getText();
    }

}
