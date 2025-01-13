package Pages;

import HelperMethods.ElementsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    WebDriver driver;
    ElementsMethods elementsMethods;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementsMethods = new ElementsMethods(driver);
    }

    // Web elements identification present in Home Page
//    @FindBy(xpath ="//h5[text()='Forms']");
//    List<WebElement> elements;


}
