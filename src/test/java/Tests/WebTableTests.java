package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebTableTests {
    public WebDriver driver;

    @Test
    public void automationMethod() {
        // open a browser
        driver = new ChromeDriver();
        // accesing a web page
        driver.get("https://demoqa.com/");
        // maximize browser
        driver.manage().window().maximize();
       // declare an element
        WebElement elementField = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementField.click();

        WebElement webTablesFields = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesFields.click();

        listSize();
        Assert.assertEquals(listSize(),3);

        WebElement addWebTables = driver.findElement(By.id("addNewRecordButton"));
        addWebTables.click();

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue ="Marin";
        firstNameField.sendKeys(firstNameValue);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        String lastNameValue ="Ionescu";
        lastNameField.sendKeys(lastNameValue);

        WebElement userEmailField = driver.findElement(By.id("userEmail"));
        String userEmailValue ="email@domain.com";
        userEmailField.sendKeys(userEmailValue);

        WebElement ageField = driver.findElement(By.id("age"));
        String ageValue ="35";
        ageField.sendKeys(ageValue);

        WebElement salaryField = driver.findElement(By.id("salary"));
        String salaryValue ="3500";
        salaryField.sendKeys(salaryValue);

        WebElement departmentField = driver.findElement(By.id("department"));
        String departmentValue ="HR";
        departmentField.sendKeys(departmentValue);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        listSize();
        Assert.assertEquals(listSize(),4);
        driver.close();


    }
    public Integer listSize(){
        List<WebElement> tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        int tableElementsSize = tableElements.size();

        System.out.println("dimensiunea listei este:"+tableElementsSize);
        return tableElementsSize;
    }
}
