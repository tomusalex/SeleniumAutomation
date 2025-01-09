package HelperMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;

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

    public void selectElementFromListByText(List<WebElement> elementsList , String value){
        for (int i=0; i<elementsList.size(); i++){
            if (elementsList.get(i).getText().equals(value)){
                clickOnElement(elementsList.get(i));
            }
        }
    }
}
