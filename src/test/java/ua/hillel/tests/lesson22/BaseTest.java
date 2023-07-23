package ua.hillel.tests.lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    protected WebDriver driver;
    @BeforeClass
    public void setUp () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap <String, Object>();
        prefs.put("download.default_directory", new File("target/downloads").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);
        this.driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }
    @BeforeClass
    @Parameters({"browser"})
    public void setUpBrowser(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        } else if (browser.equals("firefox")) {
            WebDriverManager.edgedriver().setup();
        } else throw new Error("You should set up the browser");
    }

    @AfterClass(alwaysRun = true)
    public void clearUp() {
        driver.close();
        driver.quit();
    }
}
