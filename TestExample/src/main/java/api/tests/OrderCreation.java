package api.tests;

import api.common.procedures.PostconditionFactory;
import api.common.procedures.PreconditionFactory;
import api.methods.ResponseChecks;
import io.restassured.response.Response;
import org.testng.annotations.*;
import static api.methods.LimitOrderCreationRequest.createLimitOrderRequest;


public class OrderCreation {

    private final PreconditionFactory preconditionFactory = new PreconditionFactory();
    private final PostconditionFactory postconditionFactory = new PostconditionFactory();


    //Sign IN request is executed for getting SESSION_ID cookie.
    @BeforeClass(groups = {"smokeIntegration", "regressionIntegration"})
    public void configure() {
        preconditionFactory.globalPrecondition();
    }

    //Sign OUT request is executed.
    @AfterClass(groups = {"smokeIntegration", "regressionIntegration"})
    public void shutdown() {
        postconditionFactory.globalPostcondition();
    }

    //Test for creating correct Limit Order
    @Test(dataProvider = "createLimitOrderPositiveTest", groups = {"smokeIntegration", "regressionIntegration"})
    public static void createLimitOrderPositiveTest(String operation, String instrument, String type, String market, String limitPrice, String quantity) {

        Response response = createLimitOrderRequest(operation, instrument, type, market, limitPrice, quantity);
        ResponseChecks.createOrderPositiveResponseCheck(response);

    }

    //Test for creating incorrect Limit Order
    @Test(dataProvider = "createLimitOrderNegativeTest", groups = {"smokeIntegration", "regressionIntegration"})
    public static void createLimitOrderNegativeTest(String operation, String instrument, String type, String market, String limitPrice, String quantity, String errMsg) {

        Response response = createLimitOrderRequest(operation, instrument, type, market, limitPrice, quantity);
        ResponseChecks.createOrderNegativeResponseCheck(response, errMsg);

    }

    //Provider of test data for positive test
    @DataProvider(name = "createLimitOrderPositiveTest")
    public Object[][] createLimitOrderPositiveTestData() {
        return new Object[][]{

                {"BUY", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.001", "1"},
                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.001", "1"},

        };
    }

    //Provider of test data for negative test
    @DataProvider(name = "createLimitOrderNegativeTest")
    public Object[][] createLimitOrderNegativeTestData() {
        return new Object[][]{

                {"BUY", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "101", "Quantity has to be not greater than 100"},
                {"BUY", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.001"},
                {"BUY", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.001"},
                {"BUY", "BCHBTC", "OPEN_LIMIT", "XCCX", "999999", "100", "Not enough funds."},

                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "101", "Quantity has to be not greater than 100"},
                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.001"},
                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.001"},
                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "999999", "100", "Not enough funds."},

        };
    }

}

