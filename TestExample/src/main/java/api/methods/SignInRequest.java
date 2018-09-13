package api.methods;

import api.request.builder.RequestBody;
import api.request.builder.RequestBuilder;
import api.request.builder.RequestHeaders;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

import static utility.GlobalVariables.CONTENT_TYPE;
import static utility.GlobalVariables.URL_SIGNIN;

public class SignInRequest {
    public static Response signInRequest(String email, String password) {
        List<Pair<String, String>> body = new ArrayList<>();
        body.add(new Pair<>("email", email));
        body.add(new Pair<>("password", password));
        List<Pair<String, String>> headers = new ArrayList<>();
        headers.add(new Pair<>("Content-Type", CONTENT_TYPE));
        RequestSpecification request = new RequestBuilder(new RequestBody(body), new RequestHeaders(headers)).getRequest().cookie("no-captcha", "shevelilsa-v-lesu-kolosok--torchit-in-zopi-robota-pen--ego-trahal-mohnatiy-sosok--captchu-vvodit-nemnogo-len");
        Response response = request.post(URL_SIGNIN);
        return response;
    }

}
