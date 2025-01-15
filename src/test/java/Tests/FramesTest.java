package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.FramesMethods;
import HelperMethods.JavaScriptHelpers;
import HelperMethods.WindowsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesTest {
    WebDriver driver;
    ElementsMethods elementsMethods;
    FramesMethods framesMethods;
    WindowsMethods windowsMethods;
    JavaScriptHelpers javaScriptMethods;

    @Test
    public void automationMethod() throws InterruptedException {

        // open a browser
        driver = new ChromeDriver();
        elementsMethods = new ElementsMethods(driver);
        windowsMethods = new WindowsMethods(driver);
        framesMethods = new FramesMethods(driver);

        // accesing a web page
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

//        javaScriptMethods = new JavaScriptMethods(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        // declare an element
        WebElement alertsFrameWindowsField = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementsMethods.clickOnElement(alertsFrameWindowsField);
        WebElement browserWindowsElement = driver.findElement(By.xpath("//span[text()='Frames']"));
        elementsMethods.clickOnElement(browserWindowsElement);

        // change focus to the new frame
        WebElement frame1Element = driver.findElement(By.id("frame1"));
        framesMethods.switchToFrames(frame1Element);


        WebElement sampleHeadingFrameElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("The text from the frames is: "+ sampleHeadingFrameElement.getText());

        // switch focus to main screen
        windowsMethods.switchToMain();

        // change focus to the new frame
        WebElement frame2Element = driver.findElement(By.id("frame2"));
        framesMethods.switchToFrames(frame2Element);

        js.executeScript("window.scrollBy(200,200)");
        WebElement sampleFrameElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("The text from the last frames is: "+ sampleFrameElement.getText());

        driver.close();
    }
}
