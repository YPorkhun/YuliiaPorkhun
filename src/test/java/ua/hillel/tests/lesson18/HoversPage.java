package ua.hillel.tests.lesson18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.List;

public class HoversPage {
    private static final String hoversPage = "https://the-internet.herokuapp.com/hovers";
    private WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void setUpBrowser(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
        } else throw new Error("You should set up the browser");
    }

    @BeforeMethod
    @Parameters({"browser"})
    public void creatingObjectOfBrowser(String browser) {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        } else throw new Error("You should creating an object of browser class");
        driver.manage().window().maximize();
    }

    @Test (description = "Hover the pages of users",
          priority = 10)

    public void hoveringUserPages(){
        driver.get(hoversPage);

        Actions actions = new Actions(driver);

        List<WebElement> usersList = driver.findElements(By.xpath("//div[@class='figure']"));
        for (WebElement user : usersList) {
            actions.moveToElement(user)
                    .perform();

            System.out.println(user.findElement(By.tagName("h5")).getText().replace("name: ", ""));
        }
    }
    @AfterMethod(alwaysRun = true)
    public void clearUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}