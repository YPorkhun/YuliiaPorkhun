package ua.hillel.tests.lesson23;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.FileDownloadPage_Selenide;
import ua.hillel.pages.FileUploaderPage_Selenide;

import java.io.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FileDownloadUploadTest_Selenide extends BaseTest {

    @Test
    public void fileDownloadAndUpload_Selenide() throws IOException {

        FileDownloadPage_Selenide fileDownloadPageSelenide = open(FileDownloadPage_Selenide.link, FileDownloadPage_Selenide.class);
        File file = $(By.xpath("//div//a[4]")).download();

        changingFile(file.getAbsolutePath());

        FileUploaderPage_Selenide fileUploaderPageSelenide = open(FileUploaderPage_Selenide.link, FileUploaderPage_Selenide.class);
        fileUploaderPageSelenide.selectAndUploadFile(file.getAbsolutePath());

        Assert.assertTrue(fileUploaderPageSelenide.isMessageAppeared(),"File Uploaded!");

    }
        public void changingFile (String path) throws IOException {
            File file = new File(path);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write("Hello");
                writer.newLine();
                writer.write("It's me again...");
                writer.newLine();
            }
        }
}
