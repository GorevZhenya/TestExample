package api.services;

import api.response.models.SignInPositiveResponse;
import api.response.models.SignUpPositiveResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import utility.SignUpUtility;

public class SignUpService extends ApiService {

    private SignUpUtility utility = new SignUpUtility();

    public void positiveResponseCheck(Response response){

        SignUpPositiveResponse positiveResponse = response.body().as(SignUpPositiveResponse.class);
        Assert.assertTrue(positiveResponse.getResult());

    }

    public void positiveResponseCheckOfAuthorization(Response response) {

        SignInPositiveResponse positiveResponse = response.body().as(SignInPositiveResponse.class);
        Assert.assertTrue(positiveResponse.getResult());
        Assert.assertEquals(positiveResponse.getData().getStatus(), "OK");

    }

    public void createAliasForNewEmail() {

        utility.createAlias();

    }

    public void confirmEmailRegistration() {

        utility.confirmRegistration();

    }

    public void checkEmailSignUpConfirmed() {

        utility.checkEmailSignUpConfirmed();

    }

    public String getEmailAlias() {

        return utility.getAliasMail();

    }

    public String getPassword() {

        return utility.getPassword();

    }

}
