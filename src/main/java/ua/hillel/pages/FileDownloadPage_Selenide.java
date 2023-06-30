package ua.hillel.pages;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class FileDownloadPage_Selenide {
    public static final String link = "https://the-internet.herokuapp.com/download";
    public FileDownloadPage_Selenide downloadFile(String file) {
        $(byLinkText(file)).click();
        return this;
    }
}
