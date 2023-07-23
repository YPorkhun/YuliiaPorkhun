package ua.hillel.tests.lesson20;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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
