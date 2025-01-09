package HelperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesMethods {
    WebDriver driver;

    public FramesMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToFrames(WebElement element){
        // schimba focusul de pe un frame anume
        driver.switchTo().defaultContent();
    }

    public void switchToMainContent(){
        // schimbam focusul pe pagina principala
        driver.switchTo().defaultContent();
    }
}
