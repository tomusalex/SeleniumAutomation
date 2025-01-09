package HelperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class ElementsMethods {

    WebDriver driver;
    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void fillElement(WebElement element, String value){
        element.sendKeys(value);
    }

    public void uploadPhotos(WebElement element){
        File file = new File("src/test/resources/Picture1.png");
        element.sendKeys(file.getAbsolutePath());
    }
}
