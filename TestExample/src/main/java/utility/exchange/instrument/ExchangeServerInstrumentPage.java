package utility.exchange.instrument;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExchangeServerInstrumentPage {

    private static WebElement element = null;

    //Elements for Trading Flag setting.
    public static By drpdwn_SelectTradingFlagXCCXLocator = By.cssSelector("form[action='updateTradingFlag.jsp'] select[name='matcher']");
    public static By drpdwn_SelectTradingFlagBchBtcLocator = By.cssSelector("form[action='updateTradingFlag.jsp'] select[name='BCH/BTC']");
    public static By drpdwn_SelectTradingFlagBchEonLocator = By.cssSelector("form[action='updateTradingFlag.jsp'] select[name='BCH/EON']");
    public static By drpdwn_SelectTradingFlagBtcEonLocator = By.cssSelector("form[action='updateTradingFlag.jsp'] select[name='BTC/EON']");
    public static By drpdwn_SelectTradingFlagEtcBtcLocator = By.cssSelector("form[action='updateTradingFlag.jsp'] select[name='ETC/BTC']");
    public static By drpdwn_SelectTradingFlagEtcEonLocator = By.cssSelector("form[action='updateTradingFlag.jsp'] select[name='ETC/EON']");
    public static By drpdwn_SelectTradingFlagEthBtcLocator = By.cssSelector("form[action='updateTradingFlag.jsp'] select[name='ETH/BTC']");
    public static By drpdwn_SelectTradingFlagEthEonLocator = By.cssSelector("form[action='updateTradingFlag.jsp'] select[name='ETH/EON']");

    public static By btn_UpdateTradingFlagXCCXLocator = By.xpath("/html/body/font/table/tbody/tr[2]/td[4]/form/input");
    public static By btn_UpdateTradingFlagBchBtcLocator = By.xpath(".//a[contains(text(),'BCH/BTC')]/../../td[4]/form/input");
    public static By btn_UpdateTradingFlagBchEonLocator = By.xpath(".//a[contains(text(),'BCH/EON')]/../../td[4]/form/input");
    public static By btn_UpdateTradingFlagBtcEonLocator = By.xpath(".//a[contains(text(),'BTC/EON')]/../../td[4]/form/input");
    public static By btn_UpdateTradingFlagEtcBtcLocator = By.xpath(".//a[contains(text(),'ETC/BTC')]/../../td[4]/form/input");
    public static By btn_UpdateTradingFlagEtcEonLocator = By.xpath(".//a[contains(text(),'ETC/EON')]/../../td[4]/form/input");
    public static By btn_UpdateTradingFlagEthBtcLocator = By.xpath(".//a[contains(text(),'ETH/BTC')]/../../td[4]/form/input");
    public static By btn_UpdateTradingFlagEthEonLocator = By.xpath(".//a[contains(text(),'ETH/EON')]/../../td[4]/form/input");

    //Elements for Generator switching on/off and setting liquidity.
    public static By drpdwn_SelectGeneratorBchBtcLocator = By.xpath("/html/body/font/table/tbody/tr[3]/td[8]/form/select");
    public static By drpdwn_SelectGeneratorBchEonLocator = By.xpath("/html/body/font/table/tbody/tr[4]/td[8]/form/select");
    public static By drpdwn_SelectGeneratorBtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[5]/td[8]/form/select");
    public static By drpdwn_SelectGeneratorEtcBtcLocator = By.xpath("/html/body/font/table/tbody/tr[6]/td[8]/form/select");
    public static By drpdwn_SelectGeneratorEtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[7]/td[8]/form/select");
    public static By drpdwn_SelectGeneratorEthBtcLocator = By.xpath("/html/body/font/table/tbody/tr[8]/td[8]/form/select");
    public static By drpdwn_SelectGeneratorEthEonLocator = By.xpath("/html/body/font/table/tbody/tr[9]/td[8]/form/select");

    public static By txtbx_DivisorGeneratorBchBtcLocator = By.xpath("/html/body/font/table/tbody/tr[3]/td[8]/form/input[2]");
    public static By txtbx_DivisorGeneratorBchEonLocator = By.xpath("/html/body/font/table/tbody/tr[4]/td[8]/form/input[2]");
    public static By txtbx_DivisorGeneratorBtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[5]/td[8]/form/input[2]");
    public static By txtbx_DivisorGeneratorEtcBtcLocator = By.xpath("/html/body/font/table/tbody/tr[6]/td[8]/form/input[2]");
    public static By txtbx_DivisorGeneratorEtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[7]/td[8]/form/input[2]");
    public static By txtbx_DivisorGeneratorEthBtcLocator = By.xpath("/html/body/font/table/tbody/tr[8]/td[8]/form/input[2]");
    public static By txtbx_DivisorGeneratorEthEonLocator = By.xpath("/html/body/font/table/tbody/tr[9]/td[8]/form/input[2]");

    public static By txtbx_PriceGeneratorBchBtcLocator = By.xpath("/html/body/font/table/tbody/tr[3]/td[8]/form/input[3]");
    public static By txtbx_PriceGeneratorBchEonLocator = By.xpath("/html/body/font/table/tbody/tr[4]/td[8]/form/input[3]");
    public static By txtbx_PriceGeneratorBtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[5]/td[8]/form/input[3]");
    public static By txtbx_PriceGeneratorEtcBtcLocator = By.xpath("/html/body/font/table/tbody/tr[6]/td[8]/form/input[3]");
    public static By txtbx_PriceGeneratorEtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[7]/td[8]/form/input[3]");
    public static By txtbx_PriceGeneratorEthBtcLocator = By.xpath("/html/body/font/table/tbody/tr[8]/td[8]/form/input[3]");
    public static By txtbx_PriceGeneratorEthEonLocator = By.xpath("/html/body/font/table/tbody/tr[9]/td[8]/form/input[3]");

    public static By chkbx_GeneratorBchBtcLocator = By.xpath("/html/body/font/table/tbody/tr[3]/td[8]/form/input[4]");
    public static By chkbx_GeneratorBchEonLocator = By.xpath("/html/body/font/table/tbody/tr[4]/td[8]/form/input[4]");
    public static By chkbx_GeneratorBtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[5]/td[8]/form/input[4]");
    public static By chkbx_GeneratorEtcBtcLocator = By.xpath("/html/body/font/table/tbody/tr[6]/td[8]/form/input[4]");
    public static By chkbx_GeneratorEtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[7]/td[8]/form/input[4]");
    public static By chkbx_GeneratorEthBtcLocator = By.xpath("/html/body/font/table/tbody/tr[8]/td[8]/form/input[4]");
    public static By chkbx_GeneratorEthEonLocator = By.xpath("/html/body/font/table/tbody/tr[9]/td[8]/form/input[4]");

    public static By txtbx_ActiveWorksGeneratorBchBtcLocator = By.xpath("/html/body/font/table/tbody/tr[3]/td[8]/form/input[5]");
    public static By txtbx_ActiveWorksGeneratorBchEonLocator = By.xpath("/html/body/font/table/tbody/tr[4]/td[8]/form/input[5]");
    public static By txtbx_ActiveWorksGeneratorBtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[5]/td[8]/form/input[5]");
    public static By txtbx_ActiveWorksGeneratorEtcBtcLocator = By.xpath("/html/body/font/table/tbody/tr[6]/td[8]/form/input[5]");
    public static By txtbx_ActiveWorksGeneratorEtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[7]/td[8]/form/input[5]");
    public static By txtbx_ActiveWorksGeneratorEthBtcLocator = By.xpath("/html/body/font/table/tbody/tr[8]/td[8]/form/input[5]");
    public static By txtbx_ActiveWorksGeneratorEthEonLocator = By.xpath("/html/body/font/table/tbody/tr[9]/td[8]/form/input[5]");

    public static By txtbx_PassiveWorksGeneratorBchBtcLocator = By.xpath("/html/body/font/table/tbody/tr[3]/td[8]/form/input[6]");
    public static By txtbx_PassiveWorksGeneratorBchEonLocator = By.xpath("/html/body/font/table/tbody/tr[4]/td[8]/form/input[6]");
    public static By txtbx_PassiveWorksGeneratorBtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[5]/td[8]/form/input[6]");
    public static By txtbx_PassiveWorksGeneratorEtcBtcLocator = By.xpath("/html/body/font/table/tbody/tr[6]/td[8]/form/input[6]");
    public static By txtbx_PassiveWorksGeneratorEtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[7]/td[8]/form/input[6]");
    public static By txtbx_PassiveWorksGeneratorEthBtcLocator = By.xpath("/html/body/font/table/tbody/tr[8]/td[8]/form/input[6]");
    public static By txtbx_PassiveWorksGeneratorEthEonLocator = By.xpath("/html/body/font/table/tbody/tr[9]/td[8]/form/input[6]");

    public static By btn_UpdateGeneratorBchBtcLocator = By.xpath("/html/body/font/table/tbody/tr[3]/td[8]/form/input[7]");
    public static By btn_UpdateGeneratorBchEonLocator = By.xpath("/html/body/font/table/tbody/tr[4]/td[8]/form/input[7]");
    public static By btn_UpdateGeneratorBtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[5]/td[8]/form/input[7]");
    public static By btn_UpdateGeneratorEtcBtcLocator = By.xpath("/html/body/font/table/tbody/tr[6]/td[8]/form/input[7]");
    public static By btn_UpdateGeneratorEtcEonLocator = By.xpath("/html/body/font/table/tbody/tr[7]/td[8]/form/input[7]");
    public static By btn_UpdateGeneratorEthBtcLocator = By.xpath("/html/body/font/table/tbody/tr[8]/td[8]/form/input[7]");
    public static By btn_UpdateGeneratorEthEonLocator = By.xpath("/html/body/font/table/tbody/tr[9]/td[8]/form/input[7]");



    public static WebElement drpdwn_SelectTradingFlagXCCX(WebDriver driver){
        element = driver.findElement(drpdwn_SelectTradingFlagXCCXLocator);
        return element;
    }

    public static WebElement drpdwn_SelectTradingFlagBchBtc(WebDriver driver){
        element = driver.findElement(drpdwn_SelectTradingFlagBchBtcLocator);
        return element;
    }

    public static WebElement drpdwn_SelectTradingFlagBchEon(WebDriver driver){
        element = driver.findElement(drpdwn_SelectTradingFlagBchEonLocator);
        return element;
    }

    public static WebElement drpdwn_SelectTradingFlagBtcEon(WebDriver driver){
        element = driver.findElement(drpdwn_SelectTradingFlagBtcEonLocator);
        return element;
    }

    public static WebElement drpdwn_SelectTradingFlagEtcBtc(WebDriver driver){
        element = driver.findElement(drpdwn_SelectTradingFlagEtcBtcLocator);
        return element;
    }

    public static WebElement drpdwn_SelectTradingFlagEtcEon(WebDriver driver){
        element = driver.findElement(drpdwn_SelectTradingFlagEtcEonLocator);
        return element;
    }

    public static WebElement drpdwn_SelectTradingFlagEthBtc(WebDriver driver){
        element = driver.findElement(drpdwn_SelectTradingFlagEthBtcLocator);
        return element;
    }

    public static WebElement drpdwn_SelectTradingFlagEthEon(WebDriver driver){
        element = driver.findElement(drpdwn_SelectTradingFlagEthEonLocator);
        return element;
    }

    public static WebElement btn_UpdateTradingFlagXCCX(WebDriver driver){
        element = driver.findElement(btn_UpdateTradingFlagXCCXLocator);
        return element;
    }

    public static WebElement btn_UpdateTradingFlagBchBtc(WebDriver driver){
        element = driver.findElement(btn_UpdateTradingFlagBchBtcLocator);
        return element;
    }

    public static WebElement btn_UpdateTradingFlagBchEon(WebDriver driver){
        element = driver.findElement(btn_UpdateTradingFlagBchEonLocator);
        return element;
    }

    public static WebElement btn_UpdateTradingFlagBtcEon(WebDriver driver){
        element = driver.findElement(btn_UpdateTradingFlagBtcEonLocator);
        return element;
    }

    public static WebElement btn_UpdateTradingFlagEtcBtc(WebDriver driver){
        element = driver.findElement(btn_UpdateTradingFlagEtcBtcLocator);
        return element;
    }

    public static WebElement btn_UpdateTradingFlagEtcEon(WebDriver driver){
        element = driver.findElement(btn_UpdateTradingFlagEtcEonLocator);
        return element;
    }

    public static WebElement btn_UpdateTradingFlagEthBtc(WebDriver driver){
        element = driver.findElement(btn_UpdateTradingFlagEthBtcLocator);
        return element;
    }

    public static WebElement btn_UpdateTradingFlagEthEon(WebDriver driver){
        element = driver.findElement(btn_UpdateTradingFlagEthEonLocator);
        return element;
    }


    public static WebElement drpdwn_SelectGeneratorBchBtc(WebDriver driver){
        element = driver.findElement(drpdwn_SelectGeneratorBchBtcLocator);
        return element;
    }

    public static WebElement drpdwn_SelectGeneratorBchEon(WebDriver driver){
        element = driver.findElement(drpdwn_SelectGeneratorBchEonLocator);
        return element;
    }

    public static WebElement drpdwn_SelectGeneratorBtcEon(WebDriver driver){
        element = driver.findElement(drpdwn_SelectGeneratorBtcEonLocator);
        return element;
    }

    public static WebElement drpdwn_SelectGeneratorEtcBtc(WebDriver driver){
        element = driver.findElement(drpdwn_SelectGeneratorEtcBtcLocator);
        return element;
    }

    public static WebElement drpdwn_SelectGeneratorEtcEon(WebDriver driver){
        element = driver.findElement(drpdwn_SelectGeneratorEtcEonLocator);
        return element;
    }

    public static WebElement drpdwn_SelectGeneratorEthBtc(WebDriver driver){
        element = driver.findElement(drpdwn_SelectGeneratorEthBtcLocator);
        return element;
    }

    public static WebElement drpdwn_SelectGeneratorEthEon(WebDriver driver){
        element = driver.findElement(drpdwn_SelectGeneratorEthEonLocator);
        return element;
    }

    public static WebElement txtbx_DivisorGeneratorBchBtc(WebDriver driver){
        element = driver.findElement(txtbx_DivisorGeneratorBchBtcLocator);
        return element;
    }

    public static WebElement txtbx_DivisorGeneratorBchEon(WebDriver driver){
        element = driver.findElement(txtbx_DivisorGeneratorBchEonLocator);
        return element;
    }

    public static WebElement txtbx_DivisorGeneratorBtcEon(WebDriver driver){
        element = driver.findElement(txtbx_DivisorGeneratorBtcEonLocator);
        return element;
    }

    public static WebElement txtbx_DivisorGeneratorEtcBtc(WebDriver driver){
        element = driver.findElement(txtbx_DivisorGeneratorEtcBtcLocator);
        return element;
    }

    public static WebElement txtbx_DivisorGeneratorEtcEon(WebDriver driver){
        element = driver.findElement(txtbx_DivisorGeneratorEtcEonLocator);
        return element;
    }

    public static WebElement txtbx_DivisorGeneratorEthBtc(WebDriver driver){
        element = driver.findElement(txtbx_DivisorGeneratorEthBtcLocator);
        return element;
    }

    public static WebElement txtbx_DivisorGeneratorEthEon(WebDriver driver){
        element = driver.findElement(txtbx_DivisorGeneratorEthEonLocator);
        return element;
    }


    public static WebElement txtbx_PriceGeneratorBchBtc(WebDriver driver){
        element = driver.findElement(txtbx_PriceGeneratorBchBtcLocator);
        return element;
    }

    public static WebElement txtbx_PriceGeneratorBchEon(WebDriver driver){
        element = driver.findElement(txtbx_PriceGeneratorBchEonLocator);
        return element;
    }

    public static WebElement txtbx_PriceGeneratorBtcEon(WebDriver driver){
        element = driver.findElement(txtbx_PriceGeneratorBtcEonLocator);
        return element;
    }

    public static WebElement txtbx_PriceGeneratorEtcBtc(WebDriver driver){
        element = driver.findElement(txtbx_PriceGeneratorEtcBtcLocator);
        return element;
    }

    public static WebElement txtbx_PriceGeneratorEtcEon(WebDriver driver){
        element = driver.findElement(txtbx_PriceGeneratorEtcEonLocator);
        return element;
    }

    public static WebElement txtbx_PriceGeneratorEthBtc(WebDriver driver){
        element = driver.findElement(txtbx_PriceGeneratorEthBtcLocator);
        return element;
    }

    public static WebElement txtbx_PriceGeneratorEthEon(WebDriver driver){
        element = driver.findElement(txtbx_PriceGeneratorEthEonLocator);
        return element;
    }


    public static WebElement chkbx_GeneratorBchBtc(WebDriver driver){
        element = driver.findElement(chkbx_GeneratorBchBtcLocator);
        return element;
    }

    public static WebElement chkbx_GeneratorBchEon(WebDriver driver){
        element = driver.findElement(chkbx_GeneratorBchEonLocator);
        return element;
    }

    public static WebElement chkbx_GeneratorBtcEon(WebDriver driver){
        element = driver.findElement(chkbx_GeneratorBtcEonLocator);
        return element;
    }

    public static WebElement chkbx_GeneratorEtcBtc(WebDriver driver){
        element = driver.findElement(chkbx_GeneratorEtcBtcLocator);
        return element;
    }

    public static WebElement chkbx_GeneratorEtcEon(WebDriver driver){
        element = driver.findElement(chkbx_GeneratorEtcEonLocator);
        return element;
    }

    public static WebElement chkbx_GeneratorEthBtc(WebDriver driver){
        element = driver.findElement(chkbx_GeneratorEthBtcLocator);
        return element;
    }

    public static WebElement chkbx_GeneratorEthEon(WebDriver driver){
        element = driver.findElement(chkbx_GeneratorEthEonLocator);
        return element;
    }

    public static WebElement txtbx_ActiveWorksGeneratorBchBtc(WebDriver driver){
        element = driver.findElement(txtbx_ActiveWorksGeneratorBchBtcLocator);
        return element;
    }

    public static WebElement txtbx_ActiveWorksGeneratorBchEon(WebDriver driver){
        element = driver.findElement(txtbx_ActiveWorksGeneratorBchEonLocator);
        return element;
    }

    public static WebElement txtbx_ActiveWorksGeneratorBtcEon(WebDriver driver){
        element = driver.findElement(txtbx_ActiveWorksGeneratorBtcEonLocator);
        return element;
    }

    public static WebElement txtbx_ActiveWorksGeneratorEtcBtc(WebDriver driver){
        element = driver.findElement(txtbx_ActiveWorksGeneratorEtcBtcLocator);
        return element;
    }

    public static WebElement txtbx_ActiveWorksGeneratorEtcEon(WebDriver driver){
        element = driver.findElement(txtbx_ActiveWorksGeneratorEtcEonLocator);
        return element;
    }

    public static WebElement txtbx_ActiveWorksGeneratorEthBtc(WebDriver driver){
        element = driver.findElement(txtbx_ActiveWorksGeneratorEthBtcLocator);
        return element;
    }

    public static WebElement txtbx_ActiveWorksGeneratorEthEon(WebDriver driver){
        element = driver.findElement(txtbx_ActiveWorksGeneratorEthEonLocator);
        return element;
    }


    public static WebElement txtbx_PassiveWorksGeneratorBchBtc(WebDriver driver){
        element = driver.findElement(txtbx_PassiveWorksGeneratorBchBtcLocator);
        return element;
    }

    public static WebElement txtbx_PassiveWorksGeneratorBchEon(WebDriver driver){
        element = driver.findElement(txtbx_PassiveWorksGeneratorBchEonLocator);
        return element;
    }

    public static WebElement txtbx_PassiveWorksGeneratorBtcEon(WebDriver driver){
        element = driver.findElement(txtbx_PassiveWorksGeneratorBtcEonLocator);
        return element;
    }

    public static WebElement txtbx_PassiveWorksGeneratorEtcBtc(WebDriver driver){
        element = driver.findElement(txtbx_PassiveWorksGeneratorEtcBtcLocator);
        return element;
    }

    public static WebElement txtbx_PassiveWorksGeneratorEtcEon(WebDriver driver){
        element = driver.findElement(txtbx_PassiveWorksGeneratorEtcEonLocator);
        return element;
    }

    public static WebElement txtbx_PassiveWorksGeneratorEthBtc(WebDriver driver){
        element = driver.findElement(txtbx_PassiveWorksGeneratorEthBtcLocator);
        return element;
    }

    public static WebElement txtbx_PassiveWorksGeneratorEthEon(WebDriver driver){
        element = driver.findElement(txtbx_PassiveWorksGeneratorEthEonLocator);
        return element;
    }


    public static WebElement btn_UpdateGeneratorBchBtc(WebDriver driver){
        element = driver.findElement(btn_UpdateGeneratorBchBtcLocator);
        return element;
    }

    public static WebElement btn_UpdateGeneratorBchEon(WebDriver driver){
        element = driver.findElement(btn_UpdateGeneratorBchEonLocator);
        return element;
    }

    public static WebElement btn_UpdateGeneratorBtcEon(WebDriver driver){
        element = driver.findElement(btn_UpdateGeneratorBtcEonLocator);
        return element;
    }

    public static WebElement btn_UpdateGeneratorEtcBtc(WebDriver driver){
        element = driver.findElement(btn_UpdateGeneratorEtcBtcLocator);
        return element;
    }

    public static WebElement btn_UpdateGeneratorEtcEon(WebDriver driver){
        element = driver.findElement(btn_UpdateGeneratorEtcEonLocator);
        return element;
    }

    public static WebElement btn_UpdateGeneratorEthBtc(WebDriver driver){
        element = driver.findElement(btn_UpdateGeneratorEthBtcLocator);
        return element;
    }

    public static WebElement btn_UpdateGeneratorEthEon(WebDriver driver){
        element = driver.findElement(btn_UpdateGeneratorEthEonLocator);
        return element;
    }

}
