package Utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;


public class Utils {

    // function to generate a random number of ten digits
    public static String randomNumber() {
        Random random = new Random();
        int n = random.nextInt((int) Math.pow(10, 10));
        String randomNumber = String.format("%010d", n);
        return randomNumber;
    }

    // function to generate a random string of length n
    public static String getAlphaNumericString(int n) {

        // choose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static String generateRandomEmailAddress(int param1) {
        String emailAddress = getAlphaNumericString(param1) + "@gmail.com";
        return emailAddress;

    }

}
