package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

import static utility.GlobalVariables.*;

public class SignUpUtility {

    private String aliasOfEmail;
    private String password;
    private WebDriver driver;
    private WebDriverWait wait;

    private String randomString( int lenghtOfString ){

        String symbols = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder( lenghtOfString );
        SecureRandom random = new SecureRandom();

        for( int i = 0; i < lenghtOfString; i++ )
            sb.append( symbols.charAt( random.nextInt(symbols.length()) ) );
        return sb.toString();

    }

    private void openEmailAdminServer() {

        System.setProperty("webdriver.gecko.driver","/home/tester/geckodriver");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 5);
        driver.get(URL_ADMIN_EMAIL_SERVER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.name("fUsername")).sendKeys(LOGIN_ADMIN_EMAIL_SERVER);
        driver.findElement(By.name("fPassword")).sendKeys(PASSWORD_ADMIN_EMAIL_SERVER);
        driver.findElement(By.name("submit")).click();

    }

    private void openEmailServer() {

        System.setProperty("webdriver.gecko.driver","/home/tester/geckodriver");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 5);

        driver.navigate().to(URL_EMAIL_SERVER);

        driver.findElement(By.id("rcmloginuser")).sendKeys(EMAIL);

        driver.findElement(By.id("rcmloginpwd")).sendKeys(PASSWORD);

        driver.findElement(By.id("rcmloginsubmit")).click();

    }


    private void checkText(String text) {

        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(bodyText.contains(text));

    }

    private void openEmail(String emailTopic) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'" + emailTopic + "')]")));
        driver.findElement(By.xpath("//span[contains(text(),'" + emailTopic + "')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + emailTopic + "')]")).click();

    }

    private void deleteEmail(String emailTopic) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'" + emailTopic + "')]")));
        driver.findElement(By.xpath("//span[contains(text(),'" + emailTopic + "')]")).click();
        driver.findElement(By.cssSelector("[class='button delete']")).click();
    }



    public void createAlias() {

        openEmailAdminServer();
        aliasOfEmail = randomString(5);
        password = randomString(5).concat("!!!").concat(randomString(5));
        driver.findElement(By.linkText("Создать алиас")).click();
        driver.findElement(By.name("fAddress")).sendKeys(aliasOfEmail);
        //System.out.println(aliasOfEmail);
        driver.findElement(By.name("fGoto")).sendKeys(EMAIL);
        driver.findElement(By.name("submit")).click();
        aliasOfEmail += "@corp.clarus.tech";
        driver.quit();

    }


    private void checkTextOfEmailSignUpConfirmation() {

        openEmail("DEVELOMPENT: Sign Up Confirmation");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Activate')]")));
        checkText("Welcome to Exscudo!");
        checkText("Click the link below to activate your exchange account:");
        checkText("For security reasons this link will expire in 24 hours.");
        checkText("If you are not the one who has made it, please ignore the letter.");
        checkText("Best regards,");
        checkText("Exscudo Team.");

    }

    private void checkTextOfEmailSignUpConfirmed() {

        openEmail("DEVELOMPENT: Sign Up Confirmed");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Exchange')]")));
        checkText("Welcome to Exscudo!");
        checkText("Your account is now activated.");
        checkText("You may now return to the Exchange.");
        checkText("Best regards,");
        checkText("Exscudo Team.");
    }


    public String getPassword() {

        return password;
    }

    public String getAliasMail() {

        return aliasOfEmail;
    }

    public void confirmRegistration() {

        openEmailServer();
        checkTextOfEmailSignUpConfirmation();
        driver.findElement(By.xpath("//a[contains(text(),'Activate')]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().to(URL_EMAIL_SERVER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'DEVELOMPENT: Sign Up Confirmation')]")));
        deleteEmail("DEVELOMPENT: Sign Up Confirmation");
        driver.quit();

    }

    public void checkEmailSignUpConfirmed() {

        openEmailServer();
        checkTextOfEmailSignUpConfirmed();
        driver.navigate().to(URL_EMAIL_SERVER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'DEVELOMPENT: Sign Up Confirmed')]")));
        deleteEmail("DEVELOMPENT: Sign Up Confirmed");
        driver.quit();

    }
}
