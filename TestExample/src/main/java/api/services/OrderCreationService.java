package api.services;


import api.response.models.OrderCreationNegativeResponse;
import api.response.models.OrderCreationPositiveResponse;
import io.restassured.response.Response;
import org.testng.Assert;


public class OrderCreationService extends ApiService {

public void positiveResponseCheck(Response response) {

    OrderCreationPositiveResponse successResponse = response.body().as(OrderCreationPositiveResponse.class);
    Assert.assertTrue(successResponse.getResult());

}

public void negativeResponseCheck(Response response, String errMsg) {

    OrderCreationNegativeResponse errorResponse = response.body().as(OrderCreationNegativeResponse.class);
    Assert.assertFalse(errorResponse.getResult());
    Assert.assertEquals(errorResponse.getError(), errMsg);

}

public Integer getOrderId (Response response) {

        OrderCreationPositiveResponse successResponse = response.body().as(OrderCreationPositiveResponse.class);
        return successResponse.getData().getId();

}

}
