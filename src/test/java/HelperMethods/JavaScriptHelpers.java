package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptHelpers {
    WebDriver driver;
    JavascriptExecutor javascriptExecutor;

    public JavaScriptHelpers(JavascriptExecutor javascriptExecutor) {
        this.javascriptExecutor = javascriptExecutor;
        this.javascriptExecutor = (JavascriptExecutor) driver;
    }
    public void scroll(int x, int y){
        javascriptExecutor.executeScript("window.scrollBy("+ x +"," + y + ")");
    }

    public void scrollDown(int y){
        scroll(0,y);
    }

    public void scrollRight(int x){
        scroll(x,0);
    }

    public void forceClick(WebElement element){
        javascriptExecutor.executeScript("arguments[0].click()",element);
    }

}
