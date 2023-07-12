package ua.hillel.tests.rest;

import org.testng.annotations.Test;
import ua.hillel.rest.PostController;
import java.io.IOException;

public class PostControllerTest {
    @Test
    public void postStoreOrder () throws IOException {
        new PostController().postStoreOrder();
    }
}
