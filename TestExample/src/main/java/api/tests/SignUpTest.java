package api.tests;

import api.services.SignUpService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static utility.GlobalVariables.*;

public class SignUpTest {

    private static BaseTest test = new BaseTest();

    @BeforeClass(groups = {"smokeIntegration", "regressionIntegration"})
    public static void configure() {

        test.apiService = new SignUpService();

    }

    //Positive test for sign up.
    @Test(groups = {"smokeIntegration", "regressionIntegration"})
    public static void positiveSignUpTest() {

        ((SignUpService) test.apiService).createAliasForNewEmail();
        test.requestService.sendSignUpRequest("true", ((SignUpService) test.apiService).getEmailAlias(), ((SignUpService) test.apiService).getPassword());
        test.apiService.positiveResponseCheck(test.getResponse());
        ((SignUpService) test.apiService).confirmEmailRegistration();
        ((SignUpService) test.apiService).checkEmailSignUpConfirmed();
        test.devTool.postSetSignInTokenRequest(((SignUpService) test.apiService).getEmailAlias(), SIGN_IN_TOKEN);
        test.requestService.sendSignInRequest(((SignUpService) test.apiService).getEmailAlias(), ((SignUpService) test.apiService).getPassword());
        ((SignUpService) test.apiService).positiveResponseCheckOfAuthorization(test.getResponse());

    }


    @AfterMethod
    public static void shutdown() {
        test.globalPostcondition();
    }

}
