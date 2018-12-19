package api.request;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import javafx.util.Pair;
import utility.Log;

import static utility.GlobalVariables.URL;


public class RequestBuilder implements Builder {
    private RequestBody requestBody;
    private RequestHeaders requestHeaders;
    private RequestSpecification request;

    public RequestBuilder() {

       RestAssured.baseURI = URL;
       this.request = RestAssured.given();
       this.request.relaxedHTTPSValidation();
       this.requestHeaders = new RequestHeaders();
       Log.info("Request headers parameters are initialized.");
       this.requestBody = new RequestBody();
       Log.info("Request body parameters are initialized.");

    }

    public RequestBuilder(RequestBody requestBody, RequestHeaders requestHeaders) {

        RestAssured.baseURI = URL;
        this.request = RestAssured.given();
        this.request.relaxedHTTPSValidation();
        this.requestHeaders = requestHeaders;
        Log.info("Request headers parameters are initialized.");
        this.requestBody = requestBody;
        Log.info("Request body parameters are initialized.");

    }

    public RequestBuilder(RequestBody requestBody) {
        RestAssured.baseURI = URL;
        this.request = RestAssured.given();
        this.request.relaxedHTTPSValidation();
        this.requestBody = requestBody;
        Log.info("Request body parameters are initialized.");
        this.requestHeaders = new RequestHeaders();
        Log.info("Request headers parameters are initialized.");

    }

    public RequestBuilder(RequestHeaders headers) {

        RestAssured.baseURI = URL;
        this.request = RestAssured.given();
        this.request.relaxedHTTPSValidation();
        requestBody = new RequestBody();
        requestHeaders = headers;

    }

    public void setRequestHeaders(RequestHeaders requestHeaders) {
        this.requestHeaders = requestHeaders;
        Log.info("Request headers parameters are initialized.");
    }

    public void setRequestBody(RequestBody requestBody) {
        this.requestBody = requestBody;
        Log.info("Request body parameters are initialized.");
    }

    public RequestSpecification getRequest() {

        this.request.body(requestBody.getRequestParameters().toJSONString());
        for (int counter = 0; counter < requestHeaders.getHeaders().size(); counter++ ){

            Pair header = requestHeaders.getHeaders().get(counter);
            this.request.header(header.getKey().toString(), header.getValue().toString());

        }

        Log.info("Initialization of request is finished.");
        return this.request;

    }
}
