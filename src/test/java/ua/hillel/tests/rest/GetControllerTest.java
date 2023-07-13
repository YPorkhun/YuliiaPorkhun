package ua.hillel.tests.rest;
import org.testng.annotations.Test;
import ua.hillel.rest.GetController;
import java.io.IOException;

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
