package api.common.procedures;

import io.restassured.response.Response;

import static api.methods.SignInRequest.signInRequest;
import static utility.GlobalVariables.EMAIL;
import static utility.GlobalVariables.PASSWORD;
import static utility.GlobalVariables.sessionCookie;

public class PreconditionFactory {
    public void globalPrecondition() {

        Response response = signInRequest(EMAIL, PASSWORD);
        String getSessionCookie = response.getHeader("Set-Cookie");
        String[] sessionCookieWithoutSplit = getSessionCookie.split(";");
        sessionCookie = sessionCookieWithoutSplit[0];

    }
}
