package api.request.builder;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import javafx.util.Pair;

import static utility.GlobalVariables.URL;


public class RequestBuilder implements Builder {
    private RequestBody requestBody;
    private RequestHeaders requestHeaders;
    private RequestSpecification request;

    public RequestBuilder(){

       RestAssured.baseURI = URL;
       this.request = RestAssured.given();
       this.request.relaxedHTTPSValidation();
       this.requestHeaders = new RequestHeaders();
       this.requestBody = new RequestBody();

    }

    public RequestBuilder(RequestBody requestBody, RequestHeaders requestHeaders) {

        RestAssured.baseURI = URL;
        this.request = RestAssured.given();
        this.request.relaxedHTTPSValidation();
        this.requestHeaders = requestHeaders;
        this.requestBody = requestBody;

    }

    public RequestBuilder(RequestBody requestBody) {
        RestAssured.baseURI = URL;
        this.request = RestAssured.given();
        this.request.relaxedHTTPSValidation();
        this.requestBody = requestBody;
        this.requestHeaders = new RequestHeaders();

    }

    public void setRequestHeaders(RequestHeaders requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    public void setRequestBody(RequestBody requestBody) {
        this.requestBody = requestBody;
    }

    public RequestSpecification getRequest() {

        this.request.body(requestBody.getRequestParameters().toJSONString());
        for (int counter = 0; counter < requestHeaders.getHeaders().size(); counter++ ){

            Pair header = requestHeaders.getHeaders().get(counter);
            this.request.header(header.getKey().toString(), header.getValue().toString());

        }

        return this.request;

    }
}
