package api.tests;

import api.services.TierOneVerificationService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TierOneVerificationTest {

    private static BaseTest test = new BaseTest();
    private static final int TIME_OUT_SMS_CODE_EXPIRED =  60000;


    private static void localCodeExpireTimeOut(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass(groups = {"smokeIntegration", "regressionIntegration"})
    public static void AfterClass() {
        test.globalPostcondition();
    }

    @BeforeClass(groups = {"smokeIntegration", "regressionIntegration"})
    public static void BeforeClass() {

        test.apiService = new TierOneVerificationService();
        test.globalPrecondition();

    }

    @Test(groups = {"smokeIntegration", "regressionIntegration"})
    public static void positiveSendCodeTierOneVerificationTest() {

        //Negative cases should be implemented
        //Also precondition should be implemented (reset of verification and phone deletion)
        test.requestService.sendCodeTierOneVerificationRequest("+79875374078");
        System.out.println(test.getResponse().body().asString());
        ((TierOneVerificationService) test.apiService).positiveSendCodeTierOneVerificationResponseCheck(test.getResponse());
        localCodeExpireTimeOut(TIME_OUT_SMS_CODE_EXPIRED);

    }

    @Test(groups = {"smokeIntegration", "regressionIntegration"})
    public static void positiveTierOneVerificationTest() {

        //There is should be several different tests: receiving code verification and tier1 performing
        //Also precondition should be implemented (reset of verification and phone deletion)

        test.requestService.sendCodeTierOneVerificationRequest("+79875374078");
        test.requestService.sendTierOneVerificationRequest("Zhenya", "Gorev", "Russian Federation", "+79875374078", "123456");
        System.out.println(test.getResponse().body().asString());
        test.apiService.positiveResponseCheck(test.getResponse());

    }


    @AfterMethod
    public static void shutdown() {

      test.devTool.deleteDeletePhoneRequest();
    }



}
