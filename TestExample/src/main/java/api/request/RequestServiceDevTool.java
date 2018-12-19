package api.request;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import static utility.GlobalVariables.*;

public class RequestServiceDevTool {

    private List<Pair<String, String>> body = new ArrayList<>();
    private List<Pair<String, String>> headers = new ArrayList<>();
    private RequestSpecification request;
    private Response response;
    public String devSessionCookie;


    public Response getResponse(){
        return response;
    }

    public void postSignInRequest(String email, String password) {

        body.add(new Pair<>("email", email));
        body.add(new Pair<>("password", password));
        headers.add(new Pair<>("Content-Type", CONTENT_TYPE));
        request = new RequestBuilder(new RequestBody(body), new RequestHeaders(headers)).getRequest();
        response = request.post(URL_DEV_TOOLS_SIGNIN);
        devSessionCookie = response.getCookie("DEVSESSION");

    }

    private void postSignOutRequest() {

        headers.add(new Pair<>("Content-Type", CONTENT_TYPE));
        request = new RequestBuilder(new RequestHeaders(headers)).getRequest();
        //response = request.post(URL_DEV_TOOLS_SIGNOUT);
        request.post(URL_DEV_TOOLS_SIGNOUT);
        devSessionCookie = null;

    }

    public void deleteDeletePhoneRequest() {

        postSignInRequest(EMAIL, PASSWORD);
        headers.add(new Pair<>("Content-Type", CONTENT_TYPE));
        request = new RequestBuilder(new RequestHeaders(headers)).getRequest().cookie("DEVSESSION", devSessionCookie);
        response = request.delete(URL_DEV_TOOLS_DELETE_PHONE);
        postSignOutRequest();

    }

    public void postSetSignInTokenRequest(String email, String token) {

        postSignInRequest(EMAIL, PASSWORD);
        headers.add(new Pair<>("Content-Type", CONTENT_TYPE));
        body.add(new Pair<>("email", email));
        body.add(new Pair<>("token", token));
        request = new RequestBuilder(new RequestBody(body), new RequestHeaders(headers)).getRequest().cookie("DEVSESSION", devSessionCookie);
        request.contentType(CONTENT_TYPE);
        response = request.post(URL_DEV_TOOLS_SET_SIGNIN_TOKEN);
        postSignOutRequest();

    }


}
