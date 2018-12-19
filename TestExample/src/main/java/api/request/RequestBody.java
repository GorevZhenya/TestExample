package api.request;

import javafx.util.Pair;
import org.json.simple.JSONObject;

import java.util.List;

public class RequestBody {

    private JSONObject requestParameters;

    public RequestBody(){

        requestParameters = new JSONObject();

    }

    public RequestBody(List<Pair<String, String>> body){

        requestParameters = new JSONObject();
        for (int counter = 0; counter < body.size(); counter++ ){

            Pair<String, String> node =body.get(counter);
            this.requestParameters.put(node.getKey(), node.getValue());

        }

    }

    public JSONObject getRequestParameters(){

        return this.requestParameters;

    }

}
