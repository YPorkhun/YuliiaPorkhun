package ua.hillel.rest;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;
import ua.hillel.rest.entities.PostPet;
import ua.hillel.rest.entities.PostUser;
import java.io.IOException;

public class PostController {

    public void postStoreOrder() throws IOException {

//        String bodyString = "{\n" +
//                "  \"id\": 10,\n" +
//                "  \"petId\": 198772,\n" +
//                "  \"quantity\": 7,\n" +
//                "  \"shipDate\": \"2023-07-12T14:27:58.237Z\",\n" +
//                "  \"status\": \"approved\",\n" +
//                "  \"complete\": true\n" +
//                "}";

        JSONObject json = new JSONObject();
        json.put("userId", 1);
        json.put("petId", 1);
        json.put("quantity", 2);
        json.put("shipDate", "2023-07-12T14:56:34.174Z");
        json.put("status", "approved");
        json.put("complete", true);

        RequestBody body = RequestBody.create(json.toString().getBytes());
        Request request = new Request.Builder()
                .url("https://petstore3.swagger.io/api/v3/store/order/")
                .post(body)
                .header("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
    }
    public void postCreateUserUsingGson (PostUser postUser) throws IOException {
        Gson gson = new Gson();

        RequestBody body = RequestBody.create(gson.toJson(postUser).getBytes());
        Request request = new Request.Builder()
                .url("https://petstore3.swagger.io/api/v3/user")
                .post(body)
                .header("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
    }
    public void postPetUsingLombok (PostPet postPet) throws IOException {
        Gson gson = new Gson();

        RequestBody body = RequestBody.create(gson.toJson(postPet).getBytes());
        Request request = new Request.Builder()
                .url("https://petstore3.swagger.io/api/v3/pet")
                .post(body)
                .header("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
    }
}
