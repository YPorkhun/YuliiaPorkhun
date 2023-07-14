package ua.hillel.tests.rest;
import org.testng.annotations.Test;
import ua.hillel.rest.GetController;
import java.io.IOException;

/*
Автоматизувати роботу з ендпоінтами "store" https://petstore3.swagger.io/#/
Код потрібно розділити на окремі рівні (рівень API та рівень тестів), для формування тіла повідомлення можна користуватися JSONObject або ж серіалізацією.
 */

public class GetControllerTest {
    @Test
    public void getStoreInventoryTest() throws IOException {
        new GetController().getStoreInventory();
    }

    @Test
    public void getStoreOrder() throws IOException {
        new GetController().getStoreOrder(2);
    }
}
