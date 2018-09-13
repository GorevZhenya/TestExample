package api.methods;

import api.response.models.OrderCreationNegativeResponse;
import api.response.models.OrderCreationSuccessResponse;
import io.restassured.response.Response;
import org.testng.Assert;

public class ResponseChecks {
    public static void createOrderPositiveResponseCheck(Response response) {

            OrderCreationSuccessResponse successResponse = response.body().as(OrderCreationSuccessResponse.class);
            Assert.assertTrue(successResponse.getResult());

    }

    public static void createOrderNegativeResponseCheck(Response response, String errMsg) {

            OrderCreationNegativeResponse errorResponse = response.body().as(OrderCreationNegativeResponse.class);
            Assert.assertFalse(errorResponse.getResult());
            Assert.assertEquals(errorResponse.getError(), errMsg);
    }


}
