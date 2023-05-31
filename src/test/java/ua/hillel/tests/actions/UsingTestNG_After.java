package ua.hillel.tests.actions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class UsingTestNG_After {
    @AfterSuite
    public void afterSuite (){
        System.out.println("===== AFTER SUITE =====");
    }
    @AfterTest
    public void afterTest (){
        System.out.println("===== AFTER TEST =====");
    }
}
