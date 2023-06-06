package ua.hillel.tests.lesson15;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingTestNG_1 {
    @Test ( description = "first_test",
            priority = 10,
            groups = {"login"},
            dataProvider = "UserData"
    )
    public void LoginTest (String userName, String userPassword, String userRole) {
        System.out.printf("Name: %s - Password: %s - Role: %s%n", userName, userPassword, userRole);
        System.out.println("Running test for " + userRole);
//        if (userRole.equals("guest")){
//            throw new RuntimeException("Test failed");
//        }
        System.out.println("test for " + userRole + " is passed");
    }

    @DataProvider (name = "UserData")
    public Object[][] dataProviderMethod () {
        return new String[][] {
                {"User_1", "password_1", "admin"},
                {"User_2", "password_2", "guest"},
                {"User_3", "password_3","user"}
        };
    }
}
