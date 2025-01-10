package HelperMethods;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WindowsMethods {
    WebDriver driver;

    public WindowsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToOpenedTab(){
        // driver.getWindowHandles() -> returneaza toate windowsurile deschise
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
    }

    public void switchToMainTab(){
        switchToMain();
    }

    public void switchToOpenedWindows(){
        switchToOpenedTab();
    }

    private void close(){
        driver.close();
    }

    public void closeTab(){
        close();
    }

    public void closeDriver(){
        driver.close();
    }

    public void closeWindows(){
        close();
    }
    public void switchToMainWindows(){
        switchToMain();
    }
    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void maximizeWindows(){
        driver.manage().window().maximize();
    }

    public void switchToMain(){
        // driver.getWindowHandles() -> returneaza toate windowsurile deschise
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(0));
    }

}
