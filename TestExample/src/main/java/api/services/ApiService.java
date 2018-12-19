package api.services;

import io.restassured.response.Response;

public abstract class ApiService {

    public abstract void positiveResponseCheck(Response response);

  //  public abstract void negativeResponseCheck(Response response, String errMsg);


}
