package ua.hillel.tests.lesson17;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/* https://the-internet.herokuapp.com/checkboxes
- вивести на екран початковий стан чекбоксів (вибраний чи ні), потім вибрати обидва.
*/

public class CheckboxesPage {
    private static final String checkboxesPage = "https://the-internet.herokuapp.com/checkboxes";
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
    @Test (description = "Checking statuses of checkboxes",
           priority = 10)

    public void checkAndPrintCheckboxStatuses() {
        driver.get(checkboxesPage);
        WebElement checkbox_1 = driver.findElement(By.xpath("//form//input[1]"));
        WebElement checkbox_2 = driver.findElement(By.xpath("//form//input[2]"));

        boolean isSelectedCh_1 = driver.findElement(By.xpath("//form//input[1]")).isSelected();
        boolean isSelectedCh_2 = driver.findElement(By.xpath("//form//input[2]")).isSelected();

        if (isSelectedCh_1 == true && isSelectedCh_2 == false) {
            System.out.println("Checkbox 1 is selected, Checkbox 2 isn't selected");
            driver.findElement(By.xpath("//form//input[2]")).click();
        } else if (isSelectedCh_2 == true && isSelectedCh_1 == false) {
            System.out.println("Checkbox 2 is selected, Checkbox 1 isn't selected");
            driver.findElement(By.xpath("//form//input[1]")).click();
        } else if (isSelectedCh_1 == true && isSelectedCh_2 == true) {
            System.out.println("Both checkboxes is selected");
        } else if (isSelectedCh_1 == false && isSelectedCh_2 == false) {
            System.out.println("None of the checkboxes are checked");
            driver.findElement(By.xpath("//form//input[1]")).click();
            driver.findElement(By.xpath("//form//input[2]")).click();
        }
        Assert.assertEquals(checkbox_1.isSelected(), true);
        Assert.assertEquals(checkbox_2.isSelected(), true);
    }
    @AfterMethod
    public void clearUp() {
        driver.close();
        driver.quit();
    }
}
