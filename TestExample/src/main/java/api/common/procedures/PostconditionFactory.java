package api.common.procedures;

import io.restassured.response.Response;

import static api.methods.SignOutRequest.signOutRequest;
import static utility.GlobalVariables.sessionCookie;

public class PostconditionFactory {
    public void globalPostcondition() {

        Response response = signOutRequest();
        System.out.println(response.statusCode());
        sessionCookie = "";

    }
}
