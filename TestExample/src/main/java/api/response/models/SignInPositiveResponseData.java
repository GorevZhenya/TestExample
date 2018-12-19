package api.response.models;

public class SignInPositiveResponseData implements ResponseModel {
    private String status;
    private String seq;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }
}
