package ua.hillel.tests.lesson22;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.FileDownloadPage;
import ua.hillel.pages.FileUploaderPage;
import java.io.*;

/*
Для даунлоада потрібно використати сторінку https://the-internet.herokuapp.com/download
Обрати буть-який текстовий файл. В цей файл потрібно дописати декілька нових рядків.
Після цього перейти на сторінку https://the-internet.herokuapp.com/upload завантажити файл і перевірити, що дія виконана успішно.
Логіка роботи з елементами сторінки має бути винесена у PageObject-и
Логіка роботи з файлами має бути в тесті
 */

public class FileDownloadUploadTest extends BaseTest {

    @Test
    public void fileDownloadAndUpload() throws IOException {
        driver.get("https://the-internet.herokuapp.com/download");
        FileDownloadPage fileDownloadPage = new FileDownloadPage(driver);
        fileDownloadPage.downloadFile();

        changingFile("target/test-classes/not_empty.txt");

        driver.get("https://the-internet.herokuapp.com/upload");
        FileUploaderPage fileUploaderPage = new FileUploaderPage(driver);
        fileUploaderPage.selectAndUploadFile("target/test-classes/not_empty.txt");

        Assert.assertEquals(fileUploaderPage.getMessage(), "File Uploaded!");
    }

    public void changingFile(String path) throws IOException {
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("Hello");
            writer.newLine();
            writer.write("It's me...");
            writer.newLine();
        }
    }
}