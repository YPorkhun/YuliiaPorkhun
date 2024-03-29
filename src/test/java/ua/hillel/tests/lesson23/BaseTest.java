package ua.hillel.tests.lesson23;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import ua.hillel.tests.listeners.CustomExtentReportsListener;

@Listeners({CustomExtentReportsListener.class})

public class BaseTest {

    @BeforeClass
    @Parameters({"browser"})
    public void setUpBrowser(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
        } else throw new Error("You should set up the browser");

        Configuration.downloadsFolder = "target/downloads/";
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;
    }
}
