package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.FramesMethods;
import HelperMethods.JavaScriptMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesTest {
    WebDriver driver;
    ElementsMethods elementsMethods;
    FramesMethods framesMethods;

    @Test
    public void automationMethod() throws InterruptedException {

        // open a browser
        driver = new ChromeDriver();

        // accesing a web page
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

//        javaScriptMethods = new JavaScriptMethods(driver);

    }
}
