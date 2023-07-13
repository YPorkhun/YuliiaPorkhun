package ua.hillel.rest;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class DeleteController {
    public void deleteStoreOrder(int id) throws IOException {
        Request request = new Request.Builder()
                .url("https://petstore3.swagger.io/api/v3/store/order/" + id)
                .delete()
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println(response.code());
    }
}
