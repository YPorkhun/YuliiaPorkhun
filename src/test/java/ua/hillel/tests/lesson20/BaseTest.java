package ua.hillel.tests.lesson20;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import ua.hillel.tests.listeners.CustomExtentReportsListener;

@Listeners ({CustomExtentReportsListener.class})

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void setUpBrowser(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        } else if (browser.equals("firefox")) {
            WebDriverManager.edgedriver().setup();
        } else throw new Error("You should set up the browser");
    }
    @AfterClass (alwaysRun = true)
    public void clearUp() {
        driver.close();
        driver.quit();
    }

}
