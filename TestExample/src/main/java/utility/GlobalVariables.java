package utility;

public class GlobalVariables {

//Request data variables
    public static final String CONTENT_TYPE = "application/json";
    public static String sessionCookie = "SESSION=b9edc1d0-45db-4c1f-ad6f-87f31aa96ab9";
    public static final String SIGN_IN_TOKEN = "test-token-for-authorization";

//URL variables for integration tests
    public static final String URL = "https://significant_project.com/";
    public static final String URL_ORDER_CREATION = "/orders/create";
    public static final String URL_VERIFICATION_TIER1 = "/user/verify/tier1";
    public static final String URL_SEND_CODE_TIER1 = "/user/verify/send/code";
    public static final String URL_SIGNIN = "/user/signin";
    public static final String URL_SIGNUP = "/user/signup";
    public static final String URL_SIGNOUT = "/user/signout";

//URL variables for UI tests
    public static final String URl_SIGN_IN_PAGE = "/signin";

//Test data variables

    public static final String EMAIL = "test@gmail.com";
    public static final String PASSWORD = "test_Account1";
    public static  Integer Order_ID = 0;
    public static final String USER_PHONE = "+79875374444";

//Dev Tools variables
    public static final String URL_DEV_TOOLS_SIGNIN = "dev/login";
    public static final String URL_DEV_TOOLS_SIGNOUT = "dev/logout";
    public static final String URL_DEV_TOOLS_DELETE_PHONE = "dev/user/phone/" + USER_PHONE + "/";
    public static final String URL_DEV_TOOLS_SET_SIGNIN_TOKEN = "dev/user/captcha";
    public static final String URL_DEV_TOOLS_GET_TOKEN_BOUNTIES_TYPES = "dev/ico/bounties/types";
    public static final String URL_DEV_TOOLS_GET_TOKEN_BOUNTIES = "dev/ico/bounties";
    public static final String URL_DEV_TOOLS_ADD_TOKEN_BOUNTIES = "dev/ico/bounties";
    public static final String URL_DEV_TOOLS_DELETE_TOKEN_BOUNTIES = "dev/ico/bounties/14";
    public static final String URL_DEV_TOOLS_GET_PRELIMINARY_BOUNTIES = "dev/ico/bounties/preliminary";
    public static final String URL_DEV_TOOLS_ADD_PRELIMINARY_BOUNTIES = "dev/ico/bounties/preliminary";
    public static final String URL_DEV_TOOLS_DELETE_PRELIMINARY_BOUNTIES = "dev/ico/bounties/preliminary";
    public static final String URL_DEV_TOOLS_GET_STRESS_BOUNTIES = "dev/ico/bounties/stresstest";
    public static final String URL_DEV_TOOLS_ADD_STRESS_BOUNTIES = "dev/ico/bounties/stresstest";
    public static final String URL_DEV_TOOLS_DELETE_STRESS_BOUNTIES = "dev/ico/bounties/stresstest";
    public static final String URL_DEV_TOOLS_GET_API_CREDENTIALS = "dev/api/credentials/actual";
    public static final String URL_DEV_TOOLS_EXPIRE_API_CREDENTIALS = "dev/api/credentials/the_api_key_uuid/expire";
    public static final String URL_DEV_TOOLS_DELETE_API_CREDENTIALS_BY_APIKEY = "dev/api/credentials/the_api_key_uuid";
    public static final String URL_DEV_TOOLS_DELETE_API_CREDENTIALS_ALL = "dev/api/credentials";
    public static final String URL_DEV_TOOLS_DELETE_VERIFICATION_TIER = "dev/kyc/tier";
    public static final String URL_DEV_TOOLS_CHANGE_VERIFICATION_TIER = "dev/kyc/tier";
    public static final String URL_DEV_TOOLS_CHANGE_BALANCE = " ";

//UTILITY
//Exchange Server Instrument
    public static final String URL_EXCHANGE_SERVER_INSTRUMENT = "stg.com:8980/instruments.jsp";
    public static final String LOGIN_EXCHANGE_SERVER_INSTRUMENT = "a";
    public static final String PASSWORD_EXCHANGE_SERVER_INSTRUMENT = "b";
//Email Server
    public static final String URL_ADMIN_EMAIL_SERVER = "https://mail/login.php";
    public static final String LOGIN_ADMIN_EMAIL_SERVER = "admin@mail.com";
    public static final String PASSWORD_ADMIN_EMAIL_SERVER = "XytGFPhQn";
    public static final String URL_EMAIL_SERVER = "https://mail/round/";


}
