package api.services;

import api.response.models.TierOnePhoneSendingPositiveResponse;
import api.response.models.TierOneVerificationPositiveResponse;
import io.restassured.response.Response;
import org.testng.Assert;

public class TierOneVerificationService extends ApiService{

    public void positiveResponseCheck(Response response){

        TierOneVerificationPositiveResponse positiveResponse = response.body().as(TierOneVerificationPositiveResponse.class);
        Assert.assertTrue(positiveResponse.getResult());

    }

    public void positiveSendCodeTierOneVerificationResponseCheck(Response response) {

        TierOnePhoneSendingPositiveResponse positiveResponse = response.body().as(TierOnePhoneSendingPositiveResponse.class);
        Assert.assertTrue(positiveResponse.getResult());

    }

    public void negativeResponseCheck(Response response, String errMsg) {

    }

    public void negativeSendCodeTierOneVerificationResponseCheck(Response response, String errMsg) {



    }



}
