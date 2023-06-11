package ua.hillel.tests.lesson17;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import java.util.List;

/* https://the-internet.herokuapp.com/challenging_dom - потрібно знайти і клікнути по кожній кнопці,
після чого вибрати всі значення з 4го стовбця таблиці і вивести їх на екран
*/

public class ChallengingDomPage {
    private static final String challengingDomPage = "https://the-internet.herokuapp.com/challenging_dom";
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

    @Test(description = "Searching elements by cssSelector",
            priority = 10)

    public void findButtonsByCssSelectors() {
        driver.get(challengingDomPage);
        driver.findElement(By.cssSelector(".large-2.columns a")).click();
        driver.findElement(By.cssSelector(".large-2.columns .alert")).click();
        driver.findElement(By.cssSelector(".large-2.columns .success")).click();
    }
    @Test(description = "Searching and printing elements of table",
            priority = 20)

    public void findElementsOfTable() {
        driver.get(challengingDomPage);
        List<WebElement> tableValues = driver.findElements(By.xpath("//table//tbody//tr"));
        for (int i = 1; i <= tableValues.size(); i++) {
            WebElement tableElement = driver.findElement(By.xpath(String.format("//table/tbody/tr[%s]/td[4]", i)));
            System.out.println(tableElement.getText());
        }
    }
    @AfterMethod
    public void clearUp() {
        driver.close();
        driver.quit();
    }
}
