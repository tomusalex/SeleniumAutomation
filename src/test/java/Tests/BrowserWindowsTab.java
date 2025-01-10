package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import HelperMethods.WindowsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTab {
    public WebDriver driver;
    public WindowsMethods windowsMethods;
    public JavaScriptMethods javaScriptMethods;
    public ElementsMethods elementsMethods;
    @Test
    public void automationMethod(){
        driver= new ChromeDriver();
        windowsMethods = new WindowsMethods(driver);
        elementsMethods = new ElementsMethods(driver);
//        javaScriptMethods = new JavaScriptMethods(JavascriptExecutor);


        driver.get("https://demoqa.com");
        windowsMethods.implicitWait();
        windowsMethods.maximizeWindows();

//        javaScriptMethods.scrollDown(400);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        // declare an element
        WebElement alertsFrameWindowsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementsMethods.clickOnElement(alertsFrameWindowsField);
        WebElement browserWindowsElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        elementsMethods.clickOnElement(browserWindowsElement);

        // new tab
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        elementsMethods.clickOnElement(newTabButton);
        // change focus to the new tab
        windowsMethods.switchToOpenedTab();
        WebElement samplePageElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("The text from the new tab is:"+ samplePageElement.getText());


        // switch the focus back to main tab
        windowsMethods.switchToMain();
        // new window tab
        WebElement newWindowButton = driver.findElement(By.id("tabButton"));
        elementsMethods.clickOnElement(newWindowButton);
        // switch focus to the new windows
        windowsMethods.switchToOpenedWindows();
        WebElement sampleHeadingElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("The text from the new windows is:"+ sampleHeadingElement.getText());

        driver.close();
    }
}
