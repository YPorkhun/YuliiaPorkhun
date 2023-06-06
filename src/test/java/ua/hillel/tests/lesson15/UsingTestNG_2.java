package ua.hillel.tests.lesson15;

import org.testng.annotations.Test;

public class UsingTestNG_2 {
    @Test(description = "second_test",
            priority = 20,
            dependsOnGroups= {"login"})
    public void SomeTest() {
        System.out.println("This is some test");
    }
}
