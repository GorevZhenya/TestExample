package utility.exchange.instrument;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static utility.GlobalVariables.*;

public class ExchangeServerInstrumentService {

    private WebDriver driver;
    private Select select;

    public enum Instrument {
        BCH_BTC, ETC_BTC, ETH_BTC, BTC_EON, BCH_EON, ETC_EON, ETH_EON
    }

    public enum TradingFlag {
        LIMIT_CANCEL, NONE, MARKET_LIMIT_CANCEL, MARKET_CANCEL, CANCEL, BLOCKED, EXPIRED, DELETED, OBSOLETE
    }

    private enum Generator {
        BOTH, NONE, ACTIVE, PASSIVE
    }


    private void waitDuringPageUpdate(int timeout) {

        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void openExchangeServerInstrumentPage(){

        System.setProperty("webdriver.gecko.driver","/home/tester/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://" + LOGIN_EXCHANGE_SERVER_INSTRUMENT + ":" + PASSWORD_EXCHANGE_SERVER_INSTRUMENT + "@" + URL_EXCHANGE_SERVER_INSTRUMENT);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    private void closeExchangeServerInstrumentPage() {

         driver.quit();

     }

    public void setTradingAvailabilityForInstrument(Instrument instrument, TradingFlag tradingFlag) {

        openExchangeServerInstrumentPage();
        switch (instrument) {

            case BCH_BTC:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectTradingFlagBchBtc(driver));
                select.selectByVisibleText(tradingFlag.toString());
                ExchangeServerInstrumentPage.btn_UpdateTradingFlagBchBtc(driver).click();
                break;
            case BCH_EON:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectTradingFlagBchEon(driver));
                select.selectByVisibleText(tradingFlag.toString());
                ExchangeServerInstrumentPage.btn_UpdateTradingFlagBchEon(driver).click();
                break;
            case ETC_BTC:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectTradingFlagEtcBtc(driver));
                select.selectByVisibleText(tradingFlag.toString());
                ExchangeServerInstrumentPage.btn_UpdateTradingFlagEtcBtc(driver).click();
                break;
            case ETC_EON:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectTradingFlagEtcEon(driver));
                select.selectByVisibleText(tradingFlag.toString());
                ExchangeServerInstrumentPage.btn_UpdateTradingFlagEtcEon(driver).click();
                break;
            case ETH_BTC:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectTradingFlagEthBtc(driver));
                select.selectByVisibleText(tradingFlag.toString());
                ExchangeServerInstrumentPage.btn_UpdateTradingFlagEthBtc(driver).click();
                break;
            case ETH_EON:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectTradingFlagEthEon(driver));
                select.selectByVisibleText(tradingFlag.toString());
                ExchangeServerInstrumentPage.btn_UpdateTradingFlagEthEon(driver).click();
                break;
            case BTC_EON:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectTradingFlagBtcEon(driver));
                select.selectByVisibleText(tradingFlag.toString());
                ExchangeServerInstrumentPage.btn_UpdateTradingFlagBtcEon(driver).click();
                break;
        }
        closeExchangeServerInstrumentPage();
    }


     public void setTradingAvailabilityForExchange(TradingFlag tradingFlag) {

         openExchangeServerInstrumentPage();
         select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectTradingFlagXCCX(driver));
         select.selectByVisibleText(tradingFlag.toString());
         ExchangeServerInstrumentPage.btn_UpdateTradingFlagXCCX(driver).click();
         closeExchangeServerInstrumentPage();

     }

     public void switchOnGeneratorForInstrument(boolean isBrowserClosed, Instrument instrument, String divisor, String price, String activeWrks, String passiveWrks) {

         if (isBrowserClosed)
             openExchangeServerInstrumentPage();
             switch (instrument) {
                 case BCH_BTC:
                     select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorBchBtc(driver));
                     select.selectByVisibleText(Generator.BOTH.toString());
                     ExchangeServerInstrumentPage.txtbx_DivisorGeneratorBchBtc(driver).sendKeys(divisor);
                     ExchangeServerInstrumentPage.txtbx_PriceGeneratorBchBtc(driver).sendKeys(price);
                     ExchangeServerInstrumentPage.txtbx_ActiveWorksGeneratorBchBtc(driver).sendKeys(activeWrks);
                     ExchangeServerInstrumentPage.txtbx_PassiveWorksGeneratorBchBtc(driver).sendKeys(passiveWrks);
                     ExchangeServerInstrumentPage.btn_UpdateGeneratorBchBtc(driver).click();
                     waitDuringPageUpdate(4000);
                     break;
                 case BCH_EON:
                     select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorBchEon(driver));
                     select.selectByVisibleText(Generator.BOTH.toString());
                     ExchangeServerInstrumentPage.txtbx_DivisorGeneratorBchEon(driver).sendKeys(divisor);
                     ExchangeServerInstrumentPage.txtbx_PriceGeneratorBchEon(driver).sendKeys(price);
                     ExchangeServerInstrumentPage.txtbx_ActiveWorksGeneratorBchEon(driver).sendKeys(activeWrks);
                     ExchangeServerInstrumentPage.txtbx_PassiveWorksGeneratorBchEon(driver).sendKeys(passiveWrks);
                     ExchangeServerInstrumentPage.btn_UpdateGeneratorBchEon(driver).click();
                     waitDuringPageUpdate(4000);
                     break;
                 case BTC_EON:
                     select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorBtcEon(driver));
                     select.selectByVisibleText(Generator.BOTH.toString());
                     ExchangeServerInstrumentPage.txtbx_DivisorGeneratorBtcEon(driver).sendKeys(divisor);
                     ExchangeServerInstrumentPage.txtbx_PriceGeneratorBtcEon(driver).sendKeys(price);
                     ExchangeServerInstrumentPage.txtbx_ActiveWorksGeneratorBtcEon(driver).sendKeys(activeWrks);
                     ExchangeServerInstrumentPage.txtbx_PassiveWorksGeneratorBtcEon(driver).sendKeys(passiveWrks);
                     ExchangeServerInstrumentPage.btn_UpdateGeneratorBtcEon(driver).click();
                     waitDuringPageUpdate(4000);
                     break;
                 case ETC_BTC:
                     select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorEtcBtc(driver));
                     select.selectByVisibleText(Generator.BOTH.toString());
                     ExchangeServerInstrumentPage.txtbx_DivisorGeneratorEtcBtc(driver).sendKeys(divisor);
                     ExchangeServerInstrumentPage.txtbx_PriceGeneratorEtcBtc(driver).sendKeys(price);
                     ExchangeServerInstrumentPage.txtbx_ActiveWorksGeneratorEtcBtc(driver).sendKeys(activeWrks);
                     ExchangeServerInstrumentPage.txtbx_PassiveWorksGeneratorEtcBtc(driver).sendKeys(passiveWrks);
                     ExchangeServerInstrumentPage.btn_UpdateGeneratorEtcBtc(driver).click();
                     waitDuringPageUpdate(4000);
                     break;
                 case ETC_EON:
                     select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorEtcEon(driver));
                     select.selectByVisibleText(Generator.BOTH.toString());
                     ExchangeServerInstrumentPage.txtbx_DivisorGeneratorEtcEon(driver).sendKeys(divisor);
                     ExchangeServerInstrumentPage.txtbx_PriceGeneratorEtcEon(driver).sendKeys(price);
                     ExchangeServerInstrumentPage.txtbx_ActiveWorksGeneratorEtcEon(driver).sendKeys(activeWrks);
                     ExchangeServerInstrumentPage.txtbx_PassiveWorksGeneratorEtcEon(driver).sendKeys(passiveWrks);
                     ExchangeServerInstrumentPage.btn_UpdateGeneratorEtcEon(driver).click();
                     waitDuringPageUpdate(4000);
                     break;
                 case ETH_BTC:
                     select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorEthBtc(driver));
                     select.selectByVisibleText(Generator.BOTH.toString());
                     ExchangeServerInstrumentPage.txtbx_DivisorGeneratorEthBtc(driver).sendKeys(divisor);
                     ExchangeServerInstrumentPage.txtbx_PriceGeneratorEthBtc(driver).sendKeys(price);
                     ExchangeServerInstrumentPage.txtbx_ActiveWorksGeneratorEthBtc(driver).sendKeys(activeWrks);
                     ExchangeServerInstrumentPage.txtbx_PassiveWorksGeneratorEthBtc(driver).sendKeys(passiveWrks);
                     ExchangeServerInstrumentPage.btn_UpdateGeneratorEthBtc(driver).click();
                     waitDuringPageUpdate(4000);
                     break;
                 case ETH_EON:
                     select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorEthEon(driver));
                     select.selectByVisibleText(Generator.BOTH.toString());
                     ExchangeServerInstrumentPage.txtbx_DivisorGeneratorEthEon(driver).sendKeys(divisor);
                     ExchangeServerInstrumentPage.txtbx_PriceGeneratorEthEon(driver).sendKeys(price);
                     ExchangeServerInstrumentPage.txtbx_ActiveWorksGeneratorEthEon(driver).sendKeys(activeWrks);
                     ExchangeServerInstrumentPage.txtbx_PassiveWorksGeneratorEthEon(driver).sendKeys(passiveWrks);
                     ExchangeServerInstrumentPage.btn_UpdateGeneratorEthEon(driver).click();
                     waitDuringPageUpdate(4000);
                     break;
                     default:
                         System.err.println("Instrument " + instrument.toString() + " is not found!");
                         break;

         }

         if (isBrowserClosed)
             closeExchangeServerInstrumentPage();

     }

    public void switchOffGeneratorForInstrument(boolean isBrowserClosed, Instrument instrument) {

        if (isBrowserClosed)
            openExchangeServerInstrumentPage();

        switch (instrument) {
            case BCH_BTC:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorBchBtc(driver));
                select.selectByVisibleText(Generator.NONE.toString());
                ExchangeServerInstrumentPage.btn_UpdateGeneratorBchBtc(driver).click();
                waitDuringPageUpdate(4000);
                break;
            case BCH_EON:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorBchEon(driver));
                select.selectByVisibleText(Generator.NONE.toString());
                ExchangeServerInstrumentPage.btn_UpdateGeneratorBchEon(driver).click();
                waitDuringPageUpdate(4000);
                break;
            case BTC_EON:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorBtcEon(driver));
                select.selectByVisibleText(Generator.NONE.toString());
                ExchangeServerInstrumentPage.btn_UpdateGeneratorBtcEon(driver).click();
                waitDuringPageUpdate(4000);
                break;
            case ETC_BTC:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorEtcBtc(driver));
                select.selectByVisibleText(Generator.NONE.toString());
                ExchangeServerInstrumentPage.btn_UpdateGeneratorEtcBtc(driver).click();
                waitDuringPageUpdate(4000);
                break;
            case ETC_EON:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorEtcEon(driver));
                select.selectByVisibleText(Generator.NONE.toString());
                ExchangeServerInstrumentPage.btn_UpdateGeneratorEtcEon(driver).click();
                waitDuringPageUpdate(4000);
                break;
            case ETH_BTC:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorEthBtc(driver));
                select.selectByVisibleText(Generator.NONE.toString());
                ExchangeServerInstrumentPage.btn_UpdateGeneratorEthBtc(driver).click();
                waitDuringPageUpdate(4000);
                break;
            case ETH_EON:
                select = new Select(ExchangeServerInstrumentPage.drpdwn_SelectGeneratorEthEon(driver));
                select.selectByVisibleText(Generator.NONE.toString());
                ExchangeServerInstrumentPage.btn_UpdateGeneratorEthEon(driver).click();
                waitDuringPageUpdate(4000);
                break;
                default:
                    System.err.println("Instrument " + instrument.toString() + " is not found!");
                    break;
        }

        if (isBrowserClosed)
            closeExchangeServerInstrumentPage();

    }

     public void setGeneratorAvailability(boolean isAvailable) {

         openExchangeServerInstrumentPage();
         if (isAvailable) {
             switchOnGeneratorForInstrument(false, Instrument.BCH_BTC, "10000", "1", "2", "20" );
             switchOnGeneratorForInstrument(false, Instrument.BCH_EON, "10000", "1", "2", "20" );
             switchOnGeneratorForInstrument(false, Instrument.BTC_EON, "10000", "1", "2", "20" );
             switchOnGeneratorForInstrument(false, Instrument.ETC_BTC, "1000", "1", "2", "20" );
             switchOnGeneratorForInstrument(false, Instrument.ETC_EON, "10", "1", "2", "20" );
             switchOnGeneratorForInstrument(false, Instrument.ETH_BTC, "1", "1", "2", "20" );
             switchOnGeneratorForInstrument(false, Instrument.ETH_EON, "1", "1", "2", "20" );
         } else {
             switchOffGeneratorForInstrument(false, Instrument.BCH_BTC);
             switchOffGeneratorForInstrument(false, Instrument.BCH_EON);
             switchOffGeneratorForInstrument(false, Instrument.BTC_EON);
             switchOffGeneratorForInstrument(false, Instrument.ETC_BTC);
             switchOffGeneratorForInstrument(false, Instrument.ETC_EON);
             switchOffGeneratorForInstrument(false, Instrument.ETH_BTC);
             switchOffGeneratorForInstrument(false, Instrument.ETH_EON);
         }

         closeExchangeServerInstrumentPage();

     }


}

