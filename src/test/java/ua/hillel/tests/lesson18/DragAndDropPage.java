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

public class DragAndDropPage {
    private static final String dragAndDropPage = "https://crossbrowsertesting.github.io/drag-and-drop.html";
    private static final String message = "Dropped!";
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

    @Test (description = "Drag and Drop",
           priority = 10)

    public void dragAndDropMethod () {
        driver.get(dragAndDropPage);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();

        System.out.println(droppable.getText());
        Assert.assertTrue(droppable.getText().contains(message));
    }

    @AfterMethod(alwaysRun = true)
    public void clearUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}
