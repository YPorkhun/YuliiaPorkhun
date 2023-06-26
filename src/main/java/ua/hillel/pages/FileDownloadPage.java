package ua.hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadPage extends BasePage {
    @FindBy(xpath = "//div[@id='content']//a[8]")
    private WebElement file;

    public FileDownloadPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public FileDownloadPage downloadFile () {
        file.click();
        return this;
    }
}
