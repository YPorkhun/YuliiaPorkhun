package ua.hillel.tests.actions;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class UsingTestNG_Before {
    @BeforeSuite
    public void beforeSuite () {
        System.out.println("===== BEFORE SUITE =====");
    }
    @BeforeTest
    public void beforeTest () {
        System.out.println("===== BEFORE TEST =====");
    }
}
