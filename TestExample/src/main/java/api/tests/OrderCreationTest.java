package api.tests;

import api.services.OrderCreationService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrderCreationTest {

    private static BaseTest test = new BaseTest();

    @AfterClass(groups = {"smokeIntegration", "regressionIntegration"})
    public static void shutdown() {
        test.globalPostcondition();
    }

    @BeforeClass(groups = {"smokeIntegration", "regressionIntegration"})
    public static void configure() {
        test.apiService = new OrderCreationService();
        test.globalPrecondition();
    }

    //Test for creating correct Limit Order
    @Test(dataProvider = "createLimitOrderPositiveTest", groups = {"smokeIntegration", "regressionIntegration"})
    public static void createLimitOrderPositiveTest(String operation, String instrument, String type, String market, String limitPrice, String quantity) {

        test.requestService.sendLimitOrderCreationRequest(operation, instrument, type, market, limitPrice, quantity);
        test.apiService.positiveResponseCheck(test.getResponse());


    }

    //Test for creating incorrect Limit Order
    @Test(dataProvider = "createLimitOrderNegativeTest", groups = {"smokeIntegration", "regressionIntegration"})
    public static void createLimitOrderNegativeTest(String operation, String instrument, String type, String market, String limitPrice, String quantity, String errMsg) {

        test.requestService.sendLimitOrderCreationRequest(operation, instrument, type, market, limitPrice, quantity);
        ((OrderCreationService) test.apiService).negativeResponseCheck(test.getResponse(), errMsg);

    }


    //Provider of test data for positive test
    @DataProvider(name = "createLimitOrderPositiveTest")
    public Object[][] createLimitOrderPositiveTestData() {
        return new Object[][] {

                {"BUY", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.001", "1"},
                {"BUY", "ETCBTC", "OPEN_LIMIT", "XCCX", "0.001", "1"},

                {"BUY", "ETHBTC", "OPEN_LIMIT", "XCCX", "0.001", "1"},
                {"BUY", "BTCEON", "OPEN_LIMIT", "XCCX", "100", "1"},
                {"BUY", "BCHEON", "OPEN_LIMIT", "XCCX", "10", "1"},
                {"BUY", "ETCEON", "OPEN_LIMIT", "XCCX", "0.1", "1"},
                {"BUY", "ETHEON", "OPEN_LIMIT", "XCCX", "1", "1"},

                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.001", "1"},
                {"SELL", "ETCBTC", "OPEN_LIMIT", "XCCX", "0.001", "1"},
                {"SELL", "ETHBTC", "OPEN_LIMIT", "XCCX", "0.001", "1"},
                {"SELL", "BTCEON", "OPEN_LIMIT", "XCCX", "100", "1"},
                {"SELL", "BCHEON", "OPEN_LIMIT", "XCCX", "10", "1"},
                {"SELL", "ETCEON", "OPEN_LIMIT", "XCCX", "0.1", "1"},
                {"SELL", "ETHEON", "OPEN_LIMIT", "XCCX", "1", "1"},

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

                {"BUY", "ETCBTC", "OPEN_LIMIT", "XCCX", "0.1", "10001", "Quantity has to be not greater than 10000"},
                {"BUY", "ETCBTC", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.1"},
                {"BUY", "ETCBTC", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.1"},
                {"BUY", "ETCBTC", "OPEN_LIMIT", "XCCX", "999999", "10000", "Not enough funds."},

                {"BUY", "ETHBTC", "OPEN_LIMIT", "XCCX", "0.1", "1001", "Quantity has to be not greater than 1000"},
                {"BUY", "ETHBTC", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.01"},
                {"BUY", "ETHBTC", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.01"},
                {"BUY", "ETHBTC", "OPEN_LIMIT", "XCCX", "999999", "1000", "Not enough funds."},

                {"BUY", "BTCEON", "OPEN_LIMIT", "XCCX", "0.1", "11", "Quantity has to be not greater than 10"},
                {"BUY", "BTCEON", "OPEN_LIMIT", "XCCX", "0.1", "0.00001", "Quantity has to be a multiple of 0.0001"},
                {"BUY", "BTCEON", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.0001"},
                {"BUY", "BTCEON", "OPEN_LIMIT", "XCCX", "999999", "10", "Not enough funds."},

                {"BUY", "BCHEON", "OPEN_LIMIT", "XCCX", "0.1", "101", "Quantity has to be not greater than 100"},
                {"BUY", "BCHEON", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.001"},
                {"BUY", "BCHEON", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.001"},
                {"BUY", "BCHEON", "OPEN_LIMIT", "XCCX", "999999", "100", "Not enough funds."},

                {"BUY", "ETCEON", "OPEN_LIMIT", "XCCX", "0.1", "10001", "Quantity has to be not greater than 10000"},
                {"BUY", "ETCEON", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.1"},
                {"BUY", "ETCEON", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.1"},
                {"BUY", "ETCEON", "OPEN_LIMIT", "XCCX", "999999", "10000", "Not enough funds."},

                {"BUY", "ETHEON", "OPEN_LIMIT", "XCCX", "0.1", "1001", "Quantity has to be not greater than 1000"},
                {"BUY", "ETHEON", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.01"},
                {"BUY", "ETHEON", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.01"},
                {"BUY", "ETHEON", "OPEN_LIMIT", "XCCX", "999999", "1000", "Not enough funds."},



                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "101", "Quantity has to be not greater than 100"},
                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.001"},
                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.001"},
                {"SELL", "BCHBTC", "OPEN_LIMIT", "XCCX", "999999", "100", "Not enough funds."},

                {"SELL", "ETCBTC", "OPEN_LIMIT", "XCCX", "0.1", "10001", "Quantity has to be not greater than 10000"},
                {"SELL", "ETCBTC", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.1"},
                {"SELL", "ETCBTC", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.1"},
                {"SELL", "ETCBTC", "OPEN_LIMIT", "XCCX", "999999", "10000", "Not enough funds."},

                {"SELL", "ETHBTC", "OPEN_LIMIT", "XCCX", "0.1", "1001", "Quantity has to be not greater than 1000"},
                {"SELL", "ETHBTC", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.01"},
                {"SELL", "ETHBTC", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.01"},
                {"SELL", "ETHBTC", "OPEN_LIMIT", "XCCX", "999999", "1000", "Not enough funds."},

                {"SELL", "BTCEON", "OPEN_LIMIT", "XCCX", "0.1", "11", "Quantity has to be not greater than 10"},
                {"SELL", "BTCEON", "OPEN_LIMIT", "XCCX", "0.1", "0.00001", "Quantity has to be a multiple of 0.0001"},
                {"SELL", "BTCEON", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.0001"},
                {"SELL", "BTCEON", "OPEN_LIMIT", "XCCX", "999999", "10", "Not enough funds."},

                {"SELL", "BCHEON", "OPEN_LIMIT", "XCCX", "0.1", "101", "Quantity has to be not greater than 100"},
                {"SELL", "BCHEON", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.001"},
                {"SELL", "BCHEON", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.001"},
                {"SELL", "BCHEON", "OPEN_LIMIT", "XCCX", "999999", "100", "Not enough funds."},

                {"SELL", "ETCEON", "OPEN_LIMIT", "XCCX", "0.1", "10001", "Quantity has to be not greater than 10000"},
                {"SELL", "ETCEON", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.1"},
                {"SELL", "ETCEON", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.1"},
                {"SELL", "ETCEON", "OPEN_LIMIT", "XCCX", "999999", "10000", "Not enough funds."},

                {"SELL", "ETHEON", "OPEN_LIMIT", "XCCX", "0.1", "1001", "Quantity has to be not greater than 1000"},
                {"SELL", "ETHEON", "OPEN_LIMIT", "XCCX", "0.1", "0.0001", "Quantity has to be a multiple of 0.01"},
                {"SELL", "ETHEON", "OPEN_LIMIT", "XCCX", "0.1", "1.00000001", "Quantity has to be a multiple of 0.01"},
                {"SELL", "ETHEON", "OPEN_LIMIT", "XCCX", "999999", "1000", "Not enough funds."},


        };
    }
}
