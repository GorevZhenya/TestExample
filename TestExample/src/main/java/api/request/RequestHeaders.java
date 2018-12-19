package api.request;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

import static utility.GlobalVariables.CONTENT_TYPE;
import static utility.GlobalVariables.sessionCookie;


public class RequestHeaders {

    private List<Pair<String, String>> headers;

    public RequestHeaders() {

        List<Pair<String, String>> headers = new ArrayList<>();
        headers.add(new Pair<>("Content-Type", CONTENT_TYPE));
        headers.add(new Pair<>("Cookie", sessionCookie));
        this.headers = headers;

    }

    public RequestHeaders(List<Pair<String, String>> headers) {

        this.headers = headers;

    }

    public List<Pair<String, String>> getHeaders(){
        return this.headers;
    }

    public void setHeaders(List<Pair<String, String>> headers) {

        this.headers = headers;

    }
}
