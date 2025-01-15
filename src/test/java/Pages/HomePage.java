package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    WebDriver driver;
    ElementsMethods elementsMethods;
    JavaScriptHelpers javaScriptHelpers;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this. elementsMethods = new ElementsMethods(driver);
//        this.javaScriptHelpers = new JavaScriptHelpers(driver);
    }

    // Web elements identification present in Home Page
//    @FindBy(xpath ="//h5");
    List<WebElement> elements;

    // method specific for Home page

    public void goToDesiredMenu(List<WebElement> elementsList, String menuValue){
        elementsMethods.selectElementFromListByText(elementsList, menuValue);
    }


}
