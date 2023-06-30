package ua.hillel.tests.lesson23;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setUp () {
        Configuration.browser = "chrome";
        Configuration.downloadsFolder = "target/downloads/";
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;
    }
}
