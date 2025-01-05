package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.List;

@Test
public class SortableTests {
    public WebDriver driver;


    public void SortableAutomationTests() {
        driver = new FirefoxDriver();
        driver.get("https://demoqa.com/sortable");
        driver.manage().window().maximize();
        List<WebElement> list= driver.findElements(By.xpath("//div[@id='demo-tabpane-list']//div[@class='list-group-item list-group-item-action']"));
        Actions actions = new Actions(driver);
        for (int i=0; i<list.size()-1; i++){
            WebElement webElement=list.get(i);
            WebElement nextElement=list.get(i++);
            System.out.println("Numarul elementului este:"+webElement.getText());
            actions.clickAndHold(webElement)
                    .moveToElement(nextElement)
                    .release()
                    .build()
                    .perform();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
         

    }
}
