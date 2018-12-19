package api.tests;


import api.request.RequestServiceDevTool;
import api.request.RequestServiceExchange;
import api.services.ApiService;
import io.restassured.response.Response;

import static utility.GlobalVariables.*;

public class BaseTest {

    protected ApiService apiService;
    protected RequestServiceExchange requestService = new RequestServiceExchange();
    protected RequestServiceDevTool devTool = new RequestServiceDevTool();

    public Response getResponse(){
        //response = requestService.getResponse();
        return requestService.getResponse();
    }

    protected void globalPrecondition() {

        requestService.sendSignInRequest(EMAIL, PASSWORD);
        String getSessionCookie = requestService.getResponse().getHeader("Set-Cookie");
        String[] sessionCookieWithoutSplit = getSessionCookie.split(";");
        sessionCookie = sessionCookieWithoutSplit[0];

    }



    protected void globalPostcondition() {

        requestService.sendSignOutRequest();
        sessionCookie = "";

    }
}
