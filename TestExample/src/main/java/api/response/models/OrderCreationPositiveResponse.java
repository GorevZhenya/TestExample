package api.response.models;

public class OrderCreationPositiveResponse implements ResponseModel {
    private Boolean result;
    private OrderCreationPositiveResponseData data;

    public OrderCreationPositiveResponseData getData() {
        return data;
    }

    public void setData(OrderCreationPositiveResponseData data) {
        this.data = data;
    }


    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}
