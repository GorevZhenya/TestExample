package api.response.models;

public class SignInPositiveResponse implements ResponseModel {

    private Boolean result;
    private SignInPositiveResponseData data;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public void setData(SignInPositiveResponseData data) {
        this.data = data;
    }

    public SignInPositiveResponseData getData() {
        return data;
    }
}
