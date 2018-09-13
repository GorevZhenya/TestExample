package api.methods;

import api.request.builder.RequestBody;
import api.request.builder.RequestBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;

import static utility.GlobalVariables.URL_ORDER_CREATION;

public class LimitOrderCreationRequest {

    public static Response createLimitOrderRequest(String operation, String instrument, String type, String market, String limitPrice, String quantity) {

        List<Pair<String, String>> body = new ArrayList<>();
        body.add(new Pair<>("operation", operation));
        body.add(new Pair<>("instrument", instrument));
        body.add(new Pair<>("type", type));
        body.add(new Pair<>("market", market));
        body.add(new Pair<>("limitPrice", limitPrice));
        body.add(new Pair<>("quantity", quantity));
        RequestSpecification request = new RequestBuilder(new RequestBody(body)).getRequest();
        Response response = request.post(URL_ORDER_CREATION);
        //ResponseChecks.CreateOrderPositiveResponseCheck(response);
        return response;
    }
}
