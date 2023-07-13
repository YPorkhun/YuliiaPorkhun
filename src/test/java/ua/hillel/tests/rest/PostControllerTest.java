package ua.hillel.tests.rest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ua.hillel.rest.PostController;
import ua.hillel.rest.entities.PostPet;
import ua.hillel.rest.entities.PostUser;

import java.io.IOException;

/*
Автоматизувати роботу з ендпоінтами "store" https://petstore3.swagger.io/#/
Код потрібно розділити на окремі рівні (рівень API та рівень тестів), для формування тіла повідомлення можна користуватися JSONObject або ж серіалізацією.
 */

public class PostControllerTest {

    @Test (description = "Create test with jsonObject",
            priority = 20)
    public void postStoreOrderTest () throws IOException {
        new PostController().postStoreOrder();
    }
    @Test (description = "Create test with gson",
    priority = 10)
    public void postCreateUserUsingGsonTest () throws IOException {
        PostUser postUser = new PostUser();
        postUser.setId(1);
        postUser.setUsername("SomeUserName");
        postUser.setFirstname("Yuliia");
        postUser.setLastname("Porkhun");
        postUser.setEmail("jul@gmail.com");
        postUser.setPassword("test_password");
        postUser.setPhone("+444 4444 444");
        postUser.setUserStatus(4);

        new PostController().postCreateUserUsingGson(postUser);

    }
    @Test (description = "Create test using lombok",
            priority = 30)
    public void postPetTest () throws IOException {
        PostPet postPet = new PostPet();
        postPet.setPetId(1);
        postPet.setName("Tsilya");
        postPet.setStatus("amazing pet");

        new PostController().postPetUsingLombok(postPet);

    }
}
