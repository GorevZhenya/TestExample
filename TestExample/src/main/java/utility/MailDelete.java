package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailDelete {

    private static WebDriverWait wait = null;

    public static void deleteMail() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/rem/Autotests/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://mail.ofbox.ru:8443/roundcube/");

        driver.findElement(By.id("rcmloginuser")).sendKeys("rustam@corp.clarus.tech");

        driver.findElement(By.id("rcmloginpwd")).sendKeys("test");

        driver.findElement(By.id("rcmloginsubmit")).click();


        Actions action = new Actions(driver);

        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'DEVELOMPENT: Sign Up')]")));

        driver.findElement(By.xpath("//span[contains(text(),'DEVELOMPENT: Sign Up Confirmation')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'DEVELOMPENT: Sign Up')]")));

        driver.findElement(By.id("rcmbtn111")).click();

      //  driver.findElement(By.xpath("//table[@id='messagelist']/tbody/tr[i]"));


    }
}
