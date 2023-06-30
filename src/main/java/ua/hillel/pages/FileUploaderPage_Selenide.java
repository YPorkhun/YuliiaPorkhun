package ua.hillel.pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FileUploaderPage_Selenide {
    public static final String link = "https://the-internet.herokuapp.com/upload";

    public void selectAndUploadFile(String path) {
        SelenideElement elemInput = $("#file-upload");
        File file = new File(path);
        elemInput.uploadFile(file);
        $("#file-submit").click();
    }
    public boolean isMessageAppeared() {
        $("body").shouldHave(text("File Uploaded!"));
        return true;
    }
}
