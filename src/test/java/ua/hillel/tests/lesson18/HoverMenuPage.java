package ua.hillel.tests.lesson18;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.List;

/* https://crossbrowsertesting.github.io/hover-menu.html
 написати тест, який розкриває dropdown-меню, клікає по пункту Secondary Action
і перевіряє, що на сторінці показується текст "Secondary Page"
*/

public class HoverMenuPage {
    private static final String hoverMenuPage = "https://crossbrowsertesting.github.io/hover-menu.html";
    private WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void setUpBrowser(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        } else if (browser.equals("firefox")) {
            WebDriverManager.edgedriver().setup();
        } else throw new Error("You should set up the browser");
    }

    @BeforeMethod
    @Parameters({"browser"})
    public void creatingObjectOfBrowser(String browser) {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new EdgeDriver();
        } else throw new Error("You should creating an object of browser class");
        driver.manage().window().maximize();
    }

    @Test(description = "Finding second dropdown menu, choosing element and get title",
            priority = 10)

    public void findSecondaryAction() {
        driver.get(hoverMenuPage);

        driver.findElement(By.className("dropdown")).click();

        Actions actions = new Actions(driver);

        List<WebElement> menuOptions = driver.findElements(By.xpath("//a[@class='dropdown-toggle'][1]"));
        for (WebElement option : menuOptions) {
            if (option.getText().contains("Secondary Menu")) {
                actions.moveToElement(option).pause(10)
                        .moveToElement(driver.findElement(By.xpath("//ul[@class='dropdown-menu secondary']")))
                        .click()
                        .perform();
                break;
            }
        }
        WebElement expectedTitle = driver.findElement(By.xpath("//div/h1[contains(text(),'Secondary Page')]"));
        System.out.println(expectedTitle.getText());
        Assert.assertEquals(expectedTitle.getText(), "Secondary Page");
    }

    @AfterMethod(alwaysRun = true)
    public void clearUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}

