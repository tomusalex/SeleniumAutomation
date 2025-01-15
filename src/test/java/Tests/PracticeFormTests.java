package Tests;

import HelperMethods.ElementsMethods;
import HelperMethods.WindowsMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests {
    public WebDriver driver;
    public ElementsMethods elementsMethods;
    public WindowsMethods windowsMethods;
    @Test
    public void practiceFormAutomationMethod() {

        // open a browser
        driver = new ChromeDriver();
        elementsMethods = new ElementsMethods(driver);

        // accesing a web page
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

        // declare an element
        List<WebElement> fieldsList = driver.findElements(By.xpath("//h5"));
        elementsMethods.selectElementFromListByText(fieldsList, "Forms");

        List <WebElement> elementsTable = driver.findElements(By.xpath("//span[@class='text']"));
        elementsMethods.selectElementFromListByText(elementsTable,"Practice Form");

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        elementsMethods.fillElement(firstNameField, "Joe");

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        elementsMethods.fillElement(lastNameField, "Doe");

        WebElement emailField = driver.findElement(By.id("userEmail"));
        elementsMethods.fillElement(emailField, "email@domain.com");

        WebElement maleRadioButtom = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleRadioButtom = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherMaleRadioButtom = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        List<WebElement> genderList = new ArrayList<>();
        genderList.add(maleRadioButtom);
        genderList.add(femaleRadioButtom);
        genderList.add(otherMaleRadioButtom);
        elementsMethods.selectElementFromListByText(genderList,"Male");


        WebElement phoneNumberField = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        elementsMethods.fillElement(phoneNumberField, "0333456543");

        WebElement subjectField = driver.findElement(By.id("subjectsInput"));
        elementsMethods.fillElement(subjectField,"Social");

        subjectField.sendKeys(Keys.ENTER);

        WebElement sportRadioButton = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement readingRadioButton = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
        WebElement musicRadioButton = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));



        List<WebElement> activityList = new ArrayList<>();
        activityList.add(sportRadioButton);
        activityList.add(readingRadioButton);
        activityList.add(musicRadioButton);
        elementsMethods.selectElementFromListByText(activityList,"Sport");

        WebElement addPicture = driver.findElement(By.id("uploadPicture"));
        elementsMethods.uploadPhotos(addPicture);

        WebElement addressField = driver.findElement(By.id("currentAddress"));
        elementsMethods.fillElement(addressField,"Random Address");

//        scrollDown();
        WebElement stateField = driver.findElement(By.id("react-select-3-input"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", stateField);
        String stateValue = "Haryana";
        stateField.sendKeys(stateValue);
        stateField.sendKeys(Keys.ENTER);

        WebElement cityField = driver.findElement(By.id("react-select-4-input"));
        executor.executeScript("arguments[0].click();", cityField);
        String cityValue = "Karnal";
        cityField.sendKeys(cityValue);
        cityField.sendKeys(Keys.ENTER);

        WebElement submitButton= driver.findElement(By.id("submit"));
        elementsMethods.clickOnElement(submitButton);

        //        WebElement birthDateField = driver.findElement(By.id("dateOfBirthInput"));
        driver.close();
    }


    }
