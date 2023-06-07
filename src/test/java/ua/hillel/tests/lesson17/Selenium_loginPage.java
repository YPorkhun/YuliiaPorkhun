package ua.hillel.tests.lesson17;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Selenium_loginPage {
    private static final String loginPage = "https://the-internet.herokuapp.com/login";
    private static final String messageCorrectLogin = "You logged into a secure area!";
    private static final String messageIncorrectLogin = "Your username is invalid!";
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

    @Test (description = "Checking log in with correct data",
           priority = 10)

    public void checkingCorrectLogin() {
        driver.get(loginPage);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.clear();
        username.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.clear();
        password.sendKeys("SuperSecretPassword!");
        WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();
        WebElement message = driver.findElement(By.xpath("//div[@id='flash']"));
        System.out.println(message.getText());
        Assert.assertTrue(message.getText().contains(messageCorrectLogin));
    }
    @Test (description = "Checking log in with incorrect data",
            priority = 20)

    public void checkingIncorrectLogin(){
        driver.get(loginPage);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.clear();
        username.sendKeys("blablabla");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.clear();
        password.sendKeys("SuperNonSecretPassword!");
        WebElement loginButton = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginButton.click();
        WebElement message = driver.findElement(By.xpath("//div[@id='flash']"));
        System.out.println(message.getText());
        Assert.assertTrue(message.getText().contains(messageIncorrectLogin));
    }
    @AfterMethod
    public void clearUp() {
        driver.close();
        driver.quit();
    }
}

