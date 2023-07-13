package ua.hillel.tests.rest;
import org.testng.annotations.Test;
import ua.hillel.rest.DeleteController;

import java.io.IOException;

public class DeleteControllerTest {
    @Test
    public void deleteStoreOrder() throws IOException {
        new DeleteController().deleteStoreOrder(1);
    }
}
