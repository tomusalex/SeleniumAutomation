package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;

import static Utils.Utils.getAlphaNumericString;
import static Utils.Utils.randomNumber;
import static Utils.Utils.generateRandomEmailAddress;

public class PracticeFormTests {
    public WebDriver driver;

    @Test
    public void practiceFormAutomationMethod() {
        // open a browser
        driver = new ChromeDriver();

        // accesing a web page
        driver.get("https://demoqa.com/");

        // maximize browser
        driver.manage().window().maximize();

        // declare an element
        WebElement formField = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formField.click();

        WebElement practiceForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceForm.click();

        WebElement firstNameField = driver.findElement(By.id("firstName"));
//        String firstNameValue = "Joe";
        firstNameField.sendKeys(getAlphaNumericString(6));

        WebElement lastNameField = driver.findElement(By.id("lastName"));
//        String lastNameValue = "Doe";
        lastNameField.sendKeys(getAlphaNumericString(8));

        WebElement emailField = driver.findElement(By.id("userEmail"));
        String emailValue = "email@domain.com";
        emailField.sendKeys(generateRandomEmailAddress(10));

        WebElement maleRadioButtom = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleRadioButtom = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherMaleRadioButtom = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String genderValue = "Other";
        if (genderValue.equals("Male")) {
            maleRadioButtom.click();
        } else if (genderValue.equals("Female")) {
            femaleRadioButtom.click();
        } else if (genderValue.equals("Other")) {
            otherMaleRadioButtom.click();
        }

        WebElement phoneNumberField = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        phoneNumberField.sendKeys(randomNumber());

        WebElement subjectField = driver.findElement(By.id("subjectsInput"));
        String subjectValue = "Social";
        subjectField.sendKeys(subjectValue);
        subjectField.sendKeys(Keys.ENTER);

        WebElement sportRadioButton = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement readingRadioButton = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
        WebElement musicRadioButton = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));

//        String hobbiesValue = "Sports";
//        if (hobbiesValue.equals("Sports")) {
//            sportRadioButton.click();
//        } else if (hobbiesValue.equals("Reading")) {
//            readingRadioButton.click();
//        } else if (hobbiesValue.equals("Music")) {
//            musicRadioButton.click();
//        }

        WebElement pictureButton = driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/Picture1.png");
        pictureButton.sendKeys(file.getAbsolutePath());

        WebElement addresField = driver.findElement(By.id("currentAddress"));
        addresField.sendKeys(getAlphaNumericString(30));

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
        submitButton.click();

        //        WebElement birthDateField = driver.findElement(By.id("dateOfBirthInput"));

    }


    }
