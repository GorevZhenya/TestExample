package api.methods;

import api.request.builder.RequestBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static utility.GlobalVariables.URL_SIGNOUT;

public class SignOutRequest {
    public static Response signOutRequest() {
        RequestSpecification request = new RequestBuilder().getRequest();
        Response response = request.post(URL_SIGNOUT);
        return response;
    }
}
