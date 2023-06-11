package ua.hillel.tests.lesson15;
import org.testng.annotations.Test;

/*тест, який залежить від групи login.
Можна додати умову, за якою тест1 буде фейлити, при йьому перевірити, як TestNG буде запускати залежний тест
*/

public class UsingTestNG_2 {
    @Test(description = "second_test",
            priority = 20,
            dependsOnGroups= {"login"})
    public void SomeTest() {
        System.out.println("This is some test");
    }
}
