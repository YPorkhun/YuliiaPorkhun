package ua.hillel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;

public class FileUploaderPage extends BasePage {
    @FindBy(xpath = "//input [@id='file-upload']")
    private WebElement chooseFileInput;
    @FindBy(xpath = "//input [@id='file-submit']")
    private WebElement uploadButton;
    @FindBy(tagName = "h3")
    private WebElement successHeader;

    public FileUploaderPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public FileUploaderPage selectAndUploadFile (String path) {
        File file = new File(path);
        chooseFileInput.sendKeys(file.getAbsolutePath());
        uploadButton.click();
        return this;
    }
    public String getMessage(){
        return successHeader.getText();
    }
}
