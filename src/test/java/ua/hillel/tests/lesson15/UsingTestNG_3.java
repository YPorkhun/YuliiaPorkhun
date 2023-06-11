package ua.hillel.tests.lesson15;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/* тест, який приймає параметри ззовні (можна задати через XML-конфіг файл або рантайм) і виводить їх на екран */

public class UsingTestNG_3 {
    @Test( description = "third_test",
            priority = 30)
    @Parameters({"url","browser"})
    public void GetParametersTest (String url , String browser) {
        System.out.println("This is get parameters test in " + url + " using the " + browser);
    }
}
