package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ElementActions {
    private WebDriver driver;
    private waits wait;

    public ElementActions(WebDriver driver){
        this.driver = driver;
        wait = new waits(driver);
    }

    public WebElement retrieveElement(By locator){
        wait.waitForPresence(locator);
        return driver.findElement(locator);
    }

    public List<WebElement> retrieveElements(By locator){
        wait.waitForPresence(locator);
        return driver.findElements(locator);
    }

    public void clickOnElement(By locator){
        scrollElementIntoView(locator);
        wait.waitForClickability(locator);
        retrieveElement(locator).click();
    }

    public void clickOnElement(WebElement element){
        scrollElementIntoView(element);
        wait.waitForClickability(element);
        element.click();
    }

    public void typeTextInField(By locator,String string){
        scrollElementIntoView(locator);
        wait.waitForClickability(locator);
        retrieveElement(locator).sendKeys(string);
    }
    public void typeTextInField(WebElement element,String string){
        scrollElementIntoView(element);
        wait.waitForClickability(element);
        element.sendKeys();
    }

    public void clearTextInField(WebElement element){
        scrollElementIntoView(element);
        wait.waitForClickability(element);
        element.clear();
    }
    public void clearTextInField(By locator){
        scrollElementIntoView(locator);
        wait.waitForClickability(locator);
        retrieveElement(locator).clear();
    }
    public void scrollElementIntoView(By locator){
        WebElement element = retrieveElement(locator);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,element);
    }

    public void scrollElementIntoView(WebElement element){
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,element);
    }

    public String getTextFromElement(By locator){
        scrollElementIntoView(locator);
        wait.waitForVisibility(locator);
        String errorMsg = retrieveElement(locator).getText();
        return errorMsg;
    }
    public String getTextFromElement(WebElement element){
        scrollElementIntoView(element);
        wait.waitForVisibility(element);
        String errorMsg = element.getText();
        return errorMsg;
    }

    public void selectOptionFromDropdown(By locator, String option){
        scrollElementIntoView(locator);
        wait.waitForClickability(locator);

        Select dropdownElement = new Select(retrieveElement(locator));
        dropdownElement.selectByVisibleText(option);
    }

    public String getSelectedOptionFromDropdown(By locator){
        scrollElementIntoView(locator);
        wait.waitForClickability(locator);

        Select dropdownElement = new Select(retrieveElement(locator));
        return dropdownElement.getFirstSelectedOption().getText();
    }

    public void hoverOverWebElement(WebElement element){
        Actions action = new Actions(driver);
        scrollElementIntoView(element);
        wait.waitForVisibility(element);
        action.moveToElement(element).perform();
    }

    public void hoverOverWebElement(By locator){
        Actions action = new Actions(driver);
        scrollElementIntoView(locator);
        wait.waitForVisibility(locator);
        action.moveToElement(retrieveElement(locator)).perform();
    }

    public boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public boolean isElementDisplayed(By locator){
        return retrieveElement(locator).isDisplayed();
    }

    public void acceptAlert(){
        wait.waitForAlert();
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        wait.waitForAlert();
        driver.switchTo().alert().dismiss();
    }

    public void switchToFrame(By locator){
        scrollElementIntoView(locator);
        driver.switchTo().frame(retrieveElement(locator));
    }

    public void switchToFrame(WebElement element){
        scrollElementIntoView(element);
        driver.switchTo().frame(element);
    }
    public void switchBackToParentFrame(){
        driver.switchTo().parentFrame();
    }



}

