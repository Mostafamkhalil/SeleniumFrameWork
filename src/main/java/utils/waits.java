package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waits {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebDriverWait lazyWait;

    public waits(WebDriver driver){
        this.driver =driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        lazyWait = new WebDriverWait(driver,Duration.ofMinutes(1));
    }

    public void waitForClickability(By locator){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    public void waitForClickability(WebElement element){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void waitForClickability_lazyWait(By locator){
        try {
            lazyWait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    public void waitForPresence(By locator){
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void waitForVisibility(By locator){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void waitForVisibility(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void waitForElementNotToBePresent(By locator){
        try {
            wait.until(ExpectedConditions.numberOfElementsToBeLessThan(locator,1));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void waitForAlert(){
        try {
            wait.until(ExpectedConditions.alertIsPresent());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
