package api.request;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

import static utility.GlobalVariables.*;

public class RequestServiceExchange {

    private List<Pair<String, String>> body = new ArrayList<>();
    private List<Pair<String, String>> headers = new ArrayList<>();
    private RequestSpecification request;
    private Response response;

    public Response getResponse(){

        return response;

    }

    public void sendSignUpRequest(String agreement, String email, String password) {

        body.add(new Pair<>("agreement", agreement));
        body.add(new Pair<>("email", email));
        body.add(new Pair<>("password", password));
        headers.add(new Pair<>("Content-Type", CONTENT_TYPE));
        request = new RequestBuilder(new RequestBody(body), new RequestHeaders(headers)).getRequest().cookie("no-captcha", "1D8DC22B340C3F728A9DD32B7073F27B30CD50144A713779B8CDA4ED36E8F0E9");
        response = request.post(URL_SIGNUP);

    }

    public void sendSignInRequest(String email, String password) {

        body.add(new Pair<>("email", email));
        body.add(new Pair<>("password", password));
        headers.add(new Pair<>("Content-Type", CONTENT_TYPE));
        request = new RequestBuilder(new RequestBody(body), new RequestHeaders(headers)).getRequest().cookie("no-captcha", SIGN_IN_TOKEN);
        response = request.post(URL_SIGNIN);

    }

    public void sendSignOutRequest() {

        request = new RequestBuilder().getRequest();
        response = request.post(URL_SIGNOUT);

    }

    public void sendLimitOrderCreationRequest(String operation, String instrument, String type, String market, String limitPrice, String quantity) {

        body.add(new Pair<>("operation", operation));
        body.add(new Pair<>("instrument", instrument));
        body.add(new Pair<>("type", type));
        body.add(new Pair<>("market", market));
        body.add(new Pair<>("limitPrice", limitPrice));
        body.add(new Pair<>("quantity", quantity));
        request = new RequestBuilder(new RequestBody(body)).getRequest();
        response = request.post(URL_ORDER_CREATION);

    }

    public void sendMarketOrderCreationRequest(String operation, String instrument, String type, String market, String quantity) {

        body.add(new Pair<>("operation", operation));
        body.add(new Pair<>("instrument", instrument));
        body.add(new Pair<>("type", type));
        body.add(new Pair<>("market", market));
        body.add(new Pair<>("quantity", quantity));
        request = new RequestBuilder(new RequestBody(body)).getRequest();
        response = request.post(URL_ORDER_CREATION);

    }

    public void sendCodeTierOneVerificationRequest(String phone) {

        body.add(new Pair<>("phone", phone));
        request = new RequestBuilder(new RequestBody(body)).getRequest();
        response = request.post(URL_SEND_CODE_TIER1);

    }

    public void sendTierOneVerificationRequest(String firstName, String lastName, String country, String phone, String code) {

        body.add(new Pair<>("firstName", firstName));
        body.add(new Pair<>("lastName", lastName));
        body.add(new Pair<>("country", country));
        body.add(new Pair<>("phone", phone));
        body.add(new Pair<>("code", code));
        request = new RequestBuilder(new RequestBody(body)).getRequest();
        response = request.post(URL_VERIFICATION_TIER1);

    }
}
