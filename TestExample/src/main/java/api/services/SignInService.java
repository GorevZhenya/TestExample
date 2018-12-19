package api.services;

import api.response.models.SignInNegativeResponse;
import api.response.models.SignInPositiveResponse;
import io.restassured.response.Response;
import org.testng.Assert;

public class SignInService extends ApiService {

    public void positiveResponseCheck(Response response) {

        SignInPositiveResponse positiveResponse = response.body().as(SignInPositiveResponse.class);
        Assert.assertTrue(positiveResponse.getResult());
        Assert.assertEquals(positiveResponse.getData().getStatus(), "OK");

    }

    public void negativeResponseCheck(Response response, String errMsg) {

        SignInNegativeResponse negativeResponse = response.body().as(SignInNegativeResponse.class);
        Assert.assertFalse(negativeResponse.getResult());
        Assert.assertEquals(negativeResponse.getError(), errMsg);

    }
}
