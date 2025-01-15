package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelpers;
import HelperMethods.WindowsMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest {
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public JavaScriptHelpers javaScriptMethods;
    public WindowsMethods windowsMethods;

    @Test
    public void alertAutomationMethod() {

        // open a browser
        driver = new ChromeDriver();
        elementsMethods = new ElementsMethods(driver);
//        javaScriptMethods = new JavaScriptMethods();
        windowsMethods =new WindowsMethods(driver);

        // accesing a web page
        driver.get("https://demoqa.com/");

        // wait implicit
        windowsMethods.implicitWait();

        // maximize browser
        windowsMethods.maximizeWindows();

        // declare an element
        WebElement alertsFrameWindowsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementsMethods.clickOnElement(alertsFrameWindowsField);

        WebElement alertsForm = driver.findElement(By.xpath("//span[text()='Alerts']"));
        elementsMethods.clickOnElement(alertsForm);

        // click Button to see alert
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        elementsMethods.clickOnElement(alertButton);
        Alert alertOk = driver.switchTo().alert();
        // ne mutam cu focusul pe alerta
        alertOk.accept();


        //On button click, alert will appear after 5 seconds
        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
        elementsMethods.clickOnElement(timerAlertButton);

        // wait explicit
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alertDelay = driver.switchTo().alert();
        alertOk.accept();


        //On button click, confirm box will appear
        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
        elementsMethods.clickOnElement(confirmButton);
        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();


        //On button click, prompt box will appear
        WebElement promtButton = driver.findElement(By.id("promtButton"));
        elementsMethods.clickOnElement(promtButton);
        Alert alertPromt = driver.switchTo().alert();
        alertPromt.sendKeys("Hello World!");
        alertPromt.accept();
        driver.close();
    }
}
