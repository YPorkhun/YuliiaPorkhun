package ua.hillel.tests.rest;
import org.testng.annotations.Test;
import ua.hillel.rest.DeleteController;
import java.io.IOException;

/*
Автоматизувати роботу з ендпоінтами "store" https://petstore3.swagger.io/#/
Код потрібно розділити на окремі рівні (рівень API та рівень тестів), для формування тіла повідомлення можна користуватися JSONObject або ж серіалізацією.
 */
public class DeleteControllerTest {
    @Test
    public void deleteStoreOrder() throws IOException {
        new DeleteController().deleteStoreOrder(1);
    }
}
